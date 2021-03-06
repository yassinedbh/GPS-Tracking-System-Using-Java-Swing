/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import entities.Vehicule;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.VehiculeService;

/**
 *
 * @author yassi
 */
public class VehiculeForm extends javax.swing.JInternalFrame {
         private VehiculeService ts;
    private DefaultTableModel model;
    private static int id;
    /**
     * Creates new form VehiculeForm
     */
    public VehiculeForm() {
        initComponents();
        ts = new VehiculeService();
        model = (DefaultTableModel) ListeVehicule.getModel();
        load();
    }
     private void load() {
        model.setRowCount(0);
        for (Vehicule t : ts.findAll()) {
            model.addRow(new Object[]{
                t.getId(),
                t.getMatricule(),
                t.getMarque(),
                t.getType()
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
        marquetext = new javax.swing.JTextField();
        matriculetext = new javax.swing.JTextField();
        Typetext = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListeVehicule = new javax.swing.JTable();

        setBackground(new java.awt.Color(51, 255, 204));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nouveau Vehicule", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        marquetext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marquetextActionPerformed(evt);
            }
        });

        matriculetext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matriculetextActionPerformed(evt);
            }
        });

        Typetext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TypetextActionPerformed(evt);
            }
        });

        jLabel1.setText("Matricule :");

        jLabel2.setText("Marque :");

        jLabel3.setText("Type :");

        jButton1.setText("Supprimer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modifier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Ajouter");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(126, 126, 126)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Typetext, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marquetext, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matriculetext, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(133, 133, 133))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(matriculetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(marquetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(9, 9, 9)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Typetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(jButton1))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        ListeVehicule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "matricule", "marque", "type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ListeVehicule.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListeVehiculeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListeVehicule);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void marquetextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marquetextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marquetextActionPerformed

    private void matriculetextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matriculetextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matriculetextActionPerformed

    private void TypetextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TypetextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TypetextActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          String Matricule = matriculetext.getText();
          String Marque = marquetext.getText();
          String Type = Typetext.getText();
        if (ts.create(new Vehicule(Matricule,Marque,Type))) {
            JOptionPane.showMessageDialog(this, "Vehicule " + Matricule + " bien enregistr??");
            load();
            matriculetext.setText("");
            marquetext.setText("");
            Typetext.setText("");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void ListeVehiculeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListeVehiculeMouseClicked
      id = Integer.parseInt(model.getValueAt(ListeVehicule.getSelectedRow(), 0).toString());
      matriculetext.setText(model.getValueAt(ListeVehicule.getSelectedRow(), 1).toString());
      marquetext.setText(model.getValueAt(ListeVehicule.getSelectedRow(), 2).toString());
      Typetext.setText(model.getValueAt(ListeVehicule.getSelectedRow(), 3).toString());
      jButton3.setEnabled(false);
    }//GEN-LAST:event_ListeVehiculeMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          int reponse = JOptionPane.showConfirmDialog(this, "Voulez vous vraiment supprimer ce tracker");

        if (reponse == 0 && id != 0) {
            if (ts.delete(ts.findById(id))) {
                JOptionPane.showMessageDialog(this, "Tracker supprim??");
                load();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Vehicule t = ts.findById(id);
        t.setMatricule(matriculetext.getText());
        t.setMarque(marquetext.getText());
        t.setType(Typetext.getText());
        int reponse = JOptionPane.showConfirmDialog(this, "Voulez vous vraiment modifier ce tracker");

        if (reponse == 0 && id != 0) {
            if (ts.update(t)) {
                JOptionPane.showMessageDialog(this, "Tracker modifi??");
                load();
            matriculetext.setText("");
            marquetext.setText("");
            Typetext.setText("");
            jButton3.setEnabled(true);
        jButton1.setEnabled(true);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListeVehicule;
    private javax.swing.JTextField Typetext;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField marquetext;
    private javax.swing.JTextField matriculetext;
    // End of variables declaration//GEN-END:variables
}
