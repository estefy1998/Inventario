
package inventario;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class categorias extends javax.swing.JFrame {


    public categorias() {
        initComponents();
        llenar_tabla();
    }
 private void llenar_tabla() {
        try {
            DefaultTableModel modelo;
            conexion cnx = new conexion();
            Connection registros = cnx.conexion();
            String[] nombre_atributos = {"id_categoria", "nombre"};
            String sql = ("SELECT *FROM categoria");
            modelo = new DefaultTableModel(null, nombre_atributos);
            Statement st = (Statement) registros.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] filas = new String[4];

            while (rs.next()) {
                filas[0] = rs.getString("id_categoria");
                filas[1] = rs.getString("nombre");
                modelo.addRow(filas);

            }
            tabla.setModel(modelo);
            registros.close();
        } catch (SQLException ex) {
            Logger.getLogger(categorias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id_categoria = new javax.swing.JTextField();
        nombre_categoria = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        actualizar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("categoria");

        jLabel2.setText("id_categoria:");

        jLabel3.setText("nombre:");

        jButton2.setText("guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(tabla);

        jButton3.setText("modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        actualizar.setText("actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        jButton1.setText("eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(id_categoria)
                    .addComponent(nombre_categoria, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jButton3)
                        .addGap(27, 27, 27)
                        .addComponent(actualizar)
                        .addGap(36, 36, 36)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(id_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nombre_categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(actualizar)
                    .addComponent(jButton1))
                .addGap(68, 68, 68))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        conexion cnx = new conexion();
        Connection registro = cnx.conexion();
        String sql = "INSERT INTO categoria(id_categoria,nombre) VALUES (?,?)";
        try {
            PreparedStatement pst = (PreparedStatement) registro.prepareStatement(sql);
            pst.setString(1, this.id_categoria.getText());
            pst.setString(2, this.nombre_categoria.getText());
            int numero_datos = pst.executeUpdate();
            if (numero_datos > 0) {
                JOptionPane.showMessageDialog(null, "Se ingresaron  Correctamente los datos", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
         
            } else {
                JOptionPane.showMessageDialog(null, "Campos vacios\n Ingrese sus datos", "Mensaje Error", JOptionPane.ERROR_MESSAGE);
            }


        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        int numero_fila = this.tabla.getSelectedRow();
        if (numero_fila != -1) {
            this.id_categoria.setText(this.tabla.getValueAt(numero_fila, 0).toString());
            this.nombre_categoria.setText(this.tabla.getValueAt(numero_fila, 1).toString());
            this.id_categoria.setEditable(false);

        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila", "Mensaje Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        conexion cnx = new conexion();
        Connection registro = cnx.conexion();
        String sql = "UPDATE categoria SET id_categoria='" + this.id_categoria.getText() + "',"
                                     + "nombre='" + this.nombre_categoria.getText() + "' WHERE id_categoria='" + this.id_categoria.getText() + "'";
        try {
            PreparedStatement pst = (PreparedStatement) registro.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se Actualizaron  Correctamente los datos", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            llenar_tabla();
            registro.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al Actualizar los Datos", "Mensaje Error", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_actualizarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        conexion cnx = new conexion();
        Connection registro = cnx.conexion();
        
        int numero_fila = this.tabla.getSelectedRow();
        String aux = this.tabla.getValueAt(numero_fila, 0).toString();        
        if(numero_fila != -1){
        String sql = "DELETE FROM categoria WHERE id_categoria='" + aux + "'";
        try {
            PreparedStatement pst = (PreparedStatement) registro.prepareStatement(sql);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se Eliminaron Correctamente los datos", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            llenar_tabla();
            registro.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar los Datos", "Mensaje Error", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, ex);
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(categorias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new categorias().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JTextField id_categoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre_categoria;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
