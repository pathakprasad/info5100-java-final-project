/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package finalprojectUserInterface.Administration;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import finalprojectBackend.DB4OUtility.DB4OUtility;
import finalprojectBackend.OperatingSystem.OperatingSystem;
import finalprojectBackend.Enterprise.DonorBank.DonorBank;
import finalprojectBackend.Enterprise.DonorBank.DonorUser;
import finalprojectUserInterface.MainJFrameForm;

/**
 *
 * @author supriyaa
 */
public class ManageDonarBank extends javax.swing.JPanel {

    /**
     * Creates new form ManageDonarBank
     */
    MainJFrameForm MainLPage;
    //FirebaseHelper firebaseHelper;
    private OperatingSystem operatingSystem;
    private DB4OUtility dB4OUtility;

    public ManageDonarBank(MainJFrameForm MainLPage, DB4OUtility dB4OUtility, OperatingSystem operatingSystem) {
        initComponents();
        this.MainLPage = MainLPage;
        this.dB4OUtility = dB4OUtility;
        this.operatingSystem = operatingSystem;
        populateDonorBankTable();
        populateDonorTable();
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
        jScrollPanebBankdetails = new javax.swing.JScrollPane();
        tb1 = new javax.swing.JTable();
        jScrollPaneDonarDetails = new javax.swing.JScrollPane();
        tb2 = new javax.swing.JTable();
        deletebtn = new javax.swing.JButton();
        deletebtn2 = new javax.swing.JButton();
        bankdetails_lbl = new javax.swing.JLabel();
        Donardetails_lbl = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));

        tb1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "Registry Number", "Enterprise Name"
            }
        ));
        jScrollPanebBankdetails.setViewportView(tb1);

        tb2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "Name", "Donor Bank Name"
            }
        ));
        jScrollPaneDonarDetails.setViewportView(tb2);

        deletebtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        deletebtn2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deletebtn2.setText("Delete");
        deletebtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtn2ActionPerformed(evt);
            }
        });

        bankdetails_lbl.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        bankdetails_lbl.setText("Donor Bank Details");

        Donardetails_lbl.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        Donardetails_lbl.setText("Donor Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPanebBankdetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletebtn2)
                    .addComponent(deletebtn)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPaneDonarDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bankdetails_lbl)
                        .addComponent(Donardetails_lbl)))
                .addContainerGap(398, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(bankdetails_lbl)
                .addGap(18, 18, 18)
                .addComponent(jScrollPanebBankdetails, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deletebtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Donardetails_lbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPaneDonarDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deletebtn2)
                .addGap(503, 503, 503))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1069, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1016, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1016, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = tb1.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        String doctorUName = model.getValueAt(selectedRow, 0).toString();
        System.out.println(" donorbank uname: " + doctorUName);
        operatingSystem.deleteDonorBank(doctorUName);
        dB4OUtility.storeSystem(operatingSystem);
        populateDonorBankTable();
        populateDonorTable();
    }//GEN-LAST:event_deletebtnActionPerformed

    private void deletebtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtn2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tb2.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please Select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tb2.getModel();
        String doctorUName = model.getValueAt(selectedRow, 0).toString();
        System.out.println(" donor uname: " + doctorUName);
        operatingSystem.deleteDonor(doctorUName);
        dB4OUtility.storeSystem(operatingSystem);
        populateDonorBankTable();
        populateDonorTable();
    }//GEN-LAST:event_deletebtn2ActionPerformed

    private void populateDonorTable() {
        DefaultTableModel model = (DefaultTableModel) tb2.getModel();
        model.setRowCount(0);

        for (DonorUser d : operatingSystem.getDonorUserDirectory()) {

            Object[] row = new Object[5];
            row[0] = d.getUserName();
            row[1] = d.getPersonName();
            row[2]= d.getDonorBankName();
            model.addRow(row);

        }

    }
    
    private void populateDonorBankTable() {
        DefaultTableModel model = (DefaultTableModel) tb1.getModel();
        model.setRowCount(0);

        for (DonorBank d : operatingSystem.getDonorBankDirectory()) {

            Object[] row = new Object[5];
            row[0] = d.getUserName();
            row[1] = d.getRegNumber();
            row[2] = d.getEnterpriseName();
            model.addRow(row);

        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Donardetails_lbl;
    private javax.swing.JLabel bankdetails_lbl;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton deletebtn2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPaneDonarDetails;
    private javax.swing.JScrollPane jScrollPanebBankdetails;
    private javax.swing.JTable tb1;
    private javax.swing.JTable tb2;
    // End of variables declaration//GEN-END:variables
}
