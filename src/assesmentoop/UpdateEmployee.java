
package assesmentoop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.UIManager.getString;

public class UpdateEmployee extends javax.swing.JFrame {

    Connection con = null;
    Statement stmt = null; 
    ResultSet rs =null;
    
    public UpdateEmployee() {
        initComponents();
        con = database.connection();
        getDesignations();
        getDepartments();
        
        
   
    
    }
     private void getDesignations() {
        String query = "SELECT Name FROM designations";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()) {
                designation.addItem(rs.getString("Name"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void getDepartments(){
        String query = "SELECT Name From departments";
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()){
                department.addItem(rs.getString("Name"));
                
            }
        }catch(SQLException ex){
             Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        epf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        dob = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nic1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        designation = new javax.swing.JComboBox<>();
        department = new javax.swing.JComboBox<>();
        gender = new javax.swing.JComboBox<>();
        update = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Update Employees");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 16, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Username");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 142, 114, -1));
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 146, 605, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("EpfNo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 102, -1, -1));
        jPanel1.add(epf, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 106, 200, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 102));
        jLabel9.setText("Designation");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 428, 127, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Department");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 472, 127, -1));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 102, 102));
        jButton5.setText("Back");
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(813, 542, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("NIC");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 182, 37, -1));
        jPanel1.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 216, 200, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Gender");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 253, -1, -1));
        jPanel1.add(nic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 186, 605, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Date Of Birth");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 214, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 102));
        jLabel8.setText("Address");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 291, -1, -1));
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 296, 605, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("Contact No");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 377, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("Email");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 334, -1, -1));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 337, 605, -1));
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 377, 605, -1));

        designation.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        designation.setForeground(new java.awt.Color(0, 102, 102));
        designation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Designations" }));
        jPanel1.add(designation, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 432, 201, -1));

        department.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        department.setForeground(new java.awt.Color(0, 102, 102));
        department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Departments" }));
        jPanel1.add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 476, 201, -1));

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Male", "Female" }));
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 256, 200, -1));

        update.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        update.setForeground(new java.awt.Color(0, 102, 102));
        update.setText("Update ");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 542, 130, -1));

        reset.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        reset.setForeground(new java.awt.Color(0, 102, 102));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 540, -1, -1));

        delete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        delete.setForeground(new java.awt.Color(0, 102, 102));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 542, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\iufiudfdgiodlgdiolk\\Downloads\\3-PhotoRoom.png")); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 460, 350));

        searchBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(0, 102, 102));
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 925, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try
        {
            stmt = con.createStatement();

            int eepfno = Integer.parseInt(epf.getText ());
            String ename = username.getText();
            String enic = nic1.getText();
            String edob = dob.getText();
            String egender =(String) gender.getSelectedItem();
            String eaddress = address.getText();
            String eemail = email.getText();
            int econtact = Integer.parseInt(contact.getText());
            String edesignation =(String) designation.getSelectedItem();
            String edepartment =(String) department.getSelectedItem();

            String query = "UPDATE addemployee SET  username =?, nic =?, dob=?, gender=?, address=?, email=?, contact=?, designation=?, department=? WHERE epfno = ?";

            PreparedStatement preparedStmt = con.prepareStatement(query);

           
            preparedStmt.setString(1, ename);
            preparedStmt.setString(2, enic);
            preparedStmt.setString(3, edob);
            preparedStmt.setString(4, egender);
            preparedStmt.setString(5, eaddress);
            preparedStmt.setString(6, eemail);
            preparedStmt.setInt(7, econtact);
            preparedStmt.setString(8, edesignation);
            preparedStmt.setString(9, edepartment);
            preparedStmt.setInt(10, eepfno);
            boolean up = preparedStmt.execute();
            
            if(up){
                
                 JOptionPane.showMessageDialog(null, "Updated Succesfully!");
            }else{
                  JOptionPane.showMessageDialog(null, "Error!");
            }
                
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
                    epf.setText("");
                    username.setText("");
                    nic1.setText("");
                    dob.setText("");
                    gender.setSelectedItem("");
                    address.setText("");
                    email.setText("");
                    contact.setText("");
                    designation.setSelectedItem("");
                    department.setSelectedItem("");
    }//GEN-LAST:event_resetActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try{
            stmt = con.createStatement();
            int epfno  = Integer.parseInt(epf.getText());
            String query = "DELETE FROM addemployee WHERE epfno = '"+epfno+"' ";
            
            stmt.executeUpdate(query);
            
            JOptionPane.showMessageDialog(null, "Succesfully Deleted!");
            
        }
         catch(Exception e)
        {
          System.out.println(e);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String keyword = epf.getText();
            try {
            String query = "SELECT * FROM addemployee WHERE epfno = ?";
            PreparedStatement st = con.prepareStatement(query);
            st.setString(1, keyword);
            
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                System.out.println(rs.getString("epfno"));
                 
                username.setText(rs.getString("username"));
                nic1.setText(rs.getString("nic"));
                dob.setText(rs.getString("dob"));
                gender.setSelectedItem(rs.getString("gender"));
                address.setText(rs.getString("address"));
                email.setText(rs.getString("email"));
                contact.setText("0" + String.valueOf(rs.getInt("contact")));
                designation.setSelectedItem(rs.getString("designation"));
                department.setSelectedItem(rs.getString("department"));
                
                
            }
        } catch (SQLException ex) {
                 
            Logger.getLogger(SearchEmployees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchBtnActionPerformed
    
    
    
    
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
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField contact;
    private javax.swing.JButton delete;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JComboBox<String> designation;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField email;
    private javax.swing.JTextField epf;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nic1;
    private javax.swing.JButton reset;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton update;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
