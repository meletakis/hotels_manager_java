/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * addHall.java
 *
 * Created on 10 Μαρ 2010, 11:42:51 μμ
 */

package GUI;

import javax.swing.JOptionPane;
import Basics.*;

/**
 *
 * @author bettina
 */
public class addHall extends javax.swing.JFrame {
    double Cost;
    int Seats =25 , HallNumber;
    String temp ="1";
    Global g;
    

    /** Creates new form addHall */
    public addHall(Global g) {
        this.g = g;
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SaveButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        HallNumberTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SeatsNumberCB = new javax.swing.JComboBox();
        CostPerSeatTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Add New Hall");

        jLabel3.setText("Cost per Seat");

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonAP(evt);
            }
        });

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonAP(evt);
            }
        });

        jLabel2.setText("Hall Number");

        jLabel4.setText("Number of Seats");

        SeatsNumberCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "25", "50", "100", "150", "200", "250", "300", "350", "400", "450", "500" }));
        SeatsNumberCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeatNumberAP(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonAp(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(266, 266, 266)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(63, 63, 63)
                                        .addComponent(HallNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(54, 54, 54)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(SeatsNumberCB, 0, 46, Short.MAX_VALUE)
                                            .addComponent(CostPerSeatTF))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)))
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(30, 30, 30)
                        .addComponent(CancelButton)
                        .addGap(18, 18, 18)))
                .addComponent(SaveButton)
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2))
                    .addComponent(HallNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CostPerSeatTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SeatsNumberCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton)
                    .addComponent(CancelButton)
                    .addComponent(jButton1))
                .addGap(128, 128, 128))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SeatNumberAP(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeatNumberAP
        // TODO add your handling code here:

        String flag = (String)SeatsNumberCB.getSelectedItem();
        Seats  = Integer.parseInt(flag);
    }//GEN-LAST:event_SeatNumberAP

    private void CancelButtonAP(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonAP
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_CancelButtonAP

    private void SaveButtonAP(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonAP
        // TODO add your handling code here:


        try
        {
            boolean HallNumberFlag = true;

         temp = HallNumberTF.getText();// diabazei ta HallNumber kai Cost apo ton Xrhsth
         HallNumber = Integer.parseInt(temp);// an einai swsta kai mporesei na ta kanei integer kai double sunexizei alliws
                                            // exoume munima lathous
         temp = CostPerSeatTF.getText();
         Cost = Double.parseDouble(temp);

         for ( int i = 0 ; i<g.halls.size();i++)// elegxei an to hall pou prospathoume na ftiaxoume uparxei hdh
         {
                         if ( g.halls.get(i).getHallnum() == HallNumber)
                         {
                             JOptionPane.showMessageDialog(this,"HALL  :" +HallNumber + " ALREADY EXISTS ");
                             HallNumberFlag = false;
                             break;

                         }
        }

         if ( HallNumberFlag)// an den uparxei to ftiaxnei kai to eisagei ston pinaka
         {                  // alliws exoume mnm lathous!

                  JOptionPane.showMessageDialog(this," SUCCESFULL ADD HALL : " +HallNumber);

                  Hall h = new Hall(HallNumber,Seats,Cost,"n");
                  g.halls.add(h);
                  this.dispose();

         }
          
        }catch( Exception e)
        {
            JOptionPane.showMessageDialog(this,"WRONG HALLNUMBER/COST INPUT ");
        }











    }//GEN-LAST:event_SaveButtonAP

    private void BackButtonAp(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonAp
        // TODO add your handling code here:

        new addPlace(g).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonAp

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField CostPerSeatTF;
    private javax.swing.JTextField HallNumberTF;
    private javax.swing.JButton SaveButton;
    private javax.swing.JComboBox SeatsNumberCB;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

}
