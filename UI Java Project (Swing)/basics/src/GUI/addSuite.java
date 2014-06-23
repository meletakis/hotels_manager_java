/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * addSuite.java
 *
 * Created on 10 Μαρ 2010, 10:40:46 μμ
 */

package GUI;
import Basics.*;
import javax.swing.JOptionPane;

/**
 *
 * @author bettina
 */
public class addSuite extends javax.swing.JFrame {

    int SuiteNumber , NumOfBeds=2;
    double Cost=400;
    String temp;
    Global g;


    /** Creates new form addSuite */
    public addSuite(Global g) {
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
        SaveButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        CostCB = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        SuiteNumberTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        NumOfBedsCB = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Add New Suite");

        SaveButton.setText("Save");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Cost per Customer");

        CostCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "400", "500", "600", "700", "800", " " }));
        CostCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostCBActionPerformed(evt);
            }
        });

        jLabel2.setText("Suite Number");

        SuiteNumberTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuiteNumberTFActionPerformed(evt);
            }
        });

        jLabel4.setText("Number of Beds");

        NumOfBedsCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "4", "5", "6", " " }));
        NumOfBedsCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumOfBedsCBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(jLabel1)
                .addContainerGap(276, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CostCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(377, 377, 377))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
                                .addComponent(SuiteNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(NumOfBedsCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(332, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addComponent(BackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CancelButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SaveButton)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(SuiteNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(NumOfBedsCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CostCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BackButton)
                    .addComponent(CancelButton)
                    .addComponent(SaveButton))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SuiteNumberTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuiteNumberTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SuiteNumberTFActionPerformed

    private void NumOfBedsCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumOfBedsCBActionPerformed
        // TODO add your handling code here:
        String temp = (String)NumOfBedsCB.getSelectedItem();
        NumOfBeds  = Integer.parseInt(temp);// pairnei to NUmOFBeds
    }//GEN-LAST:event_NumOfBedsCBActionPerformed

    private void CostCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CostCBActionPerformed
        // TODO add your handling code here:
        String temp = (String)CostCB.getSelectedItem();
        Cost  = Double.parseDouble(temp);// pairnei to cost

    }//GEN-LAST:event_CostCBActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        new addPlace(g).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        // TODO add your handling code here:


        try
        {


         boolean SuiteNumberFlag = true;
         temp = SuiteNumberTF.getText();
         SuiteNumber = Integer.parseInt(temp);// pairei to suitenumber apo to textfield. An ginei integer sunexizei alliws exoume mnm lathous

         for ( int i = 0 ; i<g.rooms.size();i++)
         {
             if ( g.rooms.get(i).getRoomnumber() == SuiteNumber )// elegxei an uparxei hdh auto to suite number
             {
                 JOptionPane.showMessageDialog(this,"SUITE :" +SuiteNumber+ " ALREADY EXISTS ");
                 SuiteNumberFlag = false;// an uparxei ginetai false
                 break;

             }
         }

         if ( SuiteNumberFlag)// an uparxei den mpainei stin if alliws prostithetai h kainouria suita me ta orismata!
         {

              JOptionPane.showMessageDialog(this,"SUCCESFULL ADD SUITE : " +SuiteNumber );

              Suite s = new Suite(SuiteNumber,NumOfBeds,Cost,"n","suite");

              g.rooms.add(s);
              this.dispose();
         }


        }catch( Exception e)
        {
            JOptionPane.showMessageDialog(this,"WRONG SUITE NUMBER INPUT ");
        }
    }//GEN-LAST:event_SaveButtonActionPerformed

    /**
    * @param args the command line arguments
    */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton CancelButton;
    private javax.swing.JComboBox CostCB;
    private javax.swing.JComboBox NumOfBedsCB;
    private javax.swing.JButton SaveButton;
    private javax.swing.JTextField SuiteNumberTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

}