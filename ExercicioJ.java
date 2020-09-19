/*
Faça um programa que recebe os coeficientes a, b e C  (a ≠ 0) de uma equação de segundo grau e exibe os valores das raízes, 
se forem reais, ou a mensagem "nao existem raizes reais", caso contrário.
delta = b² -4ac
raizquadrada = (-b+(√delta)) / (2*a)
 */
package exercicio_prof_hamilton;

import javax.swing.JOptionPane;

public class ExercicioJ {
   public static void main(String[] args)
   {
      
        double a, b, c,raiz1, raiz, raiz2, delta;
       
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite primeiro coeficiente a"));  
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite primeiro coeficiente b")); 
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite primeiro coeficiente c")); 
       
        delta = (b*b) -(4*a*c);
        if (delta > 0){
            raiz1 = ((-b) + Math.sqrt(delta)) / (2*a);
            raiz2 = ((-b) - Math.sqrt(delta)) / (2*a);
            System.out.println("Raizes Reais e Distintas \nRaiz1: " +raiz1 + "\nRaiz2: " +raiz2);
        }
        else if (delta == 0){ 
            raiz1 = ((-b) + Math.sqrt(delta)) / (2*a);
            raiz2 = ((-b) - Math.sqrt(delta)) / (2*a);
            System.out.println("Raiz Reais e Iguais: \nRaiz1: " +raiz1 + "\nRaiz2: " +raiz2);
        }
        else{
            System.out.println("Raiz complexa não podemos continuar: ");
        }
    } 
}

