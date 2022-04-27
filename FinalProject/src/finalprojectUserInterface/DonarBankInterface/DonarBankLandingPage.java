/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.DonarBankInterface;

/**
 *
 * @author supriyaa
 */
public class DonarBankLandingPage extends javax.swing.JPanel {

    /**
     * Creates new form DonarBankLandingPage
     */
    MainFrameForm mainScreen;
    private DB4OUtil dB4OUtil;
    private EcoSystem ecoSystem;

    public MainDonorBankPage(MainFrameForm mainScreen, DB4OUtil dB4OUtil, EcoSystem ecoSystem) {
        initComponents();
        this.mainScreen = mainScreen;
        this.dB4OUtil = dB4OUtil;
        this.ecoSystem = ecoSystem;
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
        jLabel1 = new javax.swing.JLabel();
        lbl_role = new javax.swing.JLabel();
        cmb_Role = new javax.swing.JComboBox<>();
        lbl_username = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lbl_pswd = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btn_login = new javax.swing.JButton();
        btnSignin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DONOR BANK");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        lbl_role.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_role.setForeground(new java.awt.Color(255, 255, 255));
        lbl_role.setText("Role:");
        jPanel1.add(lbl_role, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 70, 20));

        cmb_Role.setEditable(true);
        cmb_Role.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmb_Role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Donor","Donor Admin"}));
        cmb_Role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_RoleActionPerformed(evt);
            }
        });
        jPanel1.add(cmb_Role, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 197, -1));

        lbl_username.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(255, 255, 255));
        lbl_username.setText("Username:");
        jPanel1.add(lbl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, -1));
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 197, -1));

        lbl_pswd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_pswd.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pswd.setText("Password:");
        jPanel1.add(lbl_pswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 197, -1));

        btn_login.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btn_login.setText("Login");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 140, 30));

        btnSignin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSignin.setText("Sign Up");
        btnSignin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSigninActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignin, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 470, 150, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/supriyaa/Downloads/donarblood2.jpeg")); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.setMaximumSize(new java.awt.Dimension(1200, 1080));
        jLabel2.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmb_RoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_RoleActionPerformed
        // TODO add your handling code here:
        System.out.println(cmb_Role.getSelectedItem().toString());
        if (cmb_Role.getSelectedItem().toString() == "Admin") {
            btnSignin.setEnabled(false);
        } else {
            btnSignin.setEnabled(true);
        }
    }//GEN-LAST:event_cmb_RoleActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:

        if (cmb_Role.getSelectedItem().toString() == "Donor Admin") {
            DonorBank donbank = (DonorBank) ecoSystem.loginCheck(txtUsername.getText(), txtPassword.getText());
            if(donbank == null){
                JOptionPane.showMessageDialog(this, "Incorrect credential");
            }else{
                DonorBankAdminLogin ap = new DonorBankAdminLogin(mainScreen, dB4OUtil, ecoSystem, donbank);
                mainScreen.setContentPane(ap);
                mainScreen.invalidate();
                mainScreen.validate();
                return;
            }
        }

        if (cmb_Role.getSelectedItem().toString() == "Donor") {
            Donor don = (Donor) ecoSystem.loginCheck(txtUsername.getText(), txtPassword.getText());
            if(don == null){
                JOptionPane.showMessageDialog(this, "Incorrect credential");
            }else{
                DonorLogin ap = new DonorLogin(mainScreen, dB4OUtil, ecoSystem, don);
                mainScreen.setContentPane(ap);
                mainScreen.invalidate();
                mainScreen.validate();
                return;
            }
        }

        //        if (cmb_Role.getSelectedItem().toString() == "Doctor") {
            //            Customer c = system.loginCustomer(txtUsername.getText(), txtPassword.getText());
            //            if (c == null) {
                //                JOptionPane.showMessageDialog(this, "Incorrect credential");
                //            } else {
                //                CustomerMainPage custmp = new CustomerMainPage(system, dB4OUtil, c);
                //                this.setContentPane(custmp);
                //                this.invalidate();
                //                this.validate();
                //                return;
                //            }
            //
            //        }
        //        if (cmb_Role.getSelectedItem().toString() == "Nurse") {
            //            Restaurant r = system.loginResaturant(txtUsername.getText(), txtPassword.getText());
            //
            //            if (r == null) {
                //                JOptionPane.showMessageDialog(this, "Incorrect credential");
                //            } else {
                //                RestaurantMainPage restmp = new RestaurantMainPage(system, dB4OUtil, r);
                //                this.setContentPane(restmp);
                //                this.invalidate();
                //                this.validate();
                //                return;
                //            }
            //
            //        }
        //
        //        if (cmb_Role.getSelectedItem().toString() == "Patient") {
            //            DeliveryMan r = system.loginDeliveryMan(txtUsername.getText(), txtPassword.getText());
            //
            //            if (r == null) {
                //                JOptionPane.showMessageDialog(this, "Incorrect credential");
                //            } else {
                //                DeliverManMainPage delimp = new DeliverManMainPage(system, dB4OUtil, r);
                //                this.setContentPane(delimp);
                //                this.invalidate();
                //                this.validate();
                //                return;
                //            }
            //
            //        }
        //
        //        if (cmb_Role.getSelectedItem().toString() == "Hospital Admin") {
            //            if (txtUsername.getText().matches("a") && txtPassword.getText().matches("a")) {
                //                AdminPage adminpg = new AdminPage(system, dB4OUtil);
                //                this.setContentPane(adminpg);
                //                this.invalidate();
                //                this.validate();
                //                return;
                //            } else {
                //                JOptionPane.showMessageDialog(this, "Incorrect credential");
                //            }
            //        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btnSigninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSigninActionPerformed
        // TODO add your handling code here:

        if (cmb_Role.getSelectedItem().toString() == "Donor") {

            SignUpDonor signdon = new SignUpDonor(mainScreen, dB4OUtil, ecoSystem);
            //
            //            //suc.setVisible(true);
            mainScreen.setContentPane(signdon);
            ////            //             this.add(s);
            ////
            mainScreen.invalidate();
            mainScreen.validate();

        }

        if (cmb_Role.getSelectedItem().toString() == "Donor Admin") {
            // System.out.println("Hospital");
            SignUpDonorAdmin s = new SignUpDonorAdmin(mainScreen, dB4OUtil, ecoSystem);

            //suc.setVisible(true);
            mainScreen.setContentPane(s);
            //             this.add(s);

            mainScreen.invalidate();
            mainScreen.validate();

        }
    }//GEN-LAST:event_btnSigninActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignin;
    private javax.swing.JButton btn_login;
    private javax.swing.JComboBox<String> cmb_Role;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_pswd;
    private javax.swing.JLabel lbl_role;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}