/*
Desenvolva um programa que recebe a base e a altura de três triângulos e exibe a maior área. Lembre-se da fórmula: 𝐴 = 𝑏𝑎𝑠𝑒 ×𝑎𝑙𝑡𝑢𝑟𝑎 / 2
 */
package exercicio_prof_hamilton;

import javax.swing.JOptionPane;


public class Exercicioh {
   public static void main(String[] args)
   {
       
    
       double base1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a base t1"));
       double altura1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura t2"));
       double t1 = base1 * altura1 / 2;
       
       double base2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a base t2"));
       double altura2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura t2"));
       double t2 = base2 * altura2 / 2;
       
       double base3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a base t3"));
       double altura3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura t3"));
       double t3 = base3 * altura3 / 2;
       
                
       if (t1 > t2 && t1 > t3) {
        System.out.println("t1: "+t1+" é o maior");
       }
       else if (t2 > t1 && t2 > t3) {
        System.out.println("t2: "+t2+" é o maior");
       }
       else if (t3 > t1 && t3 > t2) {
        System.out.println("t3: "+t3+" é o maior");  
       }
   }
   
       
}
