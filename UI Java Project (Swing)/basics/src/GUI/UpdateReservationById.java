/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UpdateR.java
 *
 * Created on 9 Μαϊ 2010, 3:37:27 μμ
 */

package GUI;

import Basics.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author bettina
 */
public class UpdateReservationById extends javax.swing.JFrame {
    Global g;
    String Id, c;
    public DefaultListModel dlm;
    /** Creates new form UpdateR */
    public UpdateReservationById(Global g) {
        this.g = g;
        dlm = new DefaultListModel();
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
        jLabel2 = new javax.swing.JLabel();
        IDField = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        NextButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        List = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Update  Reservation");

        jLabel2.setText("Enter the Id ");

        IDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDFieldActionPerformed(evt);
            }
        });

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancel");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        NextButton.setText("Next");
        NextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextButtonActionPerformed(evt);
            }
        });

        List.setModel(dlm);
        jScrollPane1.setViewportView(List);

        jLabel3.setText("List with Reservations");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(93, 93, 93))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CancelButton)
                        .addGap(18, 18, 18)
                        .addComponent(Search)
                        .addGap(18, 18, 18)
                        .addComponent(NextButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(IDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NextButton)
                            .addComponent(Search)
                            .addComponent(CancelButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed

        String Id = IDField.getText();
        
         int count =0;

        for( int i =0;i<g.roomReservation.size();i++)// eisagei mesa stin lista pou emfanizetai me to pou patisoume to search
        {                                             //oles tis roomreservation pou exoun id auto pou exoume dwsei sto pedio id
            if(g.roomReservation.get(i).getId().equals(Id))
            {
                dlm.add(count,g.roomReservation.get(i));
                    count++;
            }
        }

         for( int i =0;i<g.hallReservationsT.size();i++)// omoiws kai gia ta hall reservation
        {
            if(g.hallReservationsT.get(i).getCompany_id().equals(Id))
            {
                dlm.add(count,g.hallReservationsT.get(i));
                    count++;
            }
        }
       
}//GEN-LAST:event_SearchActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        this.dispose();
}//GEN-LAST:event_CancelButtonActionPerformed

    private void IDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDFieldActionPerformed
       
    }//GEN-LAST:event_IDFieldActionPerformed

    private void NextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NextButtonActionPerformed

         try
        {
             // epilegoume mia reservation apo tin lista kai patwntas to next
             // an h epilegmeni krathsh einai Hallreservation  ftiaxnoume ena antikeimeno
             // kai to pername stin klasi UpdateHallReservation gia na tropopoiisoume
             // tin epilegmeni kratisi
                HallReservation HR = (HallReservation)List.getSelectedValue();
                new UpdateHallReservation(g,HR).setVisible(true);
                this.dispose();

           

        }
        catch(Exception e)// omoiws kai gia tis alles kratiseis!
        {// an den einai HallReservation h epilegmeni prospthei na tin kanei standardRoomReservation

            try{

                StandardRoomReservation RR = (StandardRoomReservation)List.getSelectedValue();
                new UpdateRoomReservation(g,RR).setVisible(true);
                this.dispose();

            }catch(Exception ex)
            {// AN den einai oute StandardRoomReservation Einai SuiteReservation
                try{

                        SuiteReservation SR = (SuiteReservation)List.getSelectedValue();
                        new UpdateSuiteReservation(g,SR).setVisible(true);
                        this.dispose();

                }catch(Exception exe)
                {

                }


            }
            
          
             

        }
    }//GEN-LAST:event_NextButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField IDField;
    private javax.swing.JList List;
    private javax.swing.JButton NextButton;
    private javax.swing.JButton Search;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
