
import Entity.StudentInfor;
import Model.StudentInforModel;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author phanh
 */
public class LoadDBToTable extends javax.swing.JFrame {

    /**
     * Creates new form LoadDBToTable
     */
    public LoadDBToTable() {
        initComponents();
        loadFontStyle();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisplay = new javax.swing.JTable();
        txtID = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtGPA = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        cbxDepart = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstSearch = new javax.swing.JList<>();
        lblDisplay = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        cbxSearchAll = new javax.swing.JCheckBox();
        chkIsMale = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblDisplay);

        txtID.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnInsert.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnLoad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLoad.setText("Load");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txtGPA.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane2.setViewportView(txtAddress);

        cbxDepart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("ID:");

        jLabel2.setText("Name:");

        jLabel3.setText("GPA");

        jLabel4.setText("Address");

        txtSearch.setText("jTextField1");

        lstSearch.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(lstSearch);

        lblDisplay.setText("jLabel5");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        cbxSearchAll.setText("Search All");

        chkIsMale.setText("Is Male");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 328, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnInsert)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnUpdate))
                                    .addComponent(cbxSearchAll))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDelete)
                                .addGap(27, 27, 27)
                                .addComponent(btnLoad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(102, 102, 102))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(btnSearch)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkIsMale)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 223, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxDepart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnSearch)
                        .addGap(193, 193, 193))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(chkIsMale)))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsert)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete)
                            .addComponent(btnLoad))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(cbxSearchAll))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(lblDisplay)
                        .addGap(38, 38, 38))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    StudentInforModel studentInforModel = new StudentInforModel();
    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        // TODO add your handling code here:
        try {
            loadStudentTable();
        } catch (Exception ex) {
            Logger.getLogger(LoadDBToTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnLoadActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        float gpa = 0;
        if (txtName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter name!");
        } else if (txtAddress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter address!");
        } else if (txtGPA.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter GPA!");
        } else if (txtID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter ID!");
        } else {
            try {
                gpa = Float.parseFloat(txtGPA.getText());
                if (gpa > 10 || gpa < 0) {
                    JOptionPane.showMessageDialog(null, "GPA must from 0 to 10!");
                    return;
                }

                if (studentInforModel.read(txtID.getText().trim()) != null) {
                    JOptionPane.showMessageDialog(null, "ID existed!");
                    return;
                }

                StudentInfor studentInfor = new StudentInfor(txtName.getText(), chkIsMale.isSelected(), cbxDepart.getSelectedIndex() + 1, gpa, txtAddress.getText(), txtID.getText());
                studentInforModel.insert(studentInfor);

                try {
                    loadStudentTable();
                } catch (Exception ex) {
                    Logger.getLogger(LoadDBToTable.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (Exception e) {
                System.out.println(e);
                if (e instanceof NumberFormatException) {
                    JOptionPane.showMessageDialog(null, "Please enter VALID GPA!");
                } else {
                    JOptionPane.showMessageDialog(null, "Something went wrong...!");

                }
            }
        }

    }//GEN-LAST:event_btnInsertActionPerformed

//    private void Search(){
//        int[] select = lstSearch.getSelectedIndices();
//        int n = select.length;
//        if(n == 0) {}
//        else{
//            String ss = sql + " and ("+SearchField[select[0]] + " like '%" + txtSearch.getText() + "%'";
//            if(n>1){{
//                for(int i = 1; i < n; i++){
//                    ss = ss + " or " + SearchField[select[i]] + " like '%" + txtSearch.getText() + "%'";
//                }
//                ss = ss + ")";
//                System.out.println(ss);
//            }
//        }
//    }
//    }
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
//        Search();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if(tblDisplay.getSelectedRows().length == 0){
            JOptionPane.showMessageDialog(null, "Please choose at least one record!");
            return;
        } else{
            if (JOptionPane.showConfirmDialog(null, "Are you sure!", "thong bao", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                for(int i = 0; i < tblDisplay.getSelectedRows().length; i++){
                    try {
                        String studentId = tblDisplay.getValueAt(i , 5).toString();
                        studentInforModel.delete(studentId);
                    } catch (Exception ex) {
                        Logger.getLogger(LoadDBToTable.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            try {
                loadStudentTable();
            } catch (Exception ex) {
                Logger.getLogger(LoadDBToTable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if(txtAddress.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter Address!");
        } else if(txtGPA.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter GPA!");
        } else if(txtID.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter ID!");
        } else if(txtName.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter Name!");
        }
        
        try {
            float gpa = 0;
            gpa = Float.parseFloat(txtGPA.getText());
            if (gpa > 10 || gpa < 0) {
                JOptionPane.showMessageDialog(null, "GPA must from 0 to 10!");
                 return;
        }
        } catch (Exception e) {
            if (e instanceof NumberFormatException) {
                    JOptionPane.showMessageDialog(null, "Please enter VALID GPA!");
            }
        }
        try {
            if (studentInforModel.read(txtID.getText().trim()) == null) {
                JOptionPane.showMessageDialog(null, "ID not existed!");
                return;
            }
            StudentInfor student = new StudentInfor(txtName.getText(), chkIsMale.isSelected(), cbxDepart.getSelectedIndex(), Float.valueOf(txtGPA.getText()), txtAddress.getText(), txtID.getText());
            studentInforModel.update(student);
            loadStudentTable();
        } catch (Exception ex) {
            Logger.getLogger(LoadDBToTable.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    String[] depart = {"Ki thuat phan mem", "Kinh te", "Marketing", "Do Hoa"};

    private void loadFontStyle() {
        cbxDepart.setModel(new DefaultComboBoxModel<>(depart));
    }
    DefaultTableModel dftm = new DefaultTableModel();
    String[] title = {"Name", "Is male", "Depart", "GPA", "Address", "ID"};
    String[] SearchField = {"s.ID", "s.Name", "s.Gender", "d.Depart", "s.GPA", "s.Address"};

    private void loadStudentTable() throws Exception {
        ArrayList<StudentInfor> students = studentInforModel.readAll();
        dftm.setColumnIdentifiers(title);
        dftm.setRowCount(0);

        try {
            for (int i = 0; i < students.size(); i++) {
                String line = "";
                line += students.get(i).toString();
                String[] row = line.split("\\|");
                dftm.addRow(row);
            }
        } catch (Exception e) {
            System.out.println("Error loading file" + e.getMessage());
        }
        tblDisplay.setModel(dftm);
    }

    //
    //
    private void initLstSearchInt() {
        lstSearch.setModel(new DefaultComboBoxModel<>(title));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(LoadDBToTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadDBToTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadDBToTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadDBToTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoadDBToTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbxDepart;
    private javax.swing.JCheckBox cbxSearchAll;
    private javax.swing.JCheckBox chkIsMale;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblDisplay;
    private javax.swing.JList<String> lstSearch;
    private javax.swing.JTable tblDisplay;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtGPA;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
