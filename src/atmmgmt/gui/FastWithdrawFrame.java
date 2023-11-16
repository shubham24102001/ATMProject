/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmmgmt.gui;

import atmmgmt.DAO.TransactionDAO;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class FastWithdrawFrame extends javax.swing.JFrame {

    /**
     * Creates new form FastWithdrawFrame
     */
    public FastWithdrawFrame() {
        super("ATM MANAGMENT");
        initComponents();
        this.setLocationRelativeTo(null);
        Toolkit tk=Toolkit.getDefaultToolkit();
        Image img=tk.getImage("D:\\Java NetBeans\\AtmProject\\src\\atmmgmt\\images\\atm-machine.png");
        setIconImage(img);
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
        btn100 = new javax.swing.JButton();
        btn500 = new javax.swing.JButton();
        btn200 = new javax.swing.JButton();
        btn1000 = new javax.swing.JButton();
        btn2000 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        btn100.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn100.setText("100");
        btn100.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn100ActionPerformed(evt);
            }
        });

        btn500.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn500.setText("500");
        btn500.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn500ActionPerformed(evt);
            }
        });

        btn200.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn200.setText("200");
        btn200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn200ActionPerformed(evt);
            }
        });

        btn1000.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn1000.setText("1000");
        btn1000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1000ActionPerformed(evt);
            }
        });

        btn2000.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn2000.setText("2000");
        btn2000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2000ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Fast Withdraw");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn200, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn100, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(163, 176, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn500, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn1000, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(btn2000, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn100)
                    .addComponent(btn500))
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn200)
                    .addComponent(btn1000))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btn2000)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn500ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn500ActionPerformed
        // TODO add your handling code here:
         try{
       int result= TransactionDAO.withdraw(500);
       if(result==-1){
                JOptionPane.showMessageDialog(null,"Insufficiant amound","Balance ",JOptionPane.ERROR_MESSAGE);
                return;
            }
            else if(result==1){
                JOptionPane.showMessageDialog(null,"Transaction issue","Error ",JOptionPane.ERROR_MESSAGE);
                return;
            }
            else if(result==2){
                   JOptionPane.showMessageDialog(null,"Amound Withdraw","Success ",JOptionPane.INFORMATION_MESSAGE); 
                   TransactionSuccessFrame tr= new TransactionSuccessFrame();
                   tr.setVisible(true);
                   this.dispose();
            }
       }
       catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(null, "Please Fill numeric data", "Error", JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
           
       }
       catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "DataBase Error", "DB Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
       }
    }//GEN-LAST:event_btn500ActionPerformed

    private void btn200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn200ActionPerformed
        // TODO add your handling code here:
         try{
       int result= TransactionDAO.withdraw(200);
       if(result==-1){
                JOptionPane.showMessageDialog(null,"Insufficiant amound","Balance ",JOptionPane.ERROR_MESSAGE);
                return;
            }
            else if(result==1){
                JOptionPane.showMessageDialog(null,"Transaction issue","Error ",JOptionPane.ERROR_MESSAGE);
                return;
            }
            else if(result==2){
                   JOptionPane.showMessageDialog(null,"Amound Withdraw","Success ",JOptionPane.INFORMATION_MESSAGE); 
                   TransactionSuccessFrame tr= new TransactionSuccessFrame();
                   tr.setVisible(true);
                   this.dispose();
            }
       }
       catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(null, "Please Fill numeric data", "Error", JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
           
       }
       catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "DataBase Error", "DB Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
       }
    }//GEN-LAST:event_btn200ActionPerformed

    private void btn100ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn100ActionPerformed
        // TODO add your handling code here:
       try{
       int result= TransactionDAO.withdraw(100);
       if(result==-1){
                JOptionPane.showMessageDialog(null,"Insufficiant amound","Balance ",JOptionPane.ERROR_MESSAGE);
                return;
            }
            else if(result==1){
                JOptionPane.showMessageDialog(null,"Transaction issue","Error ",JOptionPane.ERROR_MESSAGE);
                return;
            }
            else if(result==2){
                   JOptionPane.showMessageDialog(null,"Amound Withdraw","Success ",JOptionPane.INFORMATION_MESSAGE); 
                   TransactionSuccessFrame tr= new TransactionSuccessFrame();
                   tr.setVisible(true);
                   this.dispose();
            }
       }
       catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(null, "Please Fill numeric data", "Error", JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
           
       }
       catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "DataBase Error", "DB Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
       }
    }//GEN-LAST:event_btn100ActionPerformed

    private void btn1000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1000ActionPerformed
        // TODO add your handling code here:
         try{
       int result= TransactionDAO.withdraw(1000);
       if(result==-1){
                JOptionPane.showMessageDialog(null,"Insufficiant amound","Balance ",JOptionPane.ERROR_MESSAGE);
                return;
            }
            else if(result==1){
                JOptionPane.showMessageDialog(null,"Transaction issue","Error ",JOptionPane.ERROR_MESSAGE);
                return;
            }
            else if(result==2){
                   JOptionPane.showMessageDialog(null,"Amound Withdraw","Success ",JOptionPane.INFORMATION_MESSAGE); 
                   TransactionSuccessFrame tr= new TransactionSuccessFrame();
                   tr.setVisible(true);
                   this.dispose();
            }
       }
       catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(null, "Please Fill numeric data", "Error", JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
           
       }
       catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "DataBase Error", "DB Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
       }
    }//GEN-LAST:event_btn1000ActionPerformed

    private void btn2000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2000ActionPerformed
        // TODO add your handling code here:
         try{
       int result= TransactionDAO.withdraw(2000);
       if(result==-1){
                JOptionPane.showMessageDialog(null,"Insufficiant amound","Balance ",JOptionPane.ERROR_MESSAGE);
                return;
            }
            else if(result==1){
                JOptionPane.showMessageDialog(null,"Transaction issue","Error ",JOptionPane.ERROR_MESSAGE);
                return;
            }
            else if(result==2){
                   JOptionPane.showMessageDialog(null,"Amound Withdraw","Success ",JOptionPane.INFORMATION_MESSAGE); 
                   TransactionSuccessFrame tr= new TransactionSuccessFrame();
                   tr.setVisible(true);
                   this.dispose();
            }
       }
       catch(NumberFormatException ex){
           JOptionPane.showMessageDialog(null, "Please Fill numeric data", "Error", JOptionPane.ERROR_MESSAGE);
           ex.printStackTrace();
           
       }
       catch(SQLException ex){
           JOptionPane.showMessageDialog(null, "DataBase Error", "DB Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
       }
    }//GEN-LAST:event_btn2000ActionPerformed

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
            java.util.logging.Logger.getLogger(FastWithdrawFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FastWithdrawFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastWithdrawFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastWithdrawFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastWithdrawFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn100;
    private javax.swing.JButton btn1000;
    private javax.swing.JButton btn200;
    private javax.swing.JButton btn2000;
    private javax.swing.JButton btn500;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}