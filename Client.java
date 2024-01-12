package Vu;

import Controlleur.Carte;
import Controlleur.Clients;
import Model.CarteM;
import Model.ClientM;
import Model.Connect;
import static Model.Connect.connecter;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.HashSet;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javaswingdev.drawer.EventDrawer;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author charles_4545
 */
public final class Client extends javax.swing.JFrame {

    public DrawerController drawer;
    public String path;
    public static String id_client;
    Connection Connexion = connecter();
    PreparedStatement statement = null;

    public Client() {
        initComponents();
        points.setVisible(false);
        fai.setVisible(false);
        exp.setVisible(false);
        numC.setVisible(false);
        date1.setVisible(false);
        date2.setVisible(false);
        nc.setVisible(false);
        pt.setVisible(false);
        displayClientTable();

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

        bou = new javax.swing.JButton();
        rearch = new javax.swing.JPanel();
        pre = new javax.swing.JLabel();
        cli = new javax.swing.JTextField();
        nom = new javax.swing.JLabel();
        pren = new javax.swing.JTextField();
        na = new javax.swing.JLabel();
        nat = new javax.swing.JComboBox<>();
        cf = new javax.swing.JLabel();
        type = new javax.swing.JLabel();
        oui = new javax.swing.JCheckBox();
        non = new javax.swing.JCheckBox();
        nc = new javax.swing.JLabel();
        typ = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        fone = new javax.swing.JLabel();
        tel = new javax.swing.JTextField();
        fai = new javax.swing.JLabel();
        exp = new javax.swing.JLabel();
        points = new javax.swing.JLabel();
        pt = new javax.swing.JTextField();
        sup = new javax.swing.JButton();
        mod = new javax.swing.JButton();
        actu = new javax.swing.JButton();
        aj = new javax.swing.JButton();
        date2 = new com.toedter.calendar.JDateChooser();
        date1 = new com.toedter.calendar.JDateChooser();
        Photo = new javax.swing.JLabel();
        Ph = new javax.swing.JButton();
        numC = new javax.swing.JTextField();
        recherche = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("eufm10", 1, 18)); // NOI18N

        bou.setBackground(new java.awt.Color(255, 204, 204));
        bou.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        bou.setText("Menu");
        bou.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bou.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouActionPerformed(evt);
            }
        });

        rearch.setBackground(new java.awt.Color(233, 235, 236));

        pre.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        pre.setText("Penom");

        cli.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cliActionPerformed(evt);
            }
        });

        nom.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        nom.setText("Nom");

        pren.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N

        na.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        na.setText("Nationalité");

        nat.setBackground(new java.awt.Color(204, 204, 255));
        nat.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        nat.setForeground(new java.awt.Color(0, 102, 255));
        nat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TOGO", "BENIN", "GHANA", "FRANCE", "USA", "CANADA" }));
        nat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                natActionPerformed(evt);
            }
        });

        cf.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        cf.setText("Carte de fidelité");

        type.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        type.setText("Categorie");

        oui.setText("OUI");
        oui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ouiActionPerformed(evt);
            }
        });

        non.setText("NON");
        non.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nonActionPerformed(evt);
            }
        });

        nc.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        nc.setText("Num_Carte");

        typ.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        typ.setForeground(new java.awt.Color(0, 102, 255));
        typ.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clients privés", "Clients affaires", "Clients groupes", "Clients TOPS ou VIP", " " }));
        typ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("FreeSerif", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nom", "Prenom", "Nationalite", "T.Clients", "Telepnone", "Carte "
            }
        ));
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.setSelectionBackground(new java.awt.Color(0, 204, 204));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fone.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        fone.setText("Telephone");

        tel.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telActionPerformed(evt);
            }
        });

        fai.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        fai.setText("Fait le");

        exp.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        exp.setText("Expire le");

        points.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        points.setText("Points");

        pt.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        pt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptActionPerformed(evt);
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

        aj.setBackground(new java.awt.Color(0, 102, 102));
        aj.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        aj.setForeground(new java.awt.Color(255, 255, 255));
        aj.setText("AJOUTER");
        aj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajActionPerformed(evt);
            }
        });

        date2.setBackground(new java.awt.Color(255, 204, 204));
        date2.setDateFormatString("yyyy-MM-dd");

        date1.setDateFormatString("yyyy-MM-dd");

        Photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        Ph.setBackground(new java.awt.Color(255, 153, 153));
        Ph.setFont(new java.awt.Font("L M Mono10", 1, 18)); // NOI18N
        Ph.setText("PHOTO\n");
        Ph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhActionPerformed(evt);
            }
        });

        numC.setFont(new java.awt.Font("FreeSerif", 1, 22)); // NOI18N
        numC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rearchLayout = new javax.swing.GroupLayout(rearch);
        rearch.setLayout(rearchLayout);
        rearchLayout.setHorizontalGroup(
            rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rearchLayout.createSequentialGroup()
                .addGroup(rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rearchLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rearchLayout.createSequentialGroup()
                                .addGroup(rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(rearchLayout.createSequentialGroup()
                                        .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(76, 76, 76)
                                        .addComponent(typ, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(rearchLayout.createSequentialGroup()
                                        .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(17, 17, 17)
                                        .addComponent(cli, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(pre, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)))
                                .addComponent(pren, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(rearchLayout.createSequentialGroup()
                                .addGroup(rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(rearchLayout.createSequentialGroup()
                                        .addGroup(rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(nc, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(rearchLayout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addGroup(rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(points, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(fai, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(41, 41, 41)
                                        .addGroup(rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(pt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(rearchLayout.createSequentialGroup()
                                        .addComponent(cf)
                                        .addGap(18, 18, 18)
                                        .addComponent(oui, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(non, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rearchLayout.createSequentialGroup()
                                        .addComponent(Photo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(96, 96, 96))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rearchLayout.createSequentialGroup()
                                        .addComponent(Ph)
                                        .addGap(128, 128, 128))))))
                    .addGroup(rearchLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(mod)
                        .addGap(35, 35, 35)
                        .addGroup(rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sup)
                            .addComponent(actu))
                        .addGap(0, 217, Short.MAX_VALUE)))
                .addGap(141, 141, 141)
                .addComponent(na, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(nat, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rearchLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rearchLayout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(fone, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1021, Short.MAX_VALUE)))
            .addGroup(rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rearchLayout.createSequentialGroup()
                    .addGap(219, 219, 219)
                    .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(759, Short.MAX_VALUE)))
            .addGroup(rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rearchLayout.createSequentialGroup()
                    .addGap(144, 144, 144)
                    .addComponent(aj)
                    .addContainerGap(873, Short.MAX_VALUE)))
            .addGroup(rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rearchLayout.createSequentialGroup()
                    .addGap(150, 150, 150)
                    .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(966, Short.MAX_VALUE)))
            .addGroup(rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rearchLayout.createSequentialGroup()
                    .addGap(153, 153, 153)
                    .addComponent(numC, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(988, Short.MAX_VALUE)))
        );
        rearchLayout.setVerticalGroup(
            rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rearchLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(na, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nom, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rearchLayout.createSequentialGroup()
                        .addGroup(rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(typ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(rearchLayout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addGroup(rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(non, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(rearchLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(oui, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addComponent(nc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addGroup(rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(points, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addComponent(fai, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(exp, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(date2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sup, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(mod, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(actu, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15))
                            .addGroup(rearchLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                                .addComponent(Photo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Ph)
                                .addGap(276, 276, 276))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rearchLayout.createSequentialGroup()
                    .addGap(138, 138, 138)
                    .addComponent(fone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(356, Short.MAX_VALUE)))
            .addGroup(rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rearchLayout.createSequentialGroup()
                    .addGap(138, 138, 138)
                    .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(356, Short.MAX_VALUE)))
            .addGroup(rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rearchLayout.createSequentialGroup()
                    .addContainerGap(416, Short.MAX_VALUE)
                    .addComponent(aj, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(72, 72, 72)))
            .addGroup(rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rearchLayout.createSequentialGroup()
                    .addGap(346, 346, 346)
                    .addComponent(date1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(242, 242, 242)))
            .addGroup(rearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(rearchLayout.createSequentialGroup()
                    .addGap(231, 231, 231)
                    .addComponent(numC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(355, Short.MAX_VALUE)))
        );

        recherche.setFont(new java.awt.Font("FreeSerif", 1, 20)); // NOI18N
        recherche.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(255, 204, 153), new java.awt.Color(0, 102, 102), null, null));
        recherche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rechercheMouseClicked(evt);
            }
        });
        recherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechercheActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vu/icons8-search-24.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bou, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(253, 253, 253)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(recherche, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bou, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(recherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(rearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bouActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouActionPerformed
        if (drawer.isShow()) {
            drawer.hide();
        } else {
            drawer.show();
        } 
       
    }//GEN-LAST:event_bouActionPerformed
 
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

    private void cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cliActionPerformed

    private void ouiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ouiActionPerformed
        // TODO add your handling code here:
        if (oui.isSelected()) {
            points.setVisible(true);
            fai.setVisible(true);
            exp.setVisible(true);
            numC.setVisible(true);
            date1.setVisible(true);
            date2.setVisible(true);
            nc.setVisible(true);
            pt.setVisible(true);
       

        }
    }//GEN-LAST:event_ouiActionPerformed

    private void nonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nonActionPerformed
        // TODO add your handling code here:
        if (non.isSelected()) {
            points.setVisible(false);
            fai.setVisible(false);
            exp.setVisible(false);
            numC.setVisible(false);
            date1.setVisible(false);
            date2.setVisible(false);
            nc.setVisible(false);
            pt.setVisible(false);

        } else {

        }


    }//GEN-LAST:event_nonActionPerformed

    private void typActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typActionPerformed

    private void telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telActionPerformed

    private void ptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ptActionPerformed

    private void supActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supActionPerformed
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            // Récupérer l'ID de la ligne sélectionnée (utilisez la deuxième colonne, index 1)
            id_client = jTable1.getValueAt(selectedRow, 0).toString();

            // Demander confirmation à l'utilisateur
            int result = JOptionPane.showConfirmDialog(null, "Voulez-vous supprimer ce client?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if (result == JOptionPane.YES_OPTION) {
                // Appeler la méthode de suppression du contrôleur

                supprimerClient(id_client);
                // Actualiser la JTable après la suppression
                displayClientTable();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Veuillez sélectionner un client dans la liste.", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_supActionPerformed

    private void modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modActionPerformed
        // TODO add your handling code here:

        String nom = cli.getText();
        String prenom = pren.getText();
        String na = nat.getSelectedItem().toString();
        int te = Integer.parseInt(tel.getText());
        String type = typ.getSelectedItem().toString();

        ClientM client = new ClientM();
        client.setNom(nom);
        client.setPrenom(prenom);
        client.setNationalite(na);
        client.setTelephone(te);
        client.setCategorie(type);

        Clients controleur = new Clients();

        boolean success = controleur.set(client);

        if (success) {
            JOptionPane.showMessageDialog(null, "Client modifié avec succès");
            // Réinitialiser les champs ou effectuer d'autres actions si nécessaire
        } else {
            JOptionPane.showMessageDialog(null, "erreur de modification");
        }
        displayClientTable();
    }//GEN-LAST:event_modActionPerformed

    private void actuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actuActionPerformed

    private void ajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajActionPerformed
        try {
            ajouterClient();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Veuillez entrer un numéro de téléphone valide.", "Erreur", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite : " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void ajouterClient() throws Exception {
        String nom = cli.getText();
        String prenom = pren.getText();
        String na = nat.getSelectedItem().toString();
        int te = Integer.parseInt(tel.getText());
        String type = typ.getSelectedItem().toString();
        int nc = Integer.parseInt(numC.getText());
        int points = Integer.parseInt(pt.getText());
        LocalDate fai = date1.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate exp = date2.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        ClientM client = new ClientM();
        client.setNom(nom);
        client.setPrenom(prenom);
        client.setNationalite(na);
        client.setTelephone(te);
        client.setCategorie(type);

        CarteM carteFidelite = new CarteM();
        carteFidelite.setNumerocarte(nc);
        carteFidelite.setPoint_de_fidelite(points);
        carteFidelite.setDate_de_delivrance(Date.valueOf(fai));
        carteFidelite.setDateExpiration(Date.valueOf(exp));

        Clients controleurClients = new Clients();
        boolean successClient = controleurClients.add(client);

        if (successClient) {
            // Appel du contrôleur de la carte de fidélité pour ajouter la carte à la base de données
            Carte controleurCarte = new Carte();
            boolean successCarte = controleurCarte.ajouterCarteFidelite(carteFidelite);

            if (successCarte) {
                JOptionPane.showMessageDialog(null, "Client et carte de fidélité ajoutés avec succès");
                // Réinitialiser les champs ou effectuer d'autres actions si nécessaire
                displayClientTable();
            } else {
                throw new Exception("Impossible d'ajouter la carte de fidélité");
            }
        } else {
            throw new Exception("Impossible d'ajouter le client");
        }

    }//GEN-LAST:event_ajActionPerformed

    private void rechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechercheActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_rechercheActionPerformed

    private void natActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_natActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_natActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            id_client = (String) model.getValueAt(selectedRow, 0); //!= null ? model.getValueAt(selectedRow, 0).toString() : "";
            cli.setText(model.getValueAt(selectedRow, 1).toString());
            pren.setText(model.getValueAt(selectedRow, 2).toString());
            nat.setSelectedItem(model.getValueAt(selectedRow, 3).toString());
            tel.setText(model.getValueAt(selectedRow, 4).toString());
            typ.setSelectedItem(model.getValueAt(selectedRow, 5));
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void PhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();

            if (file != null) {
                String path = file.getAbsolutePath();

                try {
                    BufferedImage Ph = ImageIO.read(new File(path));
                    Image image = Ph.getScaledInstance(153, 140, Image.SCALE_SMOOTH);
                    ImageIcon icon = new ImageIcon(image);
                    Photo.setIcon(icon);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                // L'utilisateur a annulé la sélection, gérer en conséquence
            }
        } else {
            // L'utilisateur a annulé la sélection, gérer en conséquence
        }


    }//GEN-LAST:event_PhActionPerformed

    private void rechercheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rechercheMouseClicked
        // TODO add your handling code here:
        recherche.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                searchAndUpdateTable();
            }

            public void removeUpdate(DocumentEvent e) {
                searchAndUpdateTable();
            }

            public void changedUpdate(DocumentEvent e) {
                // Si le document prend en charge des modifications de style, vous pouvez les gérer ici.
            }

            private void searchAndUpdateTable() {
                String searchText = recherche.getText();

                try {
                    String searchQuery = "SELECT id_client,nom, prenom, origne, numero_de_telephone, categorie  FROM clients WHERE nom LIKE ?";
                    Connect.connecter();
                    statement = Connexion.prepareStatement(searchQuery);
                    statement.setString(1, "%" + searchText + "%");
                    ResultSet result = statement.executeQuery();

                    // Création du modèle de table pour stocker les résultats
                    DefaultTableModel model = new DefaultTableModel();
                    jTable1.setModel(model);

                    // Ajout des colonnes à la table
                    ResultSetMetaData metaData = (ResultSetMetaData) result.getMetaData();
                    int columnCount = metaData.getColumnCount();
                    for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                        model.addColumn(metaData.getColumnName(columnIndex));
                    }

                    // Ajout des données à la table
                    while (result.next()) {
                        Object[] rowData = new Object[columnCount];
                        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                            rowData[columnIndex - 1] = result.getObject(columnIndex);
                        }
                        model.addRow(rowData);
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }//GEN-LAST:event_rechercheMouseClicked

    private void numCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numCActionPerformed

    public void displayClientTable() {
        String[] clientColumns = {"id_client", "Nom", "Prénom", "Nationalité", "Téléphone", "Catégorie", "date"};
        DefaultTableModel model = new DefaultTableModel(null, clientColumns);

        try {
            Connection connection = Connect.connecter();
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT id_client,nom, prenom, origne, numero_de_telephone, categorie FROM clients");

            while (result.next()) {
                Object[] row = {
                    result.getString("id_client"),
                    result.getString("nom"),
                    result.getString("prenom"),
                    result.getString("origne"),
                    result.getString("numero_de_telephone"),
                    result.getString("categorie")
                };
                model.addRow(row);
            }

            jTable1.setModel(model);

        } catch (SQLException e) {
            e.printStackTrace();
            // Gérer l'exception de manière appropriée (affichage d'un message d'erreur, journalisation, etc.)
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Client client = new Client();
                Menu menu = new Menu();

                client.setVisible(true);
                menu.setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ph;
    private javax.swing.JLabel Photo;
    private javax.swing.JButton actu;
    private javax.swing.JButton aj;
    private javax.swing.JButton bou;
    private javax.swing.JLabel cf;
    private javax.swing.JTextField cli;
    private com.toedter.calendar.JDateChooser date1;
    private com.toedter.calendar.JDateChooser date2;
    private javax.swing.JLabel exp;
    private javax.swing.JLabel fai;
    private javax.swing.JLabel fone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton mod;
    private javax.swing.JLabel na;
    private javax.swing.JComboBox<String> nat;
    private javax.swing.JLabel nc;
    private javax.swing.JLabel nom;
    private javax.swing.JCheckBox non;
    private javax.swing.JTextField numC;
    private javax.swing.JCheckBox oui;
    private javax.swing.JLabel points;
    private javax.swing.JLabel pre;
    private javax.swing.JTextField pren;
    private javax.swing.JTextField pt;
    private javax.swing.JPanel rearch;
    private javax.swing.JTextField recherche;
    private javax.swing.JButton sup;
    private javax.swing.JTextField tel;
    private javax.swing.JComboBox<String> typ;
    private javax.swing.JLabel type;
    // End of variables declaration//GEN-END:variables

    private void supprimerClient(String id_client) {

        Clients controleur = new Clients();
        boolean success = controleur.supprimerClient(id_client);

        if (success) {
            JOptionPane.showMessageDialog(null, "Client supprimé avec succès");
            displayClientTable();  // Actualiser la JTable après la suppression
        } else {
            JOptionPane.showMessageDialog(null, "Impossible de supprimer le client", "Erreur", JOptionPane.ERROR_MESSAGE);
        }
    }
}
