/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Gui;

import Connect.ObjectsData;
import objects.Client;
import objects.Elevator;
import objects.Employee;
import objects.Maintenance;
import ultity.Tools;

/**
 *
 * @author notte_000
 */
public class MaintenanceView extends javax.swing.JDialog {
    Maintenance mmt;
    
    public MaintenanceView(java.awt.Frame parent, boolean modal, Maintenance maintenance) {
        super(parent, modal);
        initComponents();
        this.setTitle("Maintenance View");
        this.setLocationRelativeTo(rootPane);
        this.mmt = maintenance;
        setValue();
    }

    private void setValue(){
        System.out.println(mmt.getEmployeeid()+"");
        ObjectsData od = new ObjectsData();
        Client c = od.getClientById(mmt.getClientid());
        Elevator e = od.getElevator(mmt.getElevatorid());
        Employee em = od.getEmployee(mmt.getEmployeeid());
        lbClientname.setText(c.getName());
        lbClientcompany.setText(c.getCompany());
        lbClientaddress.setText(c.getAddress());
        lbClientphone.setText(c.getMobile());
        lbOrdernumber.setText(""+mmt.getOrderid());
        lbDateorder.setText(mmt.getOrderdate());
        lbDatedelivery.setText(mmt.getDeliverydate());
        lbElevatorType.setText(e.getType());
        lbElevatorname.setText(e.getName());
        lbEmployeename.setText(em.getFullname());
        lbFirstyear.setText(Tools.isExpired(1, mmt));
        if(!Tools.isExpired(2, mmt).equals("")){
            lbSecondyear.setText(Tools.isExpired(2, mmt));
        }
        else{
            lbSecondyear.setText("Not approved");
        }
        if(!Tools.isExpired(3, mmt).equals("")){
            lbThirdyear.setText(Tools.isExpired(3, mmt));
        }
        else{
            lbThirdyear.setText("Not approved");
        }
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
        lbDatedelivery = new javax.swing.JLabel();
        lbOrdernumber = new javax.swing.JLabel();
        lbClientphone = new javax.swing.JLabel();
        lbClientaddress = new javax.swing.JLabel();
        lbClientcompany = new javax.swing.JLabel();
        lbElevatorType = new javax.swing.JLabel();
        lbClientname = new javax.swing.JLabel();
        lbDateorder = new javax.swing.JLabel();
        lbSecondyear = new javax.swing.JLabel();
        lbElevatorname = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbFirstyear = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lbThirdyear = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbEmployeename = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        lbDatedelivery.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbDatedelivery.setText("Date of delivery:");

        lbOrdernumber.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbOrdernumber.setText("Order Number:");

        lbClientphone.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbClientphone.setText("Client's Phone:");

        lbClientaddress.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbClientaddress.setText("Client's Address:");

        lbClientcompany.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbClientcompany.setText("Client's Company:");

        lbElevatorType.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbElevatorType.setText("Elevator's Type:");

        lbClientname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbClientname.setText("Client's Name:");

        lbDateorder.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbDateorder.setText("Date of order:");

        lbSecondyear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbSecondyear.setText("Second maintenance:");

        lbElevatorname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbElevatorname.setText("Elevator's Name:");

        jLabel2.setText("Client's Company:");

        jLabel1.setText("Client's Name:");

        jLabel4.setText("Client's Phone:");

        jLabel3.setText("Client's Address:");

        lbFirstyear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbFirstyear.setText("First maintenance:");

        jLabel12.setText("Third maintenance:");

        lbThirdyear.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbThirdyear.setText("Third maintenance:");

        jLabel10.setText("First maintenance:");

        jLabel11.setText("Second maintenance:");

        lbEmployeename.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lbEmployeename.setText("Third maintenance:");

        jLabel8.setText("Elevator's Name:");

        jLabel9.setText("Elevator's Type:");

        jLabel6.setText("Date of order:");

        jLabel25.setText("Employee's Name:");

        jLabel7.setText("Date of delivery:");

        jLabel5.setText("Order Number:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel25))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbClientname)
                    .addComponent(lbClientcompany)
                    .addComponent(lbClientaddress)
                    .addComponent(lbClientphone)
                    .addComponent(lbOrdernumber)
                    .addComponent(lbDateorder)
                    .addComponent(lbDatedelivery)
                    .addComponent(lbElevatorname)
                    .addComponent(lbElevatorType)
                    .addComponent(lbFirstyear)
                    .addComponent(lbSecondyear)
                    .addComponent(lbThirdyear)
                    .addComponent(lbEmployeename))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbClientname)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbClientcompany)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbClientaddress)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbClientphone)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbOrdernumber)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDateorder)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDatedelivery)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbElevatorname)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbElevatorType)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbFirstyear)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSecondyear)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbThirdyear)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEmployeename)
                    .addComponent(jLabel25))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/s_close.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });
        jPanel2.add(btnClose);

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbClientaddress;
    private javax.swing.JLabel lbClientcompany;
    private javax.swing.JLabel lbClientname;
    private javax.swing.JLabel lbClientphone;
    private javax.swing.JLabel lbDatedelivery;
    private javax.swing.JLabel lbDateorder;
    private javax.swing.JLabel lbElevatorType;
    private javax.swing.JLabel lbElevatorname;
    private javax.swing.JLabel lbEmployeename;
    private javax.swing.JLabel lbFirstyear;
    private javax.swing.JLabel lbOrdernumber;
    private javax.swing.JLabel lbSecondyear;
    private javax.swing.JLabel lbThirdyear;
    // End of variables declaration//GEN-END:variables
}