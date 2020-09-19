/*
Faça um programa que recebe um número inteiro e exibe uma mensagem indicando se ele é par ou ímpar (use o operador % para obter o resto de uma divisão inteira).
 */
package exercicio_prof_hamilton;

import javax.swing.JOptionPane;

public class ExercicioE {
    public static void main(String[] args)
    {
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        if(n % 2 == 0){
            System.out.println("número é par: "+ n);
        }else{
            System.out.println("número é impar: " + n);
            
        }
    }
}


