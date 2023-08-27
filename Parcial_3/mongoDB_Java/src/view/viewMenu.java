package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class viewMenu extends JFrame {
    JDesktopPane desktop = new JDesktopPane();
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu();
    JMenuItem menuItem1 = new JMenuItem();
    JMenuItem menuItem2 = new JMenuItem();
    JMenuItem menuItem3 = new JMenuItem();
    JMenuItem menuItem4 = new JMenuItem();
    
    //ViewForm form1;
    
    public viewMenu(){
        iniciarComponentes();
    }
    
    @SuppressWarnings("Convert2Lambda")
    public void iniciarComponentes(){
        this.setSize(600,600);
        this.setTitle("Gestion Datos de Personas");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        
        setLocationRelativeTo(null);
        
        this.add(desktop);
        desktop.setBackground(new Color(40, 45, 51));
        menuBar.setForeground(new Color(58, 85, 128));
        
        fileMenu.setMnemonic('f');
        fileMenu.setText("File");
        
        menuItem1.setText("Estudiantes");
        menuItem1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                menuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(menuItem1);
        
        menuItem2.setText("Profesor");
        menuItem2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                menuItem2ActionPerformed(evt);
            }
        });
        fileMenu.add(menuItem2);
        
        menuItem3.setText("Horario");
        menuItem3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                menuItem3ActionPerformed(evt);
            }
        });
        fileMenu.add(menuItem3);
        
        menuItem4.setText("Obtener Horario");
        menuItem4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                menuItem4ActionPerformed(evt);
            }
        });
        fileMenu.add(menuItem4);
        
        menuBar.add(fileMenu);
        desktop.add(menuBar);
        setJMenuBar(menuBar);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        
        this.pack();
    }
    
    private void menuItem1ActionPerformed(ActionEvent evt) {
        viewEstudiante estud = new viewEstudiante();
        estud.setLocation(0,0);
        desktop.removeAll();
        desktop.add(estud);
        desktop.revalidate();
        desktop.repaint();
        estud.toFront();
        estud.setVisible(true);
    }
    
    private void menuItem2ActionPerformed(ActionEvent evt) {
        viewProfesor prof = new viewProfesor(); //otro formulario
        prof.setLocation(0,0);
        desktop.removeAll();
        desktop.add(prof);
        desktop.revalidate();
        desktop.repaint();
        prof.toFront();
        prof.setVisible(true); 
    }
    
    private void menuItem3ActionPerformed(ActionEvent evt) {
        viewHorario horario = new viewHorario(); //otro formulario
        horario.setLocation(0,0);
        desktop.removeAll();
        desktop.add(horario);
        desktop.revalidate();
        desktop.repaint();
        horario.toFront();
        horario.setVisible(true);
    }
    
    private void menuItem4ActionPerformed(ActionEvent evt) {
        getHorario ghorario = new getHorario(); //otro formulario
        ghorario.setLocation(0,0);
        desktop.removeAll();
        desktop.add(ghorario);
        desktop.revalidate();
        desktop.repaint();
        ghorario.toFront();
        ghorario.setVisible(true);
    }
    
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewMenu().setVisible(true);
            }
        });
    }
    
}