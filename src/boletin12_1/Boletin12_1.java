
package boletin12_1;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class Boletin12_1 {

   
    public static void main(String[] args) {
        int x=0;
        do{
        Garaxe gar1=new Garaxe();
        
        gar1.setMatricula(null);
     
        gar1.setTempo();
        gar1.calculo(Float.parseFloat(JOptionPane.showInputDialog("Introduce os cartos")));
        x++;
        }while(x<5);
    }
    
}
