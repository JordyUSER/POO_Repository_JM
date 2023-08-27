package view;

import mongodb_java.MongoConnection;
import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.IndexOptions;
import com.mongodb.client.MongoClients;
import javax.swing.JOptionPane;
import org.bson.Document;

/**
 *
 * @author appka
 */
public class viewLogin extends javax.swing.JFrame {

    MongoConnection con = new MongoConnection();
    MongoDatabase cc = con.conectar();
    
    public viewLogin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void resetFields(){
        txtUser.setText("");
        txtPass.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        buttLogin = new javax.swing.JButton();
        buttRegister = new javax.swing.JButton();
        buttExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        panel1.setBackground(new java.awt.Color(60, 71, 101));
        panel1.setForeground(new java.awt.Color(255, 255, 255));
        panel1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/auser.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Email");

        txtUser.setBackground(new java.awt.Color(204, 204, 204));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Password");

        txtPass.setBackground(new java.awt.Color(204, 204, 204));

        buttLogin.setBackground(new java.awt.Color(153, 153, 153));
        buttLogin.setForeground(new java.awt.Color(0, 0, 0));
        buttLogin.setText("LOGIN");
        buttLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttLoginActionPerformed(evt);
            }
        });

        buttRegister.setBackground(new java.awt.Color(153, 153, 153));
        buttRegister.setForeground(new java.awt.Color(0, 0, 0));
        buttRegister.setText("REGISTER");
        buttRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttRegisterActionPerformed(evt);
            }
        });

        buttExit.setBackground(new java.awt.Color(153, 153, 153));
        buttExit.setForeground(new java.awt.Color(0, 0, 0));
        buttExit.setText("EXIT");
        buttExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttExit)
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3)
                        .addComponent(txtUser)
                        .addComponent(jLabel4)
                        .addComponent(txtPass)
                        .addComponent(buttLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(145, 145, 145))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(buttExit)
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(buttLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttRegister)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        
    }//GEN-LAST:event_txtUserActionPerformed

    private void buttExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_buttExitActionPerformed

    private void buttLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttLoginActionPerformed
        try (var mongoClient = MongoClients.create("mongodb://localhost:27017")) {
            MongoCollection<Document> collection = cc.getCollection("task");
            
            // Datos ingresados por el usuario
            String userInputUsername = txtUser.getText();
            String userInputPassword = String.valueOf(txtPass.getPassword());
            
            // Crear filtro para buscar el usuario por nombre de usuario
            Document filter = new Document("email", userInputUsername);
            
            // Ejecutar la consulta
            Document userDocument = collection.find(filter).first();
            
            if (userDocument != null) {
                // Usuario encontrado en la base de datos
                String storedPassword = userDocument.getString("Password");
                
                if (userInputPassword.equals(storedPassword)) {
                    JOptionPane.showMessageDialog(null, "Inicio de sesión exitoso");
                    this.dispose();
                    viewMenu menu = new viewMenu();
                    menu.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            }
        }
    }//GEN-LAST:event_buttLoginActionPerformed

    private void buttRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttRegisterActionPerformed
        try{
            //OBTENER VALORES
            String user = txtUser.getText();
            String pass = String.valueOf(txtPass.getPassword());

            resetFields(); //Reseteamos los campos

            int state = 0;
            if (user == null || pass == null){
                JOptionPane.showMessageDialog(null, "Falta llenar los campos.");
                return;
            }
            MongoCollection<Document> collection = cc.getCollection("task");
            collection.createIndex(new Document("email", 1), new IndexOptions().unique(true));
            Document newDocument = new Document("email", user).append("Password", pass);

            collection.insertOne(newDocument);
        }catch(MongoException ME){
            JOptionPane.showMessageDialog(null, "Error al ingresar los datos, vuelva a ingresarlos - "+ME);
        }
    }//GEN-LAST:event_buttRegisterActionPerformed

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
            java.util.logging.Logger.getLogger(viewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton buttExit;
    public javax.swing.JButton buttLogin;
    public javax.swing.JButton buttRegister;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JPanel panel1;
    public javax.swing.JPasswordField txtPass;
    public javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
