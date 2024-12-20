
package co.edu.udec.s2.EjercicioFestival.Vistas.GUI;

/**
 *
 * @author Usuario
 */
public class RegistroPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form RegistroFestival
     */
    public RegistroPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        menuArtista = new javax.swing.JMenu();
        itemIngresarArtista = new javax.swing.JMenuItem();
        itemEditarArtista = new javax.swing.JMenuItem();
        itemConsultarArtista = new javax.swing.JMenuItem();
        menuConcierto = new javax.swing.JMenu();
        itemIngresarConcierto = new javax.swing.JMenuItem();
        itemEditarConcierto = new javax.swing.JMenuItem();
        itemConsultarConcierto = new javax.swing.JMenuItem();
        menuFestival = new javax.swing.JMenu();
        itemIngresarFestival = new javax.swing.JMenuItem();
        itemEditarFestival = new javax.swing.JMenuItem();
        itemConsultarFestival = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("- REGISTRO DE FESTIVAL -");

        menuArtista.setText("Artista");
        menuArtista.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        itemIngresarArtista.setText("Ingresar datos...");
        itemIngresarArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemIngresarArtistaActionPerformed(evt);
            }
        });
        menuArtista.add(itemIngresarArtista);

        itemEditarArtista.setText("Editar datos...");
        itemEditarArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarArtistaActionPerformed(evt);
            }
        });
        menuArtista.add(itemEditarArtista);

        itemConsultarArtista.setText("Consultar datos");
        itemConsultarArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarArtistaActionPerformed(evt);
            }
        });
        menuArtista.add(itemConsultarArtista);

        jMenuBar1.add(menuArtista);

        menuConcierto.setText("Concierto");
        menuConcierto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        itemIngresarConcierto.setText("Ingresar datos...");
        itemIngresarConcierto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemIngresarConciertoActionPerformed(evt);
            }
        });
        menuConcierto.add(itemIngresarConcierto);

        itemEditarConcierto.setText("Editar datos...");
        itemEditarConcierto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarConciertoActionPerformed(evt);
            }
        });
        menuConcierto.add(itemEditarConcierto);

        itemConsultarConcierto.setText("Consultar datos");
        itemConsultarConcierto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarConciertoActionPerformed(evt);
            }
        });
        menuConcierto.add(itemConsultarConcierto);

        jMenuBar1.add(menuConcierto);

        menuFestival.setText("Festival");
        menuFestival.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        itemIngresarFestival.setText("Ingresar datos...");
        itemIngresarFestival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemIngresarFestivalActionPerformed(evt);
            }
        });
        menuFestival.add(itemIngresarFestival);

        itemEditarFestival.setText("Editar datos...");
        itemEditarFestival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarFestivalActionPerformed(evt);
            }
        });
        menuFestival.add(itemEditarFestival);

        itemConsultarFestival.setText("Consultar datos");
        itemConsultarFestival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarFestivalActionPerformed(evt);
            }
        });
        menuFestival.add(itemConsultarFestival);

        jMenuBar1.add(menuFestival);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemEditarArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarArtistaActionPerformed
        itemIngresarArtistaActionPerformed(evt);
    }//GEN-LAST:event_itemEditarArtistaActionPerformed

    private void itemConsultarArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarArtistaActionPerformed
        itemIngresarArtistaActionPerformed(evt);
    }//GEN-LAST:event_itemConsultarArtistaActionPerformed

    private void itemEditarConciertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarConciertoActionPerformed
        itemIngresarConciertoActionPerformed(evt);
    }//GEN-LAST:event_itemEditarConciertoActionPerformed

    private void itemConsultarConciertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarConciertoActionPerformed
        itemIngresarConciertoActionPerformed(evt);
    }//GEN-LAST:event_itemConsultarConciertoActionPerformed

    private void itemEditarFestivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarFestivalActionPerformed
        itemIngresarFestivalActionPerformed(evt);
    }//GEN-LAST:event_itemEditarFestivalActionPerformed

    private void itemConsultarFestivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarFestivalActionPerformed
        itemIngresarFestivalActionPerformed(evt);

    }//GEN-LAST:event_itemConsultarFestivalActionPerformed

    private void itemIngresarArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIngresarArtistaActionPerformed
        RegistroArtista registro = new RegistroArtista(this, true);
        
        registro.setLocationRelativeTo(this);
        
        registro.setVisible(true);
    }//GEN-LAST:event_itemIngresarArtistaActionPerformed

    private void itemIngresarConciertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIngresarConciertoActionPerformed
        RegistroConcierto registro = new RegistroConcierto(this, true);
        
        registro.setLocationRelativeTo(this);
        
        registro.setVisible(true);
    }//GEN-LAST:event_itemIngresarConciertoActionPerformed

    private void itemIngresarFestivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIngresarFestivalActionPerformed
        RegistroFestival registro = new RegistroFestival(this, true);
        
        registro.setLocationRelativeTo(this);
        
        registro.setVisible(true);
    }//GEN-LAST:event_itemIngresarFestivalActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemConsultarArtista;
    private javax.swing.JMenuItem itemConsultarConcierto;
    private javax.swing.JMenuItem itemConsultarFestival;
    private javax.swing.JMenuItem itemEditarArtista;
    private javax.swing.JMenuItem itemEditarConcierto;
    private javax.swing.JMenuItem itemEditarFestival;
    private javax.swing.JMenuItem itemIngresarArtista;
    private javax.swing.JMenuItem itemIngresarConcierto;
    private javax.swing.JMenuItem itemIngresarFestival;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuArtista;
    private javax.swing.JMenu menuConcierto;
    private javax.swing.JMenu menuFestival;
    // End of variables declaration//GEN-END:variables

    
}
