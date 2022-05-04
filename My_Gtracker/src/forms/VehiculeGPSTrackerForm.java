/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import entities.Tracker;
import entities.Vehicule;
import entities.VehiculeGPSTracker;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import service.TrackerService;
import service.VehiculeGPSTrackerService;
import service.VehiculeService;

/**
 *
 * @author yassi
 */
public class VehiculeGPSTrackerForm extends javax.swing.JInternalFrame {
    private VehiculeGPSTrackerService vts;
    private VehiculeService vs;
    private TrackerService ts;
    private DefaultTableModel model;
    private static int idgps;
    /**
     * Creates new form VehiculeGPSTracker
     */
    public VehiculeGPSTrackerForm() {
        initComponents();
        vts = new VehiculeGPSTrackerService();
        vs = new VehiculeService();
        ts = new TrackerService();

        model = (DefaultTableModel) listeVehiculeTracker.getModel();
        ChargerTrackers();
        ChargerVehicule();
        load_VehiculeTracker();
    }

    private void ChargerTrackers() {
        for (Tracker t : ts.findAll()) {
            cmb_trackers.addItem(t);
        }

    }

    private void ChargerVehicule() {
        for (Vehicule v : vs.findAll()) {
            cmb_vehicule.addItem(v);
        }

    }

    private void load_VehiculeTracker() {
        model.setRowCount(0);
        for (entities.VehiculeGPSTracker v : vts.findAll()) {
            model.addRow(new Object[]{
                v.getId(),
                v.getDateDebut(),
                v.getDateFin(),
                v.getTracker(),
                v.getVehicule()
                
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_datedebut = new com.toedter.calendar.JDateChooser();
        txt_date_fin = new com.toedter.calendar.JDateChooser();
        cmb_trackers = new javax.swing.JComboBox();
        cmb_vehicule = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listeVehiculeTracker = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setText("Date_Debut :");

        jLabel2.setText("Date_Fin :");

        jLabel3.setText("Tracker :");

        jLabel4.setText("Vehicule :");

        txt_date_fin.setEnabled(false);

        jButton1.setText("Supprimer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ajouter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Affecter_Date_Fin");
        jButton4.setEnabled(false);
        jButton4.setMargin(new java.awt.Insets(2, 4, 2, 4));
        jButton4.setMinimumSize(new java.awt.Dimension(50, 15));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_datedebut, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                            .addComponent(cmb_trackers, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(57, 57, 57))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(106, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_date_fin, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                        .addComponent(cmb_vehicule, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_datedebut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_date_fin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(cmb_trackers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_vehicule, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));

        listeVehiculeTracker.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Date_Debut", "Date_Fin", "Tracker", "Vehicule"
            }
        ));
        listeVehiculeTracker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listeVehiculeTrackerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listeVehiculeTracker);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         int reponse = JOptionPane.showConfirmDialog(this, "Voulez vous vraiment supprimer ce vehiculegpstracker");
        if (reponse == 0) {
            if (vts.delete(vts.findById(idgps))) {
                JOptionPane.showMessageDialog(this, " VehiculeGPStracker a été bien supprimé");
                load_VehiculeTracker();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Date dateDebut = txt_datedebut.getDate();
        Vehicule vehicule = (Vehicule) cmb_vehicule.getSelectedItem();
        Tracker tracker = (Tracker) cmb_trackers.getSelectedItem();

        if (vts.create(new VehiculeGPSTracker(dateDebut, null, tracker, vehicule))) {
            JOptionPane.showMessageDialog(this, "VehiculeTracker bien enregistrée");
            load_VehiculeTracker();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void listeVehiculeTrackerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listeVehiculeTrackerMouseClicked

        idgps = Integer.parseInt(model.getValueAt(listeVehiculeTracker.getSelectedRow(), 0).toString());
        txt_datedebut.setDate((Date) model.getValueAt(listeVehiculeTracker.getSelectedRow(), 1));
        cmb_vehicule.setSelectedItem((Vehicule) model.getValueAt(listeVehiculeTracker.getSelectedRow(), 4));
        cmb_trackers.setSelectedItem((Tracker) model.getValueAt(listeVehiculeTracker.getSelectedRow(), 3));
        jButton4.setEnabled(true);
        txt_date_fin.setEnabled(true);
        txt_datedebut.setEnabled(false);
        cmb_vehicule.setEnabled(false);
        cmb_trackers.setEnabled(false);
    }//GEN-LAST:event_listeVehiculeTrackerMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       VehiculeGPSTracker vt = vts.findById(idgps);
  if(txt_date_fin.getDate() != null ){
   vt.setDateFin(txt_date_fin.getDate());
   int reponse = JOptionPane.showConfirmDialog(this, "Voulez vous vraiment affecter la date fin a  ce VehiculeGPStracker");

        if (reponse == 0 ) {
            if (vts.update(vt)) {
                JOptionPane.showMessageDialog(this, "Date modifié");
                load_VehiculeTracker();
                 jButton4.setEnabled(false);
                 txt_date_fin.setEnabled(false);
                 txt_datedebut.setEnabled(true);
        cmb_vehicule.setEnabled(true);
        cmb_trackers.setEnabled(true);
                 
            }
        }
   }else{
      JOptionPane.showMessageDialog(this, 
  "Veuillez choisir une date fin ", "Failure", JOptionPane.ERROR_MESSAGE);
  }
        
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmb_trackers;
    private javax.swing.JComboBox cmb_vehicule;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listeVehiculeTracker;
    private com.toedter.calendar.JDateChooser txt_date_fin;
    private com.toedter.calendar.JDateChooser txt_datedebut;
    // End of variables declaration//GEN-END:variables
}
