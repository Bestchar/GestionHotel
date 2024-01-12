package Vu;

import Controlleur.Chambre;
import Controlleur.Clients;
import Model.Chambr;
import Model.ClientM;
import Model.Connect;
import static Vu.Client.id_client;
import java.awt.Color;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.Font;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javaswingdev.drawer.EventDrawer;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Chambres extends javax.swing.JFrame {

    public DrawerController drawer;
    public static String id_chambre;
           Connection connection = Connect.connecter();
           Statement statment=null;

    public Chambres() {
        initComponents();
        initDrawer();
        Tableau();

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
                            case 2 ->
                                showReservationInterface();
                            // Ajoutez d'autres cas si nécessaire
                        }
                    }
                })
                .build();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        typc = new javax.swing.JLabel();
        NC = new javax.swing.JTextField();
        Nrc = new javax.swing.JLabel();
        Ca = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tp4 = new javax.swing.JComboBox<>();
        Trf = new javax.swing.JLabel();
        Sit = new javax.swing.JLabel();
        tp2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        aj = new javax.swing.JButton();
        sup = new javax.swing.JButton();
        mod = new javax.swing.JButton();
        actu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Eta = new javax.swing.JLabel();
        tp3 = new javax.swing.JComboBox<>();
        pri = new javax.swing.JComboBox<>();
        tps = new javax.swing.JComboBox<>();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setPreferredSize(new java.awt.Dimension(1207, 507));

        typc.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        typc.setText("Types de chambres");

        NC.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        NC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NCActionPerformed(evt);
            }
        });

        Nrc.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        Nrc.setText("Num_Chambre");

        Ca.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        Ca.setText("Caracteristique");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(692, 692, 692)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(381, 381, 381)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tp4.setFont(new java.awt.Font("FreeSerif", 1, 21)); // NOI18N
        tp4.setForeground(new java.awt.Color(0, 102, 255));
        tp4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libre", "Occuper", " ", " " }));
        tp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tp4ActionPerformed(evt);
            }
        });

        Trf.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        Trf.setText("Tarif");

        Sit.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        Sit.setText("Situation");

        tp2.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        tp2.setForeground(new java.awt.Color(0, 102, 255));
        tp2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choisir ", "Ventilé", "Climatisé" }));
        tp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tp2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("FreeSerif", 1, 24)); // NOI18N
        jButton1.setText("MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        aj.setBackground(new java.awt.Color(0, 102, 102));
        aj.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        aj.setForeground(new java.awt.Color(255, 255, 255));
        aj.setText("AJOUTER");
        aj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajActionPerformed(evt);
            }
        });

        sup.setBackground(new java.awt.Color(255, 51, 51));
        sup.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        sup.setForeground(new java.awt.Color(255, 255, 255));
        sup.setText("SUPPRIMER");
        sup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supActionPerformed(evt);
            }
        });

        mod.setBackground(new java.awt.Color(51, 0, 0));
        mod.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        mod.setForeground(new java.awt.Color(255, 255, 255));
        mod.setText("MODIFIER");
        mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modActionPerformed(evt);
            }
        });

        actu.setBackground(new java.awt.Color(0, 102, 153));
        actu.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        actu.setForeground(new java.awt.Color(255, 255, 255));
        actu.setText("ACTUALISER");
        actu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actuActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("FreeSerif", 1, 17)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Num_Chambre", "Type de Chambre", "Caracteristique", "Situation", "Tarif"
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Eta.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        Eta.setText("Etat de la chambres");

        tp3.setBackground(new java.awt.Color(204, 204, 255));
        tp3.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        tp3.setForeground(new java.awt.Color(0, 102, 255));
        tp3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choisir", " Vue mer", " vue jardin", "vue rue", " vue montagne" }));
        tp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tp3ActionPerformed(evt);
            }
        });

        pri.setBackground(new java.awt.Color(255, 204, 204));
        pri.setEditable(true);
        pri.setFont(new java.awt.Font("GentiumAlt", 0, 20)); // NOI18N
        pri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10000", "15000", "20000" }));
        pri.setOpaque(true);

        tps.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        tps.setForeground(new java.awt.Color(0, 102, 255));
        tps.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double", "Triple", " " }));
        tps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Trf, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(pri, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(Eta, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Sit, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Nrc, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(NC, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(typc, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tps, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Ca, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(92, 92, 92)
                                        .addComponent(tp2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mod, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(aj, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(93, 93, 93)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(actu)
                                    .addComponent(sup)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tp3, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tp4, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)))
                        .addGap(159, 159, 159)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(NC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Nrc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(typc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Ca, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Sit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Eta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Trf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(sup, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(aj, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(actu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(141, 141, 141))))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1293, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if (drawer.isShow()) {
            drawer.hide();
        } else {
            drawer.show();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
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
    private void NCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NCActionPerformed

    private void tp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tp4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tp4ActionPerformed

    private void tp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tp2ActionPerformed
        // TODO add your handling code here:
       

    }//GEN-LAST:event_tp2ActionPerformed

    private void ajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajActionPerformed

   int num=Integer.parseInt(NC.getText());
   String type=tps.getSelectedItem().toString();
   String caracteristique=tp2.getSelectedItem().toString();
   String situation=tp3.getSelectedItem().toString();
   String etat=tp4.getSelectedItem().toString();
   String tarif=pri.getSelectedItem().toString();
   int Tarif=Integer.parseInt(tarif);
   
   Chambr chambre=new Chambr();
   chambre.setCaracteristique(caracteristique);
   chambre.setEtat(etat);
   chambre.setNum_Chambre(num);
   chambre.setSituation(situation);
   chambre.setPrix(Tarif);
   chambre.setType(type);
   Chambre chambreControleur=new Chambre();
   chambreControleur.ajouterChambre(chambre);
        System.out.println("ajouter");
    
   Tableau();
    }//GEN-LAST:event_ajActionPerformed

    private void supActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supActionPerformed

    // Récupérer l'ID de la ligne sélectionnée (utilisez la deuxième colonne, index 1)

    // Demander confirmation à l'utilisateur
    int result = JOptionPane.showConfirmDialog(null, "Voulez-vous supprimer cette chambre?", "Confirmation", JOptionPane.YES_NO_OPTION);

    if (result == JOptionPane.YES_OPTION) {
        // Appeler la méthode de suppression du contrôleur
        int id_Chambre=Integer.parseInt(id_chambre);
        Chambre controlleur=new Chambre();
        boolean deletionSuccess =controlleur.DeleteChambre(id_Chambre);

        // Vérifier si la suppression a réussi
        if (deletionSuccess) {
            // Actualiser la JTable après la suppression
            Tableau();
        } else {
            JOptionPane.showMessageDialog(null, "Erreur lors de la suppression de la chambre.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
 else {
    JOptionPane.showMessageDialog(null, "Veuillez sélectionner une chambre dans la liste.", "Erreur", JOptionPane.ERROR_MESSAGE);
    Tableau(); // Actualiser la JTable même si aucune chambre n'a été supprimée
}

    }//GEN-LAST:event_supActionPerformed

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
        // TODO add your handling code here:
    int numChambre = Integer.parseInt(NC.getText());
    String type = tps.getSelectedItem().toString();
    String caracteristique = tp2.getSelectedItem().toString();
    String situation = tp3.getSelectedItem().toString();
    String etat = tp4.getSelectedItem().toString();
    int tarif = Integer.parseInt(pri.getSelectedItem().toString());

    Chambr chambre = new Chambr();
    chambre.setNum_Chambre(numChambre);
    chambre.setType(type);
    chambre.setCaracteristique(caracteristique);
    chambre.setSituation(situation);
    chambre.setEtat(etat);
    chambre.setPrix(tarif);

    Chambre controleur = new Chambre();

    boolean success = controleur.modiChambre(chambre);

    if (success) {
        JOptionPane.showMessageDialog(null, "Chambre a ete modifier avec succès");
    } else {
        JOptionPane.showMessageDialog(null, "Impossible de modifier la chambre", "Erreur", JOptionPane.ERROR_MESSAGE);
    }


  Tableau();
    }//GEN-LAST:event_modActionPerformed

    private void actuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actuActionPerformed

    private void tp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tp3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tp3ActionPerformed

    private void tpsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpsActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        /// TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();

if (selectedRow != -1) {
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    id_chambre = model.getValueAt(selectedRow, 0).toString();
    NC.setText(model.getValueAt(selectedRow, 5).toString());
    tps.setSelectedItem(model.getValueAt(selectedRow, 1).toString());
    tp2.setSelectedItem(model.getValueAt(selectedRow, 2).toString());
    tp3.setSelectedItem(model.getValueAt(selectedRow, 3).toString());
    tp4.setSelectedItem(model.getValueAt(selectedRow, 6).toString());
    pri.setSelectedItem(model.getValueAt(selectedRow, 4).toString());
    // Assurez-vous que les indices correspondent
    
    
}


    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public void Tableau() {
        String[] chambreColonnes = {"id_chambre","type de Chambre", "caracteristique de Chambre", "situation", "tarif", "NUM_Chambre", "Etat_Chambre"};
        String [] show=new String [7];
        DefaultTableModel model = new DefaultTableModel(null,chambreColonnes);

        try {
            
             statment = connection.createStatement();
            ResultSet result = statment.executeQuery("SELECT id_chambre ,type ,caracteristique ,situation ,tarif ,NUM_Chambre ,Etat_Chambre FROM Chambres");

            while (result.next()) {
                // Récupérer les données de chaque colonne
              show[0]=result.getString("id_chambre");
                show[1]= result.getString("type");
                show[2]= result.getString("caracteristique");
                show[3]= result.getString("situation");
                 show[4] = result.getString("tarif");
                 show[5] = result.getString("NUM_Chambre");
                 show[6] = result.getString("Etat_Chambre");
              model.addRow(show);
            }
            jTable1.setModel(model);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chambres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Ca;
    private javax.swing.JLabel Eta;
    private javax.swing.JTextField NC;
    private javax.swing.JLabel Nrc;
    private javax.swing.JLabel Sit;
    private javax.swing.JLabel Trf;
    private javax.swing.JButton actu;
    private javax.swing.JButton aj;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton mod;
    private javax.swing.JComboBox<String> pri;
    private javax.swing.JButton sup;
    private javax.swing.JComboBox<String> tp2;
    private javax.swing.JComboBox<String> tp3;
    private javax.swing.JComboBox<String> tp4;
    private javax.swing.JComboBox<String> tps;
    private javax.swing.JLabel typc;
    // End of variables declaration//GEN-END:variables

  

    

}


