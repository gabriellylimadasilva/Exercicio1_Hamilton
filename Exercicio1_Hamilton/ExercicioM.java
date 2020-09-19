/*
Faça um programa que recebe a quantidade de cilindradas (cc) de um veículo de competição e exibe a categoria 
a qual ele pertence, sendo:
a.	De 0cc a 120cc: “Sub Production”;
b.	De 121cc a 240cc: “Production”;
c.	Acima de 240cc: “Super Production”.
 */
package exercicio_prof_hamilton;

import javax.swing.JOptionPane;

public class ExercicioM {
    public static void main(String[] args)
    {
        int cc = Integer.parseInt(JOptionPane.showInputDialog("Digite a cilindrada"));
        
        if(cc >= 0 && cc <= 120){
            System.out.println("Sub Production");
        }
            else if (cc >=121 && cc <= 240){
                System.out.println("Production");
            }
            else  {
                System.out.println("Super Productio");
            }
        }
   }

        
        
  