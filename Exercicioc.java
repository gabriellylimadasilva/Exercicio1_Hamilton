/*
Faça um programa que recebe dois números inteiros distintos e exibe o maior. 
 */
package exercicio_prof_hamilton;

import javax.swing.JOptionPane;

public class Exercicioc {
    public static void main(String[] args)
{
    int n1, n2;
    
    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
    
    if(n1 > n2){
            System.out.println("Número:  " +n1 + " é o maior");
    }
    else if(n2 > n1){
            System.out.println("Número:  " +n2 + " é o maior");
    }    
    else{
        JOptionPane.showMessageDialog(null, "São Iguais");
    }   }
}
    



