
package evaluacion1;
import javax.swing.JOptionPane;
/**
 *
 * @author Jordy Mejia
 */
public class Notas {
    private double nota1, nota2, nota3, media;    

    public double getMedia() {
        return media;
    }
    
    public void aggNota(){
        nota1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        nota2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        nota3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
    }
    
    public double mediaNota(){
        media = (nota1 + nota2 + nota3)/3;
        return media;
    }
    
    public Boolean notaAprobada(){
        if(this.media >= 14 && this.media <= 20){
            return true;
        } else if(this.media >= 0 && this.media < 14){
            return false;
        }
        return false;
    }
}
