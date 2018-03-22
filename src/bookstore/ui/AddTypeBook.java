/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore.ui;

import bookstore.model.TypeBook;
import bookstore.service.TypeBookService;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author root
 */
public class AddTypeBook extends javax.swing.JDialog {

    /**
     * Creates new form Add
     */
    public AddTypeBook(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public AddTypeBook() {
        super();
    }

    public JTable getJtable1() {
        return jTable1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnFinish = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnAddType = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jSplitPane1.setDividerLocation(80);
        jSplitPane1.setDividerSize(1);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LIST", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(213, 29, 29))); // NOI18N

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "Amount of type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnEdit.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnFinish.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnFinish.setText("Finish");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEdit)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(18, 18, 18)
                .addComponent(btnFinish)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 23, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete)
                    .addComponent(btnFinish)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane1.setRightComponent(jPanel2);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ADD", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(225, 38, 38))); // NOI18N
        jPanel1.setName(""); // NOI18N

        lblName.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        lblName.setText("Name:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        btnAddType.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        btnAddType.setText("AddType");
        btnAddType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblName)
                .addGap(48, 48, 48)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnAddType)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddType))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnAddTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTypeActionPerformed
        // TODO add your handling code here:
        if (txtName.getText().matches("[0-9a-zA-Z áàạảãâấậẩầẫăắằẳẵặđéẻèẽẹêểếềễệìỉíịĩòóỏõọôổốồỗộơởớờỡợùủúụũưửừứựữýỷỵỹỳÁẢẠÀÃẤẦẬẨẪÂĂẲẮẰẴẶĐÉẺÈẸẼÊỂẾỀỆỄÍỈÌỊĨÓÒỎỌÕÔỐỔỒỘỖƠỜỞỚỢỠÚỦÙỤŨƯỪỨỬỰỮÝỶỲỴỸ]+")) {
            if (new TypeBookService().Add(txtName.getText())) {
                JOptionPane.showMessageDialog(null, "Add type book successful !");
                this.loadData();
                txtName.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Add type book failed !");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Invalid name !");
        }

    }//GEN-LAST:event_btnAddTypeActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        //JOptionPane.showMessageDialog(null, jTable1.getSelectedRow());
        if (jTable1.getSelectedRow() != -1) {
//            EditTypeBook dialog = new EditTypeBook();
//            dialog.main();
//            this.loadData();
            String newName = JOptionPane.showInputDialog(null, "Enter new name: ");
            Vector<TypeBook> listType = new TypeBookService().SelectAll();
            if (new TypeBookService().Update(listType.get(jTable1.getSelectedRow()).getId(), newName)) {
                JOptionPane.showMessageDialog(null, "Update successful !");
                this.loadData();
            } else {
                JOptionPane.showMessageDialog(null, "Update failed !");
            }
        }

    }//GEN-LAST:event_btnEditActionPerformed

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnFinishActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (jTable1.getSelectedRow() > -1) {
            int x = JOptionPane.showConfirmDialog(null, "Are you sure to delete? \nNote: removing a type book will remove all books of that type!", "", JOptionPane.YES_NO_OPTION);
            if (x == 0) {
                TypeBookService tbs = new TypeBookService();
                Vector<TypeBook> listTypeBook = new TypeBookService().SelectAll();

                if (tbs.Delete(listTypeBook.get(jTable1.getSelectedRow()).getId())) {
                    JOptionPane.showMessageDialog(null, "Delete successful !");
                    this.loadData();
                } else {
                    JOptionPane.showMessageDialog(null, "Delete failed !");
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "You have not selected a row yet !");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void loadData() {
        Vector<TypeBook> listTypeBook = new TypeBookService().SelectAll();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (TypeBook typeBook : listTypeBook) {
            Vector<Object> object = new Vector<>();
            object.add(typeBook.getId());
            object.add(typeBook.getName());
            object.add(TypeBookService.countBooks(typeBook.getId()));
            model.addRow(object);
        }
    }

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
            java.util.logging.Logger.getLogger(AddTypeBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTypeBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTypeBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTypeBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddTypeBook dialog = new AddTypeBook(new javax.swing.JFrame(), true);
                dialog.loadData();
                dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                dialog.setLocationRelativeTo(null);
                dialog.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddType;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnFinish;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
