/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UpdateHall.java
 *
 * Created on 10 Μαϊ 2010, 8:07:18 μμ
 */

package GUI;

import Basics.Hall;
import javax.swing.JOptionPane;

/**
 *
 * @author bettina
 */
public class UpdateHall extends javax.swing.JFrame {
    Global g;
    Hall h;

    double Cost;
    int HallNumber;
    int Seats;
    String temp;
    boolean roomNumberFlag;

    /** Creates new form Update2Room */
    public UpdateHall(Global g,Hall h) {
        this.g = g;
        this.h = h;
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SeatsNumberCB = new javax.swing.JComboBox();
        SaveButton = new javax.swing.JButton();
        CostPerSeatTF = new javax.swing.JTextField();
        CancelButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        HallNumberTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1BackButtonAp(evt);
            }
        });

        jLabel1.setText("Update Hall");

        jLabel3.setText("Cost per Seat");

        SeatsNumberCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "25", "50", "100", "150", "200", "250", "300", "350", "400", "450", "500" }));
        SeatsNumberCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeatsNumberCBSeatNumberAP(evt);
            }
        });

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

        jLabel4.setText("Number of Seats");

        jLabel2.setText("Hall Number");

        HallNumberTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HallNumberTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(CostPerSeatTF))))))
                .addGap(332, 332, 332))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(300, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(30, 30, 30)
                .addComponent(CancelButton)
                .addGap(18, 18, 18)
                .addComponent(SaveButton)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(251, 251, 251)
                .addComponent(jLabel1)
                .addContainerGap(262, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(HallNumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CostPerSeatTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SeatsNumberCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton)
                    .addComponent(CancelButton)
                    .addComponent(jButton1))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1BackButtonAp(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1BackButtonAp
        // TODO add your handling code here:

        //new UpdateRoom(g).setVisible(true);
        this.dispose();
}//GEN-LAST:event_jButton1BackButtonAp

    private void SeatsNumberCBSeatNumberAP(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeatsNumberCBSeatNumberAP
        // TODO add your handling code here:

        temp = (String)SeatsNumberCB.getSelectedItem();
        Seats  = Integer.parseInt(temp);
}//GEN-LAST:event_SeatsNumberCBSeatNumberAP

    private void SaveButtonAP(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonAP
       try {
          roomNumberFlag = true;

           //anazitisi tis thesis pou to stoixeio HallNumber einai to idio me auto
            //pou simplirose o xristis sti forma
            //sti sinexeia diagrafi tou antikeimenou apo ti lista
           for ( int i = 0 ; i<g.halls.size();i++)
                if ( g.halls.get(i).getHallnum()== h.getHallnum())
                {
                    g.halls.remove(g.halls.get(i));
                }

          //anazitisi sti lista rooms se periptosi eisagogis
          //arithmou domatiou pou iparxei idi
            for ( int i = 0 ; i<g.halls.size();i++) {
                if ( g.halls.get(i).getHallnum()== HallNumber) {
                    JOptionPane.showMessageDialog(this,"HALLNUMBER :"
                            +HallNumber + " ALREADY EXISTS ");
                    roomNumberFlag = false;
                    break;

                }
            }

            //prosthiki enimeromenou antikeimenou sti lista halls
            if ( roomNumberFlag ) {

                JOptionPane.showMessageDialog(this,"UPDATE HALL OK");

                h = new Hall(HallNumber,Seats,Cost,"n");

                g.halls.add(h);
                this.dispose();
            }


        }catch( Exception e) {
           JOptionPane.showMessageDialog(this," WRONG HALLNUMBER/COST INPUT");
        }
}//GEN-LAST:event_SaveButtonAP

    private void CancelButtonAP(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonAP
        // TODO add your handling code here:
        this.dispose();
}//GEN-LAST:event_CancelButtonAP

    private void HallNumberTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HallNumberTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HallNumberTFActionPerformed

    /**
    * @param args the command line arguments
    */
    

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
