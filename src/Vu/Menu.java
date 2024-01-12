package Vu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.TextStyle;
import javax.swing.*;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javaswingdev.drawer.EventDrawer;

public class Menu extends javax.swing.JFrame {

    private DrawerController drawer;

    public Menu() {
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
                            case 2 ->
                                showReservationInterface();
                            // Ajoutez d'autres cas si nécessaire
                        }
                    }
                })
                .build();

        JPanel contentPanel = new JPanel(new BorderLayout());
        bout1 = new javax.swing.JButton("CLIQUE");
        bout1.setBackground(new java.awt.Color(255, 153, 153));
        bout1.setOpaque(true);
        bout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bout1ActionPerformed(evt);
            }
        });
        contentPanel.add(bout1, BorderLayout.NORTH);
        contentPanel.add(jLabel3, BorderLayout.CENTER);
        setContentPane(contentPanel);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        bout1 = new javax.swing.JButton();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(918, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bout1.setBackground(new java.awt.Color(255, 153, 153));
        bout1.setText("|||");
        bout1.setOpaque(true);
        bout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bout1ActionPerformed(evt);
            }
        });
        getContentPane().add(bout1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 125, 34));

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        getContentPane().add(kGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 0, 900, 34));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vu/photo.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1030, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bout1ActionPerformed
        if (drawer.isShow()) {
            drawer.hide();
        } else {
            drawer.show();
        }
    }//GEN-LAST:event_bout1ActionPerformed
    private void showClientInterface() {
        Client clientInterface = new Client();
        clientInterface.setVisible(true);
        Menu.this.dispose();
    }

    private void showChambresInterface() {
        Chambres chambresInterface = new Chambres();
        chambresInterface.setVisible(true);
        Menu.this.dispose();
    }

    private void showReservationInterface() {
        Reservation reservationInterface = new Reservation();
        reservationInterface.setVisible(true);
        Menu.this.dispose();
        
    }
    public void showServices(){
        Services service=new Services();
        service.setVisible(true);
        Menu.this.dispose();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bout1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private keeptoo.KGradientPanel kGradientPanel2;
    // End of variables declaration//GEN-END:variables

    private void build() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void add(ImagePanel backgroundPanel, String CENTER) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
