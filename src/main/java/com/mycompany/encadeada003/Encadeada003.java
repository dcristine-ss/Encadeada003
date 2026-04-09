
package com.mycompany.encadeada003;


import javax.swing.JOptionPane;

public class Encadeada003 {

    public static void main(String[] args) {

        int numero;

        numero = Integer.parseInt(
                JOptionPane.showInputDialog("Digite um número:")
        );

        if (numero % 10 == 0) {
            JOptionPane.showMessageDialog(null, "O número é divisível por 10");
        }

        else if (numero % 5 == 0) {
            JOptionPane.showMessageDialog(null, "O número é divisível por 5");
        }

        else if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número é divisível por 2");
        }

        else {
            JOptionPane.showMessageDialog(null, "Não é divisível por 10, 5 ou 2");
        }

    }
}

