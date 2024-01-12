package Vu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.Statement;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javaswingdev.drawer.EventDrawer;
import javax.swing.table.DefaultTableModel;
import Controlleur.Reservat;
import Model.Connect;
import java.sql.ResultSet;
import Model.Reservations;
import static Vu.Chambres.id_chambre;
import java.sql.Connection;

/**
 *
 * @author charles_4545
 */
public class Reservation extends javax.swing.JFrame {

    private DrawerController drawer;
    private String RESEVATION;

    public Reservation() {
        initComponents();
        initDrawer();
    }
     private void initDrawer() {
        


        drawer = Drawer.newDrawer(this)
                .header(new Header())
                .background(Color.WHITE)
                .drawerBackground(Color.WHITE)
                .space(5)
                .enableScroll(true)
                .addChild(new DrawerItem("CLIENT")
                        .icon(new ImageIcon(getClass().getResource("/Icon/client(1).png")))
                        // .textColor(new Color(51, 51, 51))
                        .font(new Font("Serif", Font.BOLD, 18))
                        .build())
                .addChild(new DrawerItem("CHAMBRES")
                        .icon(new ImageIcon(getClass().getResource("/Icon/bed.png")))
                        // .textColor(new Color(51, 51, 51))
                        .font(new Font("Serif", Font.BOLD, 18))
                        .build())
                .addChild(new DrawerItem("RÉSERVATION")
                        .icon(new ImageIcon(getClass().getResource("/Icon/reservation.png")))
                        // .textColor(new Color(90,40,50))
                        .font(new Font("Serif", Font.BOLD, 18))
                        .build())
                .addChild(new DrawerItem("NOS SERVICES")
                        .icon(new ImageIcon(getClass().getResource("/Icon/leisure.png")))
                        // .textColor(new Color(51, 51, 51))
                        .font(new Font("Serif", Font.BOLD, 18))
                        .build())
                .addChild(new DrawerItem("FACTURE")
                        .icon(new ImageIcon(getClass().getResource("/Icon/receipt.png")))
                        // .textColor(Color.black)
                        .font(new Font("Serif", Font.BOLD, 18))
                        .build())
                .addFooter(new DrawerItem("FERMER")
                        .icon(new ImageIcon(getClass().getResource("/Icon/close.png")))
                        // .textColor(Color.RED)
                        .font(new Font("Serif", Font.BOLD, 18))
                        .build())      
                .event(new EventDrawer() {
                    @Override
                    public void selected(int i, DrawerItem di) {
                        switch (i) {
                            case 0 ->
                                showClientInterface();
                            case 1 ->
                                showChambresInterface();
                           // case 2 ->
                              //  showReservationInterface();
                            // Ajoutez d'autres cas si nécessaire
                        }
                    }
                })
                .build();

       
       
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bouton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Dr = new javax.swing.JLabel();
        Val = new javax.swing.JLabel();
        DP = new javax.swing.JLabel();
        Dar = new javax.swing.JLabel();
        Va = new javax.swing.JTextField();
        re = new javax.swing.JButton();
        anu = new javax.swing.JButton();
        conf = new javax.swing.JButton();
        Dd = new com.toedter.calendar.JDateChooser();
        DA = new com.toedter.calendar.JDateChooser();
        DR = new com.toedter.calendar.JDateChooser();
        NCH = new javax.swing.JLabel();
        ncl = new javax.swing.JTextField();
        nch = new javax.swing.JTextField();
        NC = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setOpaque(false);

        bouton3.setBackground(new java.awt.Color(255, 204, 204));
        bouton3.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        bouton3.setText("MENU");
        bouton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton3ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setFont(new java.awt.Font("FreeSerif", 1, 20)); // NOI18N
        jLabel1.setText("RESERVATION");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(362, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Dr.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        Dr.setText("Date Reservé");

        Val.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        Val.setText("Validiter");

        DP.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        DP.setText("Date du depart");

        Dar.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        Dar.setText("Date D'arrivée");

        Va.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VaActionPerformed(evt);
            }
        });

        re.setBackground(new java.awt.Color(0, 102, 102));
        re.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        re.setForeground(new java.awt.Color(255, 255, 255));
        re.setText("Reserver");
        re.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reActionPerformed(evt);
            }
        });

        anu.setBackground(new java.awt.Color(51, 0, 0));
        anu.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        anu.setForeground(new java.awt.Color(255, 255, 255));
        anu.setText("Annuler");
        anu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anuActionPerformed(evt);
            }
        });

        conf.setBackground(new java.awt.Color(255, 51, 51));
        conf.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        conf.setForeground(new java.awt.Color(255, 255, 255));
        conf.setText("Confirmer");
        conf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confActionPerformed(evt);
            }
        });

        Dd.setBackground(new java.awt.Color(255, 204, 204));
        Dd.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        DA.setBackground(new java.awt.Color(255, 204, 204));
        DA.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        DR.setBackground(new java.awt.Color(255, 204, 204));
        DR.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        NCH.setFont(new java.awt.Font("FreeSerif", 1, 20)); // NOI18N
        NCH.setText("NUM Chambre");

        ncl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nclActionPerformed(evt);
            }
        });

        nch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nchActionPerformed(evt);
            }
        });

        NC.setFont(new java.awt.Font("FreeSerif", 1, 20)); // NOI18N
        NC.setText("NUM Client");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(re)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(conf)
                                .addGap(15, 15, 15)
                                .addComponent(anu))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Val, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Va))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(DP, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Dd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Dar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Dr, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NCH, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(NC, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ncl, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(DR, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                .addGap(6, 6, 6))
                            .addComponent(nch))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ncl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NCH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Dr, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Dar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Dd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Val, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Va, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conf, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(re, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date Reserve", "Date D'arriver", "Date de depart", "validiter"
            }
        ));
        jTable1.setOpaque(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGap(37, 37, 37))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(bouton3)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bouton3)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bouton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton3ActionPerformed
        if (drawer.isShow()) {
            drawer.hide();
        } else {
            drawer.show();
        }
    }//GEN-LAST:event_bouton3ActionPerformed
      
    private void showClientInterface() {
        Client clientInterface = new Client();
        clientInterface.setVisible(true);
       
    }

    private void showChambresInterface() {
        Chambres chambresInterface = new Chambres();
        chambresInterface.setVisible(true);
  
    }

    private void showReservationInterface() {
        Reservation reservationInterface = new Reservation();
        reservationInterface.setVisible(true);
  
        
    }
    public void showServices(){
        Services service=new Services();
        service.setVisible(true);
      
    }

    private void reActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reActionPerformed

    }//GEN-LAST:event_reActionPerformed

    private void anuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anuActionPerformed

    private void confActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confActionPerformed

    private void VaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VaActionPerformed

    private void nclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nclActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nclActionPerformed

    private void nchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nchActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
          // Assurez-vous que les indices correspondent


    }//GEN-LAST:event_jTable1MouseClicked
     
    }

    public void Table() {
        String[] Reservation = {"id_client", "id_chambre", "Date reserve", "Date d'arriver", "Date de depart", "Validiter"};
        DefaultTableModel model = new DefaultTableModel(null, Reservation);

        try {
            Connection connection = Connect.connecter();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT iid_client, id_chambre, date_d_arrive, date_depart, date_reser, validiter FROM reservation");

            while (result.next()) {
                Object[] row = {
                    result.getString("id_client"),
                    result.getString("id_chambre"),
                    result.getString("date_de reser"),
                    result.getString("date_d_arrive"),
                    result.getString("date_depart"),
                    result.getString("validiter")
                };
                model.addRow(row);
            }
            jTable1.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
            // Gérer l'exception de manière appropriée (affichage d'un message d'erreur, journalisation, etc.)

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new Reservation().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DA;
    private javax.swing.JLabel DP;
    private com.toedter.calendar.JDateChooser DR;
    private javax.swing.JLabel Dar;
    private com.toedter.calendar.JDateChooser Dd;
    private javax.swing.JLabel Dr;
    private javax.swing.JLabel NC;
    private javax.swing.JLabel NCH;
    private javax.swing.JTextField Va;
    private javax.swing.JLabel Val;
    private javax.swing.JButton anu;
    private javax.swing.JButton bouton3;
    private javax.swing.JButton conf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nch;
    private javax.swing.JTextField ncl;
    private javax.swing.JButton re;
    // End of variables declaration//GEN-END:variables

    
    

}
