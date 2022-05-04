/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import connexion.Connexion;
import entities.VehiculeGPSTracker;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Lachgar
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        trackerMenu = new javax.swing.JMenuItem();
        PositionMenu = new javax.swing.JMenuItem();
        VehiculeMenu = new javax.swing.JMenuItem();
        VehiculeTrackerMenu = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Géolocalisation des véhicules");

        fileMenu.setMnemonic('f');
        fileMenu.setText("Gestion");

        trackerMenu.setMnemonic('o');
        trackerMenu.setText("Trackers");
        trackerMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trackerMenuActionPerformed(evt);
            }
        });
        fileMenu.add(trackerMenu);

        PositionMenu.setMnemonic('s');
        PositionMenu.setText("Positions");
        PositionMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PositionMenuActionPerformed(evt);
            }
        });
        fileMenu.add(PositionMenu);

        VehiculeMenu.setMnemonic('a');
        VehiculeMenu.setText("Véhicule");
        VehiculeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VehiculeMenuActionPerformed(evt);
            }
        });
        fileMenu.add(VehiculeMenu);

        VehiculeTrackerMenu.setText("VehiculeTracker");
        VehiculeTrackerMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VehiculeTrackerMenuActionPerformed(evt);
            }
        });
        fileMenu.add(VehiculeTrackerMenu);

        jMenuItem1.setText("GpsTracker_Affecté");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem1);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Recherche");

        jMenuItem2.setText("Recherche_Tracker_Par_Vehicule");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem2);

        jMenuItem3.setText("Recherche_Position_Par_Vehicule");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem3);

        menuBar.add(editMenu);

        jMenu1.setText("Statistique");

        jMenuItem4.setText("Nombres_Position_Par_Tracker");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        menuBar.add(jMenu1);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void trackerMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trackerMenuActionPerformed
       desktopPane.removeAll();
       desktopPane.repaint();
        TrackerForm tf = new TrackerForm();
        desktopPane.add(tf);
        tf.setVisible(true);
   
    }//GEN-LAST:event_trackerMenuActionPerformed

    private void PositionMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PositionMenuActionPerformed
        // TODO add your handling code here
       desktopPane.removeAll();
       desktopPane.repaint();
        PositionForm pf = new  PositionForm();
        desktopPane.add(pf);
        pf.setVisible(true);
    }//GEN-LAST:event_PositionMenuActionPerformed

    private void VehiculeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VehiculeMenuActionPerformed
        desktopPane.removeAll();
       desktopPane.repaint();
        VehiculeForm pf = new  VehiculeForm();
        desktopPane.add(pf);
        pf.setVisible(true);
    }//GEN-LAST:event_VehiculeMenuActionPerformed

    private void VehiculeTrackerMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VehiculeTrackerMenuActionPerformed
        desktopPane.removeAll();
       desktopPane.repaint();
        VehiculeGPSTrackerForm pf = new  VehiculeGPSTrackerForm();
        desktopPane.add(pf);
        pf.setVisible(true);
    }//GEN-LAST:event_VehiculeTrackerMenuActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       desktopPane.removeAll();
       desktopPane.repaint();
        Vehicule_GPS_TtackerAffecté_Form tf=new Vehicule_GPS_TtackerAffecté_Form();
       desktopPane.add(tf);
        tf.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       desktopPane.removeAll();
       desktopPane.repaint();
        Recherche_VehiculeForm t =new Recherche_VehiculeForm();
       desktopPane.add(t);
       t.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       desktopPane.removeAll();
       desktopPane.repaint();
        Recherche_PositionForm t=new Recherche_PositionForm();
        desktopPane.add(t);
       t.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       try {
            DefaultCategoryDataset dcd = new DefaultCategoryDataset();
			String req = "SELECT count(*) as Nombres ,t.*,p.* FROM position p inner join tracker  t on t.id=p.idTracker group by p.idTracker; ";
			PreparedStatement pr = Connexion.getConnection().prepareStatement(req);
			ResultSet rs = pr.executeQuery();
			while (rs.next())
			      dcd.setValue(rs.getInt("Nombres"), "", rs.getString("simNumber"));
                        JFreeChart jfc = ChartFactory.createBarChart("Nombres de positions par tracker", "", "", dcd, PlotOrientation.HORIZONTAL, false, false, false);
                        CategoryPlot  c = jfc.getCategoryPlot();
                      c.setRangeGridlinePaint(Color.black);
                      ChartPanel cp = new ChartPanel(jfc);
                      ChartFrame cf = new ChartFrame("Nombres de positions par tracker", jfc);
                      cf.setVisible(true);
                      cf.setSize(1200, 1000);
		} catch (SQLException e) {
			e.printStackTrace();
		}
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem PositionMenu;
    private javax.swing.JMenuItem VehiculeMenu;
    private javax.swing.JMenuItem VehiculeTrackerMenu;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem trackerMenu;
    // End of variables declaration//GEN-END:variables

}
