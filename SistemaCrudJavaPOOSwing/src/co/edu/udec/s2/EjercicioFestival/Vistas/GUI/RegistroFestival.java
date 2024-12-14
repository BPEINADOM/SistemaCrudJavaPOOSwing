
package co.edu.udec.s2.EjercicioFestival.Vistas.GUI;


import co.edu.udec.s2.EjercicioFestival.Domain.Model.Entidades.Festival;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class RegistroFestival extends javax.swing.JDialog {

    Festival festival;
    
    /**
     * Creates new form RegistroFestival
     */
    public RegistroFestival(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        textoNombre = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        textoUbicacion = new javax.swing.JLabel();
        campoUbicacion = new javax.swing.JTextField();
        textoFecha = new javax.swing.JLabel();
        campoFecha = new javax.swing.JTextField();
        botonCancelar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("- FESTIVAL -");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE FESTIVAL");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray));

        textoNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoNombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoNombre.setText("NOMBRE");

        textoUbicacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoUbicacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoUbicacion.setText("UBICACION");

        textoFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        textoFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        textoFecha.setText("FECHA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textoUbicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoUbicacion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNombre)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoUbicacion)
                    .addComponent(campoUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoFecha)
                    .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        botonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/s2/EjercicioFestival/Vistas/Iconos/eliminar48px.png"))); // NOI18N
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/s2/EjercicioFestival/Vistas/Iconos/eliminar48px.png"))); // NOI18N
        botonEliminar.setEnabled(false);
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonGuardar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/s2/EjercicioFestival/Vistas/Iconos/guardar48px.png"))); // NOI18N
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonBuscar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/s2/EjercicioFestival/Vistas/Iconos/buscar48px.png"))); // NOI18N
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        botonEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        botonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/udec/s2/EjercicioFestival/Vistas/Iconos/editar48px.png"))); // NOI18N
        botonEditar.setEnabled(false);
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 486, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(botonEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonGuardar)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonCancelar)
                    .addComponent(botonEliminar)
                    .addComponent(botonEditar)
                    .addComponent(botonGuardar)
                    .addComponent(botonBuscar))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, 
                "¿Desea cerrar esta ventana?", 
                "CONFIRMAR", JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE);
        if(opcion == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        String nombre = campoNombre.getText();
        String ubicacion = campoUbicacion.getText();
        String fecha = campoFecha.getText();
        
        Festival festival = new Festival();
        festival.nombre = nombre;
        festival.ubicacion = ubicacion;
        festival.fecha = fecha;
        
        if (Festival.festivalBD == null) {
            Festival.festivalBD = new HashMap<String, Festival>();
        }
        if (Festival.festivalBD.containsKey(nombre)) {
            String msj = "Ya existe un festival con ese nombre";
            JOptionPane.showMessageDialog(this, msj);
        }
        else {
            Festival.festivalBD.put(nombre, festival);
            int FestivalIngresados = Festival.festivalBD.size();
            String msj = "El Artista fue guardado correctamente\n"
                    + "Existen " + FestivalIngresados + " Festivales";
            JOptionPane.showMessageDialog(this, msj);
            limpiarCampos();
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        String nombre = campoNombre.getText();
        
        if(Festival.festivalBD == null || Festival.festivalBD.isEmpty()){
            String msj = "No existen Festivales en la Base de datos";
            JOptionPane.showMessageDialog(this, msj);
        }
        else {
            if(Festival.festivalBD.containsKey(nombre)){
                this.festival = Festival.festivalBD.get(nombre);
                campoUbicacion.setText(this.festival.nombre);
                campoNombre.setText(this.festival.nombre);
                campoUbicacion.setText(this.festival.ubicacion);
                campoFecha.setText(this.festival.fecha);
                botonEditar.setEnabled(true);
                botonEliminar.setEnabled(true);
            }
            else{
                String msj = "No existe un Festival de nombre "+nombre;
                JOptionPane.showMessageDialog(this, msj);
                limpiarCampos();
            }
        }
        
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        if(campoNombre.getText() == null || campoNombre.getText().isEmpty()) {
           String msj = "Busque un festival existente";
                JOptionPane.showMessageDialog(this, msj);
                limpiarCampos(); 
                return;
        }
        if(campoNombre.getText().equals(this.festival.nombre) != true){
           String msj = "El nombre no coincide con el nombre del festival consultado";
                JOptionPane.showMessageDialog(this, msj);
                limpiarCampos(); 
                return; 
        }
        this.festival = Festival.festivalBD.get(campoNombre.getText());
        String nombre = campoNombre.getText();
        String ubicacion = campoUbicacion.getText();
        String fecha = campoFecha.getText();
        
        this.festival.ubicacion = ubicacion;
        this.festival.fecha = fecha;
        Festival.festivalBD.put(this.festival.nombre, festival);
        String msj = "Festival modificado correctamente";
        JOptionPane.showMessageDialog(this, msj);
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        if(campoNombre.getText() == null || campoNombre.getText().isEmpty()) {
           String msj = "Busque un festival existente";
                JOptionPane.showMessageDialog(this, msj);
                limpiarCampos(); 
                return;
        }
        if(campoNombre.getText().equals(this.festival.nombre) != true){
           String msj = "El nombre no coincide con el nombre del festival consultado";
                JOptionPane.showMessageDialog(this, msj);
                limpiarCampos(); 
                return; 
        }
        String msj = "¿Deseas eliminar este artista?";
        int respuesta = JOptionPane.showConfirmDialog(this, msj, 
                "CONFIRMAR", 
                JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE);
        if(respuesta == JOptionPane.YES_OPTION) {
            Festival.festivalBD.remove(this.festival.nombre);
            int total = Festival.festivalBD.size();
            String msj2 = "Festival eliminado correctamente\nTOTAL: "+total;
            JOptionPane.showMessageDialog(this, msj2);
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    public void limpiarCampos() {
        campoNombre.setText("");
        campoUbicacion.setText("");
        campoFecha.setText("");
        botonEditar.setEnabled(false);
        botonEliminar.setEnabled(false);
    }
    
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
            java.util.logging.Logger.getLogger(RegistroFestival.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroFestival.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroFestival.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroFestival.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistroFestival dialog = new RegistroFestival(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField campoFecha;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoUbicacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel textoFecha;
    private javax.swing.JLabel textoNombre;
    private javax.swing.JLabel textoUbicacion;
    // End of variables declaration//GEN-END:variables
}
