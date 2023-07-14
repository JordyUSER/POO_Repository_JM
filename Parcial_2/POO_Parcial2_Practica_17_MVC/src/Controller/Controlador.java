/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model.Modelo;
import Viewer.Vista;
/**
 *
 * @author Jordy
 */
public class Controlador implements ActionListener{

    private Vista v1;
    private Modelo m1;
    
    
    public Controlador(Vista vista, Modelo modelo){
        this.v1 = vista;
        this.m1 = modelo;
        this.v1.Sumar.addActionListener(this);
        this.v1.Restar.addActionListener(this);
        this.v1.Dividir.addActionListener(this);
        this.v1.Multiplicar.addActionListener(this);
    }
    
    public void iniciar(){
        v1.setTitle("USTED VA A SUMAR POR MEDIO DE MVC");
        v1.setLocationRelativeTo(null);
    }
    
    public void iniciar_vista(){
        v1.setTitle("Demo MVC * Jordy Mejia");
        v1.setLocationRelativeTo(null);
        /*v1.texto1.setText(String.valueOf(m1.getValor1()));
        v1.texto2.setText(String.valueOf(m1.getValor2()));
        v1.texto3.setText(String.valueOf(m1.getTotal()));*/
        //v1.texto3.setText(String.valueOf(m1.getTotal()));
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        m1.setValor1(Integer.parseInt(v1.texto1.getText()));
        m1.setValor2(Integer.parseInt(v1.texto2.getText()));
        
        if(e.getSource()==v1.Sumar){
            m1.sumar();
            v1.texto3.setText(String.valueOf(m1.getTotal()));
        } else if(e.getSource()==v1.Restar){
            m1.restar();
            v1.texto3.setText(String.valueOf(m1.getTotal()));
        } else if(e.getSource()==v1.Dividir){
            m1.dividir();
            v1.texto3.setText(String.valueOf(m1.getTotal()));
        } else if(e.getSource()==v1.Multiplicar){
            m1.multiplicar();
            v1.texto3.setText(String.valueOf(m1.getTotal()));
        }
        
    }
}
