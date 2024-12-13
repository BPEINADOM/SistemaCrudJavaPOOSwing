/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
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
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        itemReportesArtista = new javax.swing.JMenu();
        itemReporteNombreArtista = new javax.swing.JMenuItem();
        itemReporteGeneroMArtista = new javax.swing.JMenuItem();
        itemReporteNacionalidadArtista = new javax.swing.JMenuItem();
        menuConcierto = new javax.swing.JMenu();
        itemIngresarConcierto = new javax.swing.JMenuItem();
        itemEditarConcierto = new javax.swing.JMenuItem();
        itemConsultarConcierto = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        itemReportesConcierto = new javax.swing.JMenu();
        itemReporteNombreConcierto = new javax.swing.JMenuItem();
        itemReporteDuracionConcierto = new javax.swing.JMenuItem();
        menuEscenario = new javax.swing.JMenu();
        itemIngresarEscenario = new javax.swing.JMenuItem();
        itemEditarEscenario = new javax.swing.JMenuItem();
        itemConsultarEscenario = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        itemReportesEscenario = new javax.swing.JMenu();
        itemReporteNombreEscenario = new javax.swing.JMenuItem();
        itemReporteCapacidadEscenario = new javax.swing.JMenuItem();
        itemReporteEspectadoresEscenario = new javax.swing.JMenuItem();
        menuEspectador = new javax.swing.JMenu();
        itemIngresarEspectador = new javax.swing.JMenuItem();
        itemEditarEspectador = new javax.swing.JMenuItem();
        itemConsultarEspectador = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        itemReportesEspectador = new javax.swing.JMenu();
        itemReporteNombreEspectador = new javax.swing.JMenuItem();
        itemReporteEdadEspectador = new javax.swing.JMenuItem();
        menuFestival = new javax.swing.JMenu();
        itemIngresarFestival = new javax.swing.JMenuItem();
        itemEditarFestival = new javax.swing.JMenuItem();
        itemConsultarFestival = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        itemReportesFestival = new javax.swing.JMenu();
        itemReporteNombreFestival = new javax.swing.JMenuItem();
        itemReporteUbicacionFestival = new javax.swing.JMenuItem();
        itemReporteFechaFestival = new javax.swing.JMenuItem();

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
        menuArtista.add(jSeparator1);

        itemReportesArtista.setText("Reportes");

        itemReporteNombreArtista.setText("Nombres");
        itemReporteNombreArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteNombreArtistaActionPerformed(evt);
            }
        });
        itemReportesArtista.add(itemReporteNombreArtista);

        itemReporteGeneroMArtista.setText("Genero musical");
        itemReporteGeneroMArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteGeneroMArtistaActionPerformed(evt);
            }
        });
        itemReportesArtista.add(itemReporteGeneroMArtista);

        itemReporteNacionalidadArtista.setText("Nacionalidad");
        itemReportesArtista.add(itemReporteNacionalidadArtista);

        menuArtista.add(itemReportesArtista);

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
        menuConcierto.add(jSeparator2);

        itemReportesConcierto.setText("Reportes");

        itemReporteNombreConcierto.setText("Nombres");
        itemReporteNombreConcierto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteNombreConciertoActionPerformed(evt);
            }
        });
        itemReportesConcierto.add(itemReporteNombreConcierto);

        itemReporteDuracionConcierto.setText("Duracion");
        itemReporteDuracionConcierto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteDuracionConciertoActionPerformed(evt);
            }
        });
        itemReportesConcierto.add(itemReporteDuracionConcierto);

        menuConcierto.add(itemReportesConcierto);

        jMenuBar1.add(menuConcierto);

        menuEscenario.setText("Escenario");
        menuEscenario.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        itemIngresarEscenario.setText("Ingresar datos...");
        itemIngresarEscenario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemIngresarEscenarioActionPerformed(evt);
            }
        });
        menuEscenario.add(itemIngresarEscenario);

        itemEditarEscenario.setText("Editar datos...");
        itemEditarEscenario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarEscenarioActionPerformed(evt);
            }
        });
        menuEscenario.add(itemEditarEscenario);

        itemConsultarEscenario.setText("Consultar datos");
        itemConsultarEscenario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarEscenarioActionPerformed(evt);
            }
        });
        menuEscenario.add(itemConsultarEscenario);
        menuEscenario.add(jSeparator3);

        itemReportesEscenario.setText("Reportes");

        itemReporteNombreEscenario.setText("Nombres");
        itemReporteNombreEscenario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteNombreEscenarioActionPerformed(evt);
            }
        });
        itemReportesEscenario.add(itemReporteNombreEscenario);

        itemReporteCapacidadEscenario.setText("Capacidad");
        itemReporteCapacidadEscenario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteCapacidadEscenarioActionPerformed(evt);
            }
        });
        itemReportesEscenario.add(itemReporteCapacidadEscenario);

        itemReporteEspectadoresEscenario.setText("Espectadores");
        itemReportesEscenario.add(itemReporteEspectadoresEscenario);

        menuEscenario.add(itemReportesEscenario);

        jMenuBar1.add(menuEscenario);

        menuEspectador.setText("Espectador");
        menuEspectador.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        itemIngresarEspectador.setText("Ingresar datos...");
        itemIngresarEspectador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemIngresarEspectadorActionPerformed(evt);
            }
        });
        menuEspectador.add(itemIngresarEspectador);

        itemEditarEspectador.setText("Editar datos...");
        itemEditarEspectador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditarEspectadorActionPerformed(evt);
            }
        });
        menuEspectador.add(itemEditarEspectador);

        itemConsultarEspectador.setText("Consultar datos");
        itemConsultarEspectador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultarEspectadorActionPerformed(evt);
            }
        });
        menuEspectador.add(itemConsultarEspectador);
        menuEspectador.add(jSeparator4);

        itemReportesEspectador.setText("Reportes");

        itemReporteNombreEspectador.setText("Nombres");
        itemReporteNombreEspectador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteNombreEspectadorActionPerformed(evt);
            }
        });
        itemReportesEspectador.add(itemReporteNombreEspectador);

        itemReporteEdadEspectador.setText("Edades");
        itemReporteEdadEspectador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteEdadEspectadorActionPerformed(evt);
            }
        });
        itemReportesEspectador.add(itemReporteEdadEspectador);

        menuEspectador.add(itemReportesEspectador);

        jMenuBar1.add(menuEspectador);

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
        menuFestival.add(jSeparator5);

        itemReportesFestival.setText("Reportes");

        itemReporteNombreFestival.setText("Nombres");
        itemReporteNombreFestival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteNombreFestivalActionPerformed(evt);
            }
        });
        itemReportesFestival.add(itemReporteNombreFestival);

        itemReporteUbicacionFestival.setText("Ubicacion");
        itemReporteUbicacionFestival.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReporteUbicacionFestivalActionPerformed(evt);
            }
        });
        itemReportesFestival.add(itemReporteUbicacionFestival);

        itemReporteFechaFestival.setText("Fecha");
        itemReportesFestival.add(itemReporteFechaFestival);

        menuFestival.add(itemReportesFestival);

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
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEditarArtistaActionPerformed

    private void itemConsultarArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarArtistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemConsultarArtistaActionPerformed

    private void itemReporteNombreArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteNombreArtistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemReporteNombreArtistaActionPerformed

    private void itemReporteGeneroMArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteGeneroMArtistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemReporteGeneroMArtistaActionPerformed

    private void itemEditarConciertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarConciertoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEditarConciertoActionPerformed

    private void itemConsultarConciertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarConciertoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemConsultarConciertoActionPerformed

    private void itemReporteNombreConciertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteNombreConciertoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemReporteNombreConciertoActionPerformed

    private void itemReporteDuracionConciertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteDuracionConciertoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemReporteDuracionConciertoActionPerformed

    private void itemEditarEscenarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarEscenarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEditarEscenarioActionPerformed

    private void itemConsultarEscenarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarEscenarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemConsultarEscenarioActionPerformed

    private void itemReporteNombreEscenarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteNombreEscenarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemReporteNombreEscenarioActionPerformed

    private void itemReporteCapacidadEscenarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteCapacidadEscenarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemReporteCapacidadEscenarioActionPerformed

    private void itemEditarEspectadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarEspectadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEditarEspectadorActionPerformed

    private void itemConsultarEspectadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarEspectadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemConsultarEspectadorActionPerformed

    private void itemReporteNombreEspectadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteNombreEspectadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemReporteNombreEspectadorActionPerformed

    private void itemReporteEdadEspectadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteEdadEspectadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemReporteEdadEspectadorActionPerformed

    private void itemEditarFestivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarFestivalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEditarFestivalActionPerformed

    private void itemConsultarFestivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultarFestivalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemConsultarFestivalActionPerformed

    private void itemReporteNombreFestivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteNombreFestivalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemReporteNombreFestivalActionPerformed

    private void itemReporteUbicacionFestivalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReporteUbicacionFestivalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemReporteUbicacionFestivalActionPerformed

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

    private void itemIngresarEscenarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIngresarEscenarioActionPerformed
        RegistroEscenario registro = new RegistroEscenario(this, true);
        
        registro.setLocationRelativeTo(this);
        
        registro.setVisible(true);
    }//GEN-LAST:event_itemIngresarEscenarioActionPerformed

    private void itemIngresarEspectadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemIngresarEspectadorActionPerformed
        RegistroEspectador registro = new RegistroEspectador(this, true);
        
        registro.setLocationRelativeTo(this);
        
        registro.setVisible(true);
    }//GEN-LAST:event_itemIngresarEspectadorActionPerformed

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
    private javax.swing.JMenuItem itemConsultarEscenario;
    private javax.swing.JMenuItem itemConsultarEspectador;
    private javax.swing.JMenuItem itemConsultarFestival;
    private javax.swing.JMenuItem itemEditarArtista;
    private javax.swing.JMenuItem itemEditarConcierto;
    private javax.swing.JMenuItem itemEditarEscenario;
    private javax.swing.JMenuItem itemEditarEspectador;
    private javax.swing.JMenuItem itemEditarFestival;
    private javax.swing.JMenuItem itemIngresarArtista;
    private javax.swing.JMenuItem itemIngresarConcierto;
    private javax.swing.JMenuItem itemIngresarEscenario;
    private javax.swing.JMenuItem itemIngresarEspectador;
    private javax.swing.JMenuItem itemIngresarFestival;
    private javax.swing.JMenuItem itemReporteCapacidadEscenario;
    private javax.swing.JMenuItem itemReporteDuracionConcierto;
    private javax.swing.JMenuItem itemReporteEdadEspectador;
    private javax.swing.JMenuItem itemReporteEspectadoresEscenario;
    private javax.swing.JMenuItem itemReporteFechaFestival;
    private javax.swing.JMenuItem itemReporteGeneroMArtista;
    private javax.swing.JMenuItem itemReporteNacionalidadArtista;
    private javax.swing.JMenuItem itemReporteNombreArtista;
    private javax.swing.JMenuItem itemReporteNombreConcierto;
    private javax.swing.JMenuItem itemReporteNombreEscenario;
    private javax.swing.JMenuItem itemReporteNombreEspectador;
    private javax.swing.JMenuItem itemReporteNombreFestival;
    private javax.swing.JMenuItem itemReporteUbicacionFestival;
    private javax.swing.JMenu itemReportesArtista;
    private javax.swing.JMenu itemReportesConcierto;
    private javax.swing.JMenu itemReportesEscenario;
    private javax.swing.JMenu itemReportesEspectador;
    private javax.swing.JMenu itemReportesFestival;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JMenu menuArtista;
    private javax.swing.JMenu menuConcierto;
    private javax.swing.JMenu menuEscenario;
    private javax.swing.JMenu menuEspectador;
    private javax.swing.JMenu menuFestival;
    // End of variables declaration//GEN-END:variables

    
}