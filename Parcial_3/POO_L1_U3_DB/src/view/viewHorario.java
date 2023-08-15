package view;
import controller.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
/**
 *
 * @author JordyUSER
 */
public class viewHorario extends javax.swing.JInternalFrame {
    
    /**
     * Creates new form view_form_estudiante
     */
    DBConnect cc = new DBConnect();
    Connection con = cc.Conectar();
    
    public viewHorario() {
        initComponents();
        mostrarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void ModelTableDefault (){
        String titulos[] = {"ID", "Nombre", "Entrada", "Salida", "Departamento", "Dia"};
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        tablaHorarios.setModel(modelo);
    }
    public void mostrarDatos(){
        String titulos[] = {"ID","Nombre", "Entrada", "Salida", "Departamento", "Dia"};
        String registro[] = new String[6];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "SELECT * FROM horario";
        try {
            Statement st = (Statement) con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while(rs.next()){
               registro[0] = rs.getString("id");
               registro[1] = rs.getString("labNombre");
               registro[2] = rs.getString("labHorarioIn");
               registro[3] = rs.getString("labHorarioOut");
               registro[4] = rs.getString("labDepartamento");
               registro[5] = rs.getString("labDia");
               modelo.addRow(registro);
            }
            tablaHorarios.setModel(modelo);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos.");
            System.out.println(e);
        }
        
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bottAgregar = new javax.swing.JButton();
        bottEditar = new javax.swing.JButton();
        bottEliminar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CBEstado = new javax.swing.JComboBox<>();
        bottActualizar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        CBDia = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaHorarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));

        jLabel1.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 18)); // NOI18N
        jLabel1.setText("Horarios");
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel2.setFont(new java.awt.Font("Plus Jakarta Sans", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Plus Jakarta Sans", 0, 14)); // NOI18N
        jLabel3.setText("Entrada:");

        jLabel4.setFont(new java.awt.Font("Plus Jakarta Sans", 0, 14)); // NOI18N
        jLabel4.setText("Salida:");

        bottAgregar.setBackground(new java.awt.Color(255, 0, 0));
        bottAgregar.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        bottAgregar.setText("Agregar");
        bottAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottAgregarActionPerformed(evt);
            }
        });

        bottEditar.setBackground(new java.awt.Color(255, 0, 0));
        bottEditar.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        bottEditar.setText("Editar");
        bottEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottEditarActionPerformed(evt);
            }
        });

        bottEliminar.setBackground(new java.awt.Color(255, 0, 0));
        bottEliminar.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        bottEliminar.setText("Eliminar");
        bottEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottEliminarActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Plus Jakarta Sans", 0, 14)); // NOI18N
        jLabel7.setText("Departamento:");

        CBEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ciencias Exactas", "Ciencias Computacionales", "Ciencias Humanas" }));

        bottActualizar.setBackground(new java.awt.Color(255, 0, 0));
        bottActualizar.setFont(new java.awt.Font("Plus Jakarta Sans", 1, 14)); // NOI18N
        bottActualizar.setText("Actualizar");
        bottActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottActualizarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Plus Jakarta Sans", 0, 14)); // NOI18N
        jLabel8.setText("Dia:");

        CBDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" }));
        CBDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBDiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(txtApellido)
                                    .addComponent(txtCelular)
                                    .addComponent(CBDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bottActualizar)
                            .addComponent(bottAgregar))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bottEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bottEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(CBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(CBDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bottAgregar)
                    .addComponent(bottEditar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bottActualizar)
                    .addComponent(bottEliminar))
                .addGap(46, 46, 46))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 360));

        jPanel3.setBackground(new java.awt.Color(40, 45, 51));

        tablaHorarios.setBackground(new java.awt.Color(40, 45, 51));
        tablaHorarios.setForeground(new java.awt.Color(255, 255, 255));
        tablaHorarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaHorarios.setSelectionBackground(new java.awt.Color(40, 45, 51));
        tablaHorarios.setSelectionForeground(new java.awt.Color(40, 45, 51));
        jScrollPane1.setViewportView(tablaHorarios);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 0, 450, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bottAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottAgregarActionPerformed
        String SQL = "INSERT INTO horario(labNombre, labHorarioIn, labHorarioOut, labDepartamento, labDia)values(?,?,?,?,?)";
        try {
            int select = CBEstado.getSelectedIndex();
            int select1 = CBDia.getSelectedIndex();
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(SQL);
            pst.setString(1,txtNombre.getText());
            pst.setString(2,txtApellido.getText());
            pst.setString(3,txtCelular.getText());
            pst.setString(4,CBEstado.getItemAt(select));
            pst.setString(5,CBDia.getItemAt(select1));
            pst.execute();
        } catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_bottAgregarActionPerformed

    private void bottEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottEditarActionPerformed
        try {
            String SQL = "UPDATE horario set labNombre = ?, labHorarioIn = ?, labHorarioOut = ?, labDepartamento = ?, labDia = ? where id = ?";
            int fila = tablaHorarios.getSelectedRow();
            int select = CBEstado.getSelectedIndex();
            int select1 = CBDia.getSelectedIndex();
            String dao = (String) tablaHorarios.getValueAt(fila, 0);
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(SQL);
            
            pst.setString(1,txtNombre.getText());
            pst.setString(2,txtApellido.getText());
            pst.setString(3, txtCelular.getText());
            pst.setString(4, CBEstado.getItemAt(select));
            pst.setString(5, CBDia.getItemAt(select1));
            pst.setString(6, dao); 
            pst.execute();
            JOptionPane.showMessageDialog(null, "Se ha actualizado correctamente su registro");
            mostrarDatos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en la actualizacion"+e.getMessage());
        }
    }//GEN-LAST:event_bottEditarActionPerformed

    private void bottEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottEliminarActionPerformed
        try {
            int fila = tablaHorarios.getSelectedRow();
            System.out.println(tablaHorarios.getValueAt(fila, 0));
            String SQL = "DELETE FROM `horario` WHERE id =" + tablaHorarios.getValueAt(fila, 0);
            System.out.println("PASO1");
            Statement st = (Statement) con.createStatement();
            System.out.println("PASO2");
            int n = st.executeUpdate(SQL);
            System.out.println("PASO3");
            if (n >= 0){
                System.out.println("PASO4");
                JOptionPane.showMessageDialog(null, "Ya se elimino.");
            }
            mostrarDatos();
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Hubo un error.");
        }
    }//GEN-LAST:event_bottEliminarActionPerformed

    private void bottActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottActualizarActionPerformed
        mostrarDatos();
    }//GEN-LAST:event_bottActualizarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void CBDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBDiaActionPerformed

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
            java.util.logging.Logger.getLogger(viewHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewHorario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBDia;
    private javax.swing.JComboBox<String> CBEstado;
    private javax.swing.JButton bottActualizar;
    private javax.swing.JButton bottAgregar;
    private javax.swing.JButton bottEditar;
    private javax.swing.JButton bottEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaHorarios;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
