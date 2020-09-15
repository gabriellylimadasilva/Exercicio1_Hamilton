/*
Faça um programa que recebe o valor de três arestas e exibe uma mensagem indicando se podem formar um triângulo. 
Em caso afirmativo, indique se ele é equilátero, isósceles ou escaleno. Lembre-se: Para que um triângulo exista, 
a medida de qualquer um dos lados deve ser menor que a soma das medidas dos outros dois.
 */
package exercicio_prof_hamilton;

import javax.swing.JOptionPane;

public class Exercicioi {
    public static void main(String[] args)
   {
       double a1, a2, a3;
       
       //equilátero = 3 lados iguais
       //isócelos = 2 lados iguais e 1 diferente
       //escaleno = 3 lados diferentes
       //triangulo = a1 < soma das demais arestas
   
        a1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado a"));
        a2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado b"));
        a3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o lado c"));
        
        if ((a1 < a2 + a3) && (a2 < a1 + a3) && (a3 < a2 + a1)){ 
            if ((a1 == a2) && (a1 == a3)) {
                System.out.println("equilátero");
            }
            else if ((a1 == a2) || (a1 == a3)){
                System.out.println("isócelos");
            }
            else  {
                System.out.println("escaleno");
            }
        }
   }
}

        