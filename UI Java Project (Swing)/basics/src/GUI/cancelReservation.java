/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * cancelReservation.java
 *
 * Created on 11 Μαρ 2010, 12:58:55 μμ
 */

package GUI;
import Basics.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import sun.util.calendar.Gregorian;

/**
 *
 * @author bettina
 */
public class cancelReservation extends javax.swing.JFrame {
    Global g;
    String Name;
    int count;
    public DefaultListModel dlm;
    GregorianCalendar Date = new GregorianCalendar();
    

    /** Creates new form cancelReservation */
    public cancelReservation(Global g) {
        this.g =g;
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

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NameTF = new javax.swing.JTextField();
        SearchButoon = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ReserveList = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        Delete = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cancel Reservation");

        jLabel2.setText("Search by Name");

        NameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTFActionPerformed(evt);
            }
        });

        SearchButoon.setText("Search");
        SearchButoon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButoonActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        ReserveList.setModel(dlm);
        jScrollPane1.setViewportView(ReserveList);

        jLabel3.setText("Reservations");

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BackButton, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SearchButoon)
                                .addGap(18, 18, 18)
                                .addComponent(Delete))
                            .addComponent(NameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(222, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Delete)
                    .addComponent(SearchButoon)
                    .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTFActionPerformed

    private void SearchButoonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButoonActionPerformed
        // TODO add your handling code here:


//eisagoume ena onoma ( h ta arxika enos onomatos ) kai patwntas to search mas emfanizei ta apotelesmata se mia lista
        //sthn opoia epilegontas ena stoixeio kai patwntas to delete an epitrepetai h diagrafi ginetai
        // alliws exoume munima lathous
        

          Name = NameTF.getText();// diabazei to onoma
          count =0;


        for( int i = 0;i<g.hallReservationsT.size();i++)// an uparxei to onoma mesa se hall reservations to eisagei sto dlm gia na
           if((g.hallReservationsT.get(i).getCompanyName().startsWith(Name)) )////emfanisei stin lista
               if(ControlGui.substractDays(g.hallReservationsT.get(i).getDate_in(), Date) > 0 )// gia kratiseis pou den exoun lixei!
                {
                    dlm.add(count,g.hallReservationsT.get(i));
                    count++;
                }
        

          


          for( int i = 0;i<g.roomReservation.size();i++)// omoiws kai gia to roomreservation
                 if((g.roomReservation.get(i).getName().startsWith(Name)) )
                     if(ControlGui.substractDays(g.roomReservation.get(i).getDate_in(), Date) > 0) // gia kratiseis pou THA ginoun
                     {
                            dlm.add(count,g.roomReservation.get(i));
                            count++;
                     }

          


 
         

          

          
    }//GEN-LAST:event_SearchButoonActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:

        try
        {
            HallReservation HR = (HallReservation)ReserveList.getSelectedValue();// propathei na kanei to antikeimeno hallreservation
            if(ControlGui.substractDays(HR.getDate_in(), Date) >7 )// na to kanei sunexizei alliws to antikeimeno einai roomReservation
            {                                                       // afou o pinakas dlm periexei auta ta duo eidh antikeimenwn
                for( int i=0;i<g.hallReservationsT.size();i++)      // an h prospatheia akurwsis einai mia ebdomada prin h akurwsi ginetai
                {                                                     // kai to antikeimeno diagrafetei apo ton pinaka alliws exoume munima lathous
                    if(HR.getCompany_id().equals(g.hallReservationsT.get(i).getCompany_id()) )
                    {
                        g.hallReservationsT.remove(i);
                        JOptionPane.showMessageDialog(this,"SUCCESFULL CANCEL RESERVATION");
                        this.dispose();
                        
                    }
                }
            }
            else
                JOptionPane.showMessageDialog(this,"NOT SUCCESFULL CANCEL RESERVATION\n TOO LATE FOR CANCEL");

        }
        catch(Exception e)// an den einai hall reservation einai RoomResrvation kai ginetai h idia diadikasia!
        {

            RoomReservation RR = (RoomReservation)ReserveList.getSelectedValue();
            if(ControlGui.substractDays(RR.getDate_in(), Date) > 7 )
            {
                for( int i=0;i<g.roomReservation.size();i++)
                {
                    if(RR.getId().equals(g.roomReservation.get(i).getId()) )
                    {
                        g.roomReservation.remove(i);
                        JOptionPane.showMessageDialog(this,"SUCCESFULL REMOVE");
                        this.dispose();

                    }
                }
            }else
                JOptionPane.showMessageDialog(this,"NOT SUCCESFULL REMOVE FOR ROOMRESERVATION");


            
            
        }

        
    }//GEN-LAST:event_DeleteActionPerformed

    /**
    * @param args the command line arguments
    */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JButton Delete;
    private javax.swing.JTextField NameTF;
    private javax.swing.JList ReserveList;
    private javax.swing.JButton SearchButoon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
