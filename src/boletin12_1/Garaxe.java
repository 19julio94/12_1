package boletin12_1;

import javax.swing.JOptionPane;

public class Garaxe {

    int numeroCoches;
    String matricula;
    int tempo;
    float pago;
    float custo;

    int nPlazas = 5;
    int i = 0;

    public Garaxe() {
    }

    public void entrada(int num) {
        numeroCoches = num;
        boolean vacantes = true;

        if (numeroCoches >= nPlazas) {

            vacantes = false;
            JOptionPane.showMessageDialog(null, "COMPLETO");

        } else {
            JOptionPane.showMessageDialog(null, "DISPOÑIBLE");
        }

    }

    public void calculo(float pago) {

        if (tempo > 3) {
            custo = pago - 1.5f + 0.2f * tempo - 3;

        } else {
            custo = pago - 1.5f;

        }

        JOptionPane.showMessageDialog(null,"A matricula é:"+matricula+"\n"+"O tempo no parking foi:"+tempo+"\n"+"O cambio é " + custo);

    }

    public void setMatricula(String matricula) {

        this.matricula = JOptionPane.showInputDialog("Introduce a matricula");
        i++;

        if (i >= 5) {

            JOptionPane.showMessageDialog(null, "Parking Completo");

        }

    }

    public void setTempo() {
        this.tempo = Integer.parseInt(JOptionPane.showInputDialog("Introduce o tempo que estiveches no parking"));

    }

   

}
