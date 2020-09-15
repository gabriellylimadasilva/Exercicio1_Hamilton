/*
Faça um programa que recebe dois números reais e exibe o menor deles e com duas casas decimais.
 */
package exercicio_prof_hamilton;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Exerciciod {
   public static void main(String[] args)
    {
        double n1, n2;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
        
        DecimalFormat f = new DecimalFormat("#.##");
        
        if(n1 > n2){
            System.out.println("Número: "+f.format(n2) + " é o menor");
        }
        else if(n2 > n1){
            System.out.println("Número: "+f.format(n1) + " é o menor");
        }    
        else{
            JOptionPane.showMessageDialog(null, "São Iguais");
       }
    }
}
   

    
