/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.HospitalInterface;

/**
 *
 * @author supriyaa
 */
public class DoctorSignUp extends javax.swing.JPanel {

    /**
     * Creates new form DoctorSignUp
     */
    public DoctorSignUp() {
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
        lbl_admintitle = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        lbl_name = new javax.swing.JLabel();
        lbl_uname = new javax.swing.JLabel();
        txtUsrName = new javax.swing.JTextField();
        lbl_pswd = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        lbl_address = new javax.swing.JLabel();
        txtAdd = new javax.swing.JTextField();
        txt_City = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txt_state = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        txt_Zip = new javax.swing.JLabel();
        txtZip = new javax.swing.JTextField();
        btn_back = new javax.swing.JButton();
        hospitalList = new javax.swing.JComboBox<>();
        btn_signup = new javax.swing.JButton();
        lbl_speciality = new javax.swing.JLabel();
        lbl_hospname = new javax.swing.JLabel();
        txt_spc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_admintitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_admintitle.setText("Create Doctor Profile");
        jPanel1.add(lbl_admintitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 24, -1, -1));

        txtFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullNameActionPerformed(evt);
            }
        });
        txtFullName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFullNameKeyReleased(evt);
            }
        });
        jPanel1.add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 64, 216, -1));

        lbl_name.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_name.setText("Name:");
        jPanel1.add(lbl_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 71, -1, -1));

        lbl_uname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_uname.setText("Username:");
        jPanel1.add(lbl_uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 115, -1, -1));

        txtUsrName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsrNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsrName, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 108, 216, -1));

        lbl_pswd.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_pswd.setText("Password:");
        jPanel1.add(lbl_pswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(171, 159, -1, -1));

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 152, 216, 27));

        lbl_address.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_address.setText("Address:");
        jPanel1.add(lbl_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 311, -1, -1));

        txtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddActionPerformed(evt);
            }
        });
        txtAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddKeyReleased(evt);
            }
        });
        jPanel1.add(txtAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 304, 216, 27));

        txt_City.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_City.setText("City:");
        jPanel1.add(txt_City, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 362, -1, -1));

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });
        txtCity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCityKeyReleased(evt);
            }
        });
        jPanel1.add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 355, 216, 27));

        txt_state.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_state.setText("State:");
        jPanel1.add(txt_state, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 407, -1, -1));

        txtState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStateActionPerformed(evt);
            }
        });
        txtState.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtStateKeyReleased(evt);
            }
        });
        jPanel1.add(txtState, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 400, 216, 27));

        txt_Zip.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txt_Zip.setText("Zip Code:");
        jPanel1.add(txt_Zip, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 479, -1, -1));

        txtZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipActionPerformed(evt);
            }
        });
        txtZip.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtZipKeyReleased(evt);
            }
        });
        jPanel1.add(txtZip, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 472, 216, 27));

        btn_back.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 528, 87, -1));

        hospitalList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        jPanel1.add(hospitalList, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 203, 216, -1));

        btn_signup.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn_signup.setText("Sign Up");
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });
        jPanel1.add(btn_signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(371, 528, 87, -1));

        lbl_speciality.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_speciality.setText("Speciality:");
        jPanel1.add(lbl_speciality, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 257, -1, -1));

        lbl_hospname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbl_hospname.setText("Hospital Name:");
        jPanel1.add(lbl_hospname, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 209, -1, -1));

        txt_spc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_spcActionPerformed(evt);
            }
        });
        txt_spc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_spcKeyReleased(evt);
            }
        });
        jPanel1.add(txt_spc, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 250, 216, 27));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Backgrounds/AdobeStock_279753293.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, -4, 1420, 1190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1422, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1422, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 895, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullNameActionPerformed

    private void txtFullNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFullNameKeyReleased
        // TODO add your handling code here:
        //        String nameconv = "^[a-zA-Z ]{1,17}$";
        //        Pattern pat = Pattern.compile(nameconv);
        //        Matcher mat = pat.matcher(txtFullName.getText());
        //
        //        if (!mat.matches()) {
            //            name_chk.setText("Name is incorrect");
            //        } else {
            //            name_chk.setText("");
            //        }
    }//GEN-LAST:event_txtFullNameKeyReleased

    private void txtUsrNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsrNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsrNameActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed

    private void txtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddActionPerformed

    private void txtAddKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddKeyReleased
        // TODO add your handling code here:

        //        String addrconv = "^[a-zA-Z0-9 ]{0,30}$";
        //        Pattern pat = Pattern.compile(addrconv);
        //        Matcher mat = pat.matcher(txtAdd.getText());
        //
        //        if (!mat.matches()) {
            //            add_chk.setText("Address is incorrect");
            //        } else {
            //            add_chk.setText("");
            //        }
    }//GEN-LAST:event_txtAddKeyReleased

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void txtCityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCityKeyReleased
        // TODO add your handling code here:
        //        String cityconv = "^[a-zA-Z ]{0,30}$";
        //        Pattern pat = Pattern.compile(cityconv);
        //        Matcher mat = pat.matcher(txtCity.getText());
        //
        //        if (!mat.matches()) {
            //            city_chk.setText("City is incorrect");
            //        } else {
            //            city_chk.setText("");
            //        }
    }//GEN-LAST:event_txtCityKeyReleased

    private void txtStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStateActionPerformed

    private void txtStateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStateKeyReleased
        // TODO add your handling code here:

        //        String stateconv = "^[a-zA-Z ]{0,30}$";
        //        Pattern pat = Pattern.compile(stateconv);
        //        Matcher mat = pat.matcher(txtState.getText());
        //
        //        if (!mat.matches()) {
            //            state_chk.setText("State is incorrect");
            //        } else {
            //            state_chk.setText("");
            //        }
    }//GEN-LAST:event_txtStateKeyReleased

    private void txtZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipActionPerformed

    private void txtZipKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZipKeyReleased
        // TODO add your handling code here:
        //        String zipconv = "^[0-9]{5}$";
        //        Pattern pat = Pattern.compile(zipconv);
        //        Matcher mat = pat.matcher(txtZip.getText());
        //
        //        if (!mat.matches()) {
            //            zip_chk.setText("Zipcode is incorrect");
            //        } else {
            //            zip_chk.setText("");
            //        }
    }//GEN-LAST:event_txtZipKeyReleased

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed

        MainFrameForm suc = new MainFrameForm();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        suc.setVisible(true);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        // TODO add your handling code here:
        String address = txtAdd.getText() + txtCity.getText() + txtState.getText() + txtZip.getText();
        //uname, pswd, id, name, add, gender, telenum, dob
        //(txtFullName.getText(), txtNo.getText(), address, txtUsrName.getText(), txtPass.getText());

        Doctor doctor = new Doctor(txtUsrName.getText(), txtPass.getText(), "idid", txtFullName.getText(), address, "male", "telenum", new Date(),txt_spc.getText(),hospitalList.getSelectedItem().toString());

        ecoSystem.addDoctor(doctor);
        dB4OUtil.storeSystem(ecoSystem);

        MainFrameForm suc = new MainFrameForm();
        ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
        suc.setVisible(true);
        //        if (txtFullName.getText().equals("") || txtUsrName.getText().equals("") || txtPass.getText().equals("") || txtNo.getText().equals("")
            //            || txtAdd.getText().equals("") || txtCity.getText().equals("") || txtState.getText().equals("") || txtZip.getText().equals("")) {
            //
            //            JOptionPane.showMessageDialog(this, "All fields are mandatory.");
            //        } else if (!name_chk.getText().equals("") || !telenum_chk.getText().equals("") || !add_chk.getText().equals("") || !city_chk.getText().equals("")
            //            || !state_chk.getText().equals("") || !zip_chk.getText().equals("")) {
            //
            //            JOptionPane.showMessageDialog(this, "Invalid value(s) entered.");
            //        }
        //        else{
            //            Address add = new Address(txtAdd.getText(), txtCity.getText(), txtState.getText(), Integer.parseInt(txtZip.getText()));
            //
            //            Customer cus =new Customer(txtUsrName.getText(), txtPass.getText(), new CustomerRole(),txtNo.getText(), txtFullName.getText(), add);
            //            system.addCustomer(cus);
            //
            //            dB4OUtil.storeSystem(system);
            //            JOptionPane.showMessageDialog(this, "Customer information saved.");
            //            MainJFrame cust = new MainJFrame();
            //            ((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
            //            cust.setVisible(true);
            //        }
    }//GEN-LAST:event_btn_signupActionPerformed

    private void txt_spcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_spcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_spcActionPerformed

    private void txt_spcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_spcKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_spcKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_signup;
    private javax.swing.JComboBox<String> hospitalList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_address;
    private javax.swing.JLabel lbl_admintitle;
    private javax.swing.JLabel lbl_hospname;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_pswd;
    private javax.swing.JLabel lbl_speciality;
    private javax.swing.JLabel lbl_uname;
    private javax.swing.JTextField txtAdd;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtUsrName;
    private javax.swing.JTextField txtZip;
    private javax.swing.JLabel txt_City;
    private javax.swing.JLabel txt_Zip;
    private javax.swing.JTextField txt_spc;
    private javax.swing.JLabel txt_state;
    // End of variables declaration//GEN-END:variables
}
