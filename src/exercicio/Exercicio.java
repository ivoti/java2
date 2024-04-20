/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio;

import javax.swing.JOptionPane;

public class Exercicio {

    public static void main(String[] args) {
        int n1 ;
        int n2 ;
        int n3 ;
        
        int maior;
        int menor = 0;

        //integer converte para inteiro
        n1 = Integer.parseInt(JOptionPane.showInputDialog("digite um número"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo número"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("digite o terceiro número"));
        JOptionPane.showMessageDialog(null, "Soma do numero 1 com numero 2" + n1 + n2);

        if (n1 > n2) {
            JOptionPane.showMessageDialog(null, "for maio que" + n1);
            maior = n1;
            menor =n2;
        } else {
            JOptionPane.showMessageDialog(null, "n2" + n2);
            maior = n2;
            menor =n1;

        }
        if (maior > n3) {
             JOptionPane.showMessageDialog(null, "maior numero" + maior);

        }else{
        JOptionPane.showMessageDialog(null, "maior numero" + n3);
        }
        if (menor < n3){
              JOptionPane.showMessageDialog(null, "menor numero" + menor);
              
        }else{
          JOptionPane.showMessageDialog(null, "menor numero" + n3);
        }
            
        }
        
    }

