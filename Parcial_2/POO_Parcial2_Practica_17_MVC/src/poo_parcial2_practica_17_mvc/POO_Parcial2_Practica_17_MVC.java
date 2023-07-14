package poo_parcial2_practica_17_mvc;
import Controller.Controlador;
import Model.Modelo;
import Viewer.Vista;
/**
 *
 * @author Jordy
 */
public class POO_Parcial2_Practica_17_MVC {
    public static void main(String[] args) {
        //Nuevas instancias de clase
        Modelo mod1 = new Modelo();
        Vista vis1 = new Vista();
        Controlador con1 = new Controlador(vis1, mod1);
        
        con1.iniciar_vista();
        vis1.setVisible(true);
    }
    
}
