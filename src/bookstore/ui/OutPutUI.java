/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.ui;

import bookstore.model.Book;
import bookstore.model.Customer;
import bookstore.model.Managa;
import bookstore.service.BookService;
import bookstore.service.CustomerService;
import bookstore.service.ListBookService;
import bookstore.service.ManagaService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PHAM_HUNG
 */
public class OutPutUI extends javax.swing.JFrame {

    /**
     * Creates new form OutPutUI
     */
    public OutPutUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tablePanel = new javax.swing.JTabbedPane();
        panelSell = new javax.swing.JPanel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        lblcustomername = new javax.swing.JLabel();
        txtcustomername = new javax.swing.JTextField();
        lblcustomerphone = new javax.swing.JLabel();
        lblcustomeraddress = new javax.swing.JLabel();
        txtcustomerphone = new javax.swing.JTextField();
        txtcustomeraddress = new javax.swing.JTextField();
        lblCustomer = new javax.swing.JLabel();
        lblbook = new javax.swing.JLabel();
        lblauthor = new javax.swing.JLabel();
        txtauthor = new javax.swing.JTextField();
        lblbookname = new javax.swing.JLabel();
        txtbookname = new javax.swing.JTextField();
        btnbuy = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        lbltotalmoney = new javax.swing.JLabel();
        lblreplay = new javax.swing.JLabel();
        lblpaid = new javax.swing.JLabel();
        lblcash = new javax.swing.JLabel();
        txttotalmoney = new javax.swing.JTextField();
        txtpaid = new javax.swing.JTextField();
        txtcash = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        lbltotal = new javax.swing.JLabel();
        txtrepay = new javax.swing.JTextField();
        btnpay = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        panelCustomer = new javax.swing.JPanel();
        panelProfit = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuItemLogout = new javax.swing.JMenuItem();
        menuItemExit = new javax.swing.JMenuItem();
        menuEdit = new javax.swing.JMenu();
        menuAboutMe = new javax.swing.JMenu();
        menuItemAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(350);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12), new java.awt.Color(255, 51, 0))); // NOI18N

        lblcustomername.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblcustomername.setText("Customer's name:");

        txtcustomername.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        lblcustomerphone.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblcustomerphone.setText("Customer's phone:");

        lblcustomeraddress.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblcustomeraddress.setText("Customer's address:");

        txtcustomerphone.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        txtcustomeraddress.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        lblCustomer.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        lblCustomer.setForeground(new java.awt.Color(255, 51, 0));
        lblCustomer.setText("Customer");

        lblbook.setFont(new java.awt.Font("Tahoma", 3, 15)); // NOI18N
        lblbook.setForeground(new java.awt.Color(255, 51, 0));
        lblbook.setText("Book");

        lblauthor.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblauthor.setText("Author:");

        txtauthor.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        lblbookname.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblbookname.setText("Book's name:");

        txtbookname.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N

        btnbuy.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnbuy.setText("Buy");
        btnbuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblcustomeraddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblcustomerphone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblcustomername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcustomername)
                    .addComponent(txtcustomerphone, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(txtcustomeraddress, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblbookname)
                    .addComponent(lblauthor, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtauthor, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(txtbookname))
                .addGap(26, 26, 26))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(lblCustomer))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(lblbook, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btnbuy)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblCustomer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcustomername, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcustomername, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcustomeraddress, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcustomeraddress, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcustomerphone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcustomerphone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(lblbook)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbookname, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbookname))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblauthor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtauthor))
                .addGap(30, 30, 30)
                .addComponent(btnbuy)
                .addGap(34, 34, 34))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Books were bought", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12), new java.awt.Color(255, 51, 0))); // NOI18N
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Author", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pay", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 12), new java.awt.Color(255, 51, 0))); // NOI18N

        lbltotalmoney.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lbltotalmoney.setForeground(new java.awt.Color(0, 204, 51));
        lbltotalmoney.setText("Total money:");

        lblreplay.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblreplay.setForeground(new java.awt.Color(0, 204, 0));
        lblreplay.setText("Repay:");

        lblpaid.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblpaid.setForeground(new java.awt.Color(0, 204, 0));
        lblpaid.setText("Amount of money paid:");

        lblcash.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblcash.setForeground(new java.awt.Color(0, 204, 0));
        lblcash.setText("Excess cash:");

        txttotalmoney.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttotalmoney.setText("0");

        txtpaid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtcash.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txttotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txttotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txttotalMouseClicked(evt);
            }
        });

        lbltotal.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lbltotal.setForeground(new java.awt.Color(0, 204, 0));
        lbltotal.setText("Total:");

        txtrepay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnpay.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btnpay.setText("Pay");
        btnpay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpayActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblcash, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblpaid, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltotalmoney, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(lbltotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(lblreplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txttotalmoney)
                            .addComponent(txtpaid)
                            .addComponent(txtcash)
                            .addComponent(txttotal)
                            .addComponent(txtrepay, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnpay)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltotalmoney, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttotalmoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpaid, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcash, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblreplay, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtrepay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnpay)
                    .addComponent(jButton1))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSplitPane1.setRightComponent(jPanel3);

        javax.swing.GroupLayout panelSellLayout = new javax.swing.GroupLayout(panelSell);
        panelSell.setLayout(panelSellLayout);
        panelSellLayout.setHorizontalGroup(
            panelSellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        panelSellLayout.setVerticalGroup(
            panelSellLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, Short.MAX_VALUE)
        );

        tablePanel.addTab("Sell", panelSell);

        javax.swing.GroupLayout panelCustomerLayout = new javax.swing.GroupLayout(panelCustomer);
        panelCustomer.setLayout(panelCustomerLayout);
        panelCustomerLayout.setHorizontalGroup(
            panelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 809, Short.MAX_VALUE)
        );
        panelCustomerLayout.setVerticalGroup(
            panelCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );

        tablePanel.addTab("Customer", panelCustomer);

        javax.swing.GroupLayout panelProfitLayout = new javax.swing.GroupLayout(panelProfit);
        panelProfit.setLayout(panelProfitLayout);
        panelProfitLayout.setHorizontalGroup(
            panelProfitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 809, Short.MAX_VALUE)
        );
        panelProfitLayout.setVerticalGroup(
            panelProfitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
        );

        tablePanel.addTab("Profit", panelProfit);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablePanel)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        menuFile.setText("File");

        menuItemLogout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        menuItemLogout.setText("Logout");
        menuFile.add(menuItemLogout);

        menuItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK));
        menuItemExit.setText("Exit");
        menuFile.add(menuItemExit);

        jMenuBar1.add(menuFile);

        menuEdit.setText("Edit");
        jMenuBar1.add(menuEdit);

        menuAboutMe.setText("About me");

        menuItemAbout.setText("https://www.facebook.com/tuhalang007");
        menuItemAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAboutActionPerformed(evt);
            }
        });
        menuAboutMe.add(menuItemAbout);

        jMenuBar1.add(menuAboutMe);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAboutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemAboutActionPerformed

    private void btnbuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuyActionPerformed
        // TODO add your handling code here:
        if (txtcustomername.getText().matches("[0-9a-zA-Z áàạảãâấậẩầẫăắằẳẵặđéẻèẽẹêểếềễệìỉíịĩòóỏõọôổốồỗộơởớờỡợùủúụũưửừứựữýỷỵỹỳÁẢẠÀÃẤẦẬẨẪÂĂẲẮẰẴẶĐÉẺÈẸẼÊỂẾỀỆỄÍỈÌỊĨÓÒỎỌÕÔỐỔỒỘỖƠỜỞỚỢỠÚỦÙỤŨƯỪỨỬỰỮÝỶỲỴỸ]+")) {
            if (txtcustomeraddress.getText().matches("[0-9a-zA-Z áàạảãâấậẩầẫăắằẳẵặđéẻèẽẹêểếềễệìỉíịĩòóỏõọôổốồỗộơởớờỡợùủúụũưửừứựữýỷỵỹỳÁẢẠÀÃẤẦẬẨẪÂĂẲẮẰẴẶĐÉẺÈẸẼÊỂẾỀỆỄÍỈÌỊĨÓÒỎỌÕÔỐỔỒỘỖƠỜỞỚỢỠÚỦÙỤŨƯỪỨỬỰỮÝỶỲỴỸ]+")) {
                if (txtcustomerphone.getText().matches("[0-9+]+")) {
                    Book book = new BookService().searchByNameAndAuthor(txtbookname.getText(), txtauthor.getText());
                    Customer customer = new Customer();
                    customer.setAddress(txtcustomeraddress.getText());
                    customer.setName(txtcustomername.getText());
                    customer.setPhone(txtcustomerphone.getText());
                    new CustomerService().Add(customer);
                    new ListBookService().Add(new CustomerService().getIdCustomer(txtcustomername.getText(), txtcustomerphone.getText(), txtcustomeraddress.getText()), book.getId());
                    if (book != null && book.getName() != null) {
                        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                        Vector<Object> obj = new Vector<Object>();
                        obj.add(book.getId());
                        obj.add(book.getName());
                        obj.add(book.getAuthor());
                        obj.add(book.getPrice());
                        dtm.addRow(obj);
                        int total = Integer.parseInt(txttotalmoney.getText()) + book.getPrice();
                        txttotalmoney.setText(total + "");
                        txtbookname.setText("");
                        txtauthor.setText("");
                    }
                }
            }
        }
    }//GEN-LAST:event_btnbuyActionPerformed

    private void txttotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttotalMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_txttotalMouseClicked

    private void btnpayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpayActionPerformed
        // TODO add your handling code here:
        if (!txttotal.getText().equals("")) {

            Managa managa = new Managa();
            managa.setTotalMoney(Integer.parseInt(txttotal.getText()));
            Date today = new Date(System.currentTimeMillis());
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
            String dateInString = sdf.format(today.getTime());

            managa.setIdcustomer(new CustomerService().getIdCustomer(txtcustomername.getText(), txtcustomerphone.getText(), txtcustomeraddress.getText()));

            try {
                managa.setDateBuy(sdf.parse(dateInString));
            } catch (ParseException ex) {
                Logger.getLogger(OutPutUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (new ManagaService().Add(managa)) {
                JOptionPane.showMessageDialog(null, "Pay successful !");
                txttotalmoney.setText("0");
                txtcash.setText("");
                txtpaid.setText("");
                txttotal.setText("");
                txtrepay.setText("");
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setNumRows(0);
                this.btnpay.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(null, "Pay failed !");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Error !");
        }

    }//GEN-LAST:event_btnpayActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (!txtpaid.getText().equals("") && !txtrepay.getText().equals("")) {
            int total = Integer.parseInt(txtpaid.getText()) - Integer.parseInt(txtrepay.getText());
            txttotal.setText(total + "");
            if (total < Integer.parseInt(txttotalmoney.getText())) {
                JOptionPane.showMessageDialog(null, "You made a mistake !\nPlease check back immediately !");
                btnpay.setEnabled(false);
            } else {
                btnpay.setEnabled(true);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OutPutUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OutPutUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OutPutUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OutPutUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                OutPutUI ui = new OutPutUI();
                ui.setLocationRelativeTo(null);
                ui.txttotal.setEditable(false);
                ui.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuy;
    private javax.swing.JButton btnpay;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCustomer;
    private javax.swing.JLabel lblauthor;
    private javax.swing.JLabel lblbook;
    private javax.swing.JLabel lblbookname;
    private javax.swing.JLabel lblcash;
    private javax.swing.JLabel lblcustomeraddress;
    private javax.swing.JLabel lblcustomername;
    private javax.swing.JLabel lblcustomerphone;
    private javax.swing.JLabel lblpaid;
    private javax.swing.JLabel lblreplay;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JLabel lbltotalmoney;
    private javax.swing.JMenu menuAboutMe;
    private javax.swing.JMenu menuEdit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuItemAbout;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JMenuItem menuItemLogout;
    private javax.swing.JPanel panelCustomer;
    private javax.swing.JPanel panelProfit;
    private javax.swing.JPanel panelSell;
    private javax.swing.JTabbedPane tablePanel;
    private javax.swing.JTextField txtauthor;
    private javax.swing.JTextField txtbookname;
    private javax.swing.JTextField txtcash;
    private javax.swing.JTextField txtcustomeraddress;
    private javax.swing.JTextField txtcustomername;
    private javax.swing.JTextField txtcustomerphone;
    private javax.swing.JTextField txtpaid;
    private javax.swing.JTextField txtrepay;
    private javax.swing.JTextField txttotal;
    private javax.swing.JTextField txttotalmoney;
    // End of variables declaration//GEN-END:variables
}
