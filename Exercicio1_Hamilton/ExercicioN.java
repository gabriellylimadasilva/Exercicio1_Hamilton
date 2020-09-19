/*
Faça um programa que recebe a idade de um nadador e exibe a categoria que ele pertence. Sendo o critério: 
a.	Infantil (0 a 10 anos);
b.	Junior (11 a 14 anos); 
c.	Adolescente (15 a 20 anos);
d.	Jovem (21 a 35 anos) e 
e.	Máster (> 35 anos).
 */

package exercicio_prof_hamilton;

import javax.swing.JOptionPane;

public class ExercicioN {
    public static void main(String[] args)
    {
    
    int nadador = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));

        if(nadador >= 0 && nadador <= 10){
            System.out.println("Infantil");
        }
        else if (nadador >=11 && nadador <= 14){
            System.out.println("Junior");
        }
        else if (nadador >=21 && nadador <= 35){
            System.out.println("Jovem");
        }
        else{
            System.out.println("Máster");
        }     
   }
} 
