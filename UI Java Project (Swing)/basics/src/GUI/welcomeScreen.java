/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * bettina.java
 *
 * Created on 10 Μαρ 2010, 8:09:06 μμ
 */

package GUI;
import Basics.*;
import DBConnection.DB;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 *
 * @author bettina
 */
public class welcomeScreen extends javax.swing.JFrame {
    Global g;
    DB data;
    /** Creates new form bettina */
    public welcomeScreen() throws IOException{

        //ButtonHandler handler = new ButtonHandler();
        //createRoomJButton.addActionListener(handler);

        g = new Global();
        g.FileIn();

        
        data = new DB();
        data.Connect();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        createRoom = new javax.swing.JButton();
        welcomeLabel = new javax.swing.JLabel();
        UpdateRoom = new javax.swing.JButton();
        createReservation = new javax.swing.JButton();
        UpdateReservation = new javax.swing.JButton();
        cancelReservation = new javax.swing.JButton();
        earningStati = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        optionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/BJsHotel/B&J's hotel.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 0), new java.awt.Color(153, 153, 0), new java.awt.Color(153, 153, 0), new java.awt.Color(153, 153, 0)));

        createRoom.setText("Create new room/ hall");
        createRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createRoomActionPerformed(evt);
            }
        });

        welcomeLabel.setFont(new java.awt.Font("Tahoma", 1, 18));
        welcomeLabel.setForeground(new java.awt.Color(153, 153, 0));
        welcomeLabel.setText("~ welcome to B&J's hotel ~");
        welcomeLabel.setMaximumSize(new java.awt.Dimension(150, 20));
        welcomeLabel.setMinimumSize(new java.awt.Dimension(150, 20));

        UpdateRoom.setText("Update room/hall");
        UpdateRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateRoomActionPerformed(evt);
            }
        });

        createReservation.setText("Create new reservation");
        createReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createReservationActionPerformed(evt);
            }
        });

        UpdateReservation.setText("Update reservation");
        UpdateReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateReservationActionPerformed(evt);
            }
        });

        cancelReservation.setText("Cancel reservation");
        cancelReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelReservationActionPerformed(evt);
            }
        });

        earningStati.setText("View earning statistics");
        earningStati.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                earningStatiActionPerformed(evt);
            }
        });

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        optionLabel.setFont(new java.awt.Font("Tahoma", 1, 12));
        optionLabel.setForeground(new java.awt.Color(153, 153, 0));
        optionLabel.setText("Choose one of the following options:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(optionLabel)
                .addContainerGap(669, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(506, Short.MAX_VALUE)
                .addComponent(Exit)
                .addGap(443, 443, 443))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(402, Short.MAX_VALUE)
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(349, 349, 349))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(272, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cancelReservation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
                            .addComponent(UpdateReservation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(createReservation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(UpdateRoom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                            .addComponent(createRoom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(earningStati, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(161, 161, 161))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createRoom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UpdateRoom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(createReservation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UpdateReservation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelReservation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(earningStati)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Exit)
                .addGap(75, 75, 75))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelReservationActionPerformed
        new cancelReservation(g).setVisible(true);
    }//GEN-LAST:event_cancelReservationActionPerformed

    private void createRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createRoomActionPerformed
             new addPlace(g).setVisible(true);
    }//GEN-LAST:event_createRoomActionPerformed

    private void createReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createReservationActionPerformed
        new newReservation(g).setVisible(true);
    }//GEN-LAST:event_createReservationActionPerformed

    private void earningStatiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_earningStatiActionPerformed
        new earningStatistics1(g).setVisible(true);
    }//GEN-LAST:event_earningStatiActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        

        try {
            g.FileOut();
            data.DiscConnect();
            
        } catch (IOException ex) {
            Logger.getLogger(welcomeScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);


    }//GEN-LAST:event_ExitActionPerformed

    private void UpdateReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateReservationActionPerformed
        new UpdateReservationById(g).setVisible(true);
}//GEN-LAST:event_UpdateReservationActionPerformed

    private void UpdateRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateRoomActionPerformed
        new UpdatePlace(g).setVisible(true);
}//GEN-LAST:event_UpdateRoomActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new welcomeScreen().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(welcomeScreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton UpdateReservation;
    private javax.swing.JButton UpdateRoom;
    private javax.swing.JButton cancelReservation;
    private javax.swing.JButton createReservation;
    private javax.swing.JButton createRoom;
    private javax.swing.JButton earningStati;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel optionLabel;
    private javax.swing.JLabel welcomeLabel;
    // End of variables declaration//GEN-END:variables

}
