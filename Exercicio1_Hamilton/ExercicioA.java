/*Faça um programa que recebe duas notas, exibe a média aritmética das notas e 
uma mensagem indicando se o aluno foi aprovado ou reprovado. A média para aprovação deve ser maior que seis.
*/
package exercicio_prof_hamilton;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class ExercicioA {
    public static void main(String[] args)
    {
        
        Scanner entrada = new Scanner (System.in);
        
        //Entrada de dados com o Scanne
        System.out.println("Digite a primeira nota");
        double nota01 = entrada.nextDouble();
        
        System.out.println("Digite a segunda nota");
        double nota02 = entrada.nextDouble();
        
        //Entrada de dados com JOptionPana
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
        double nota1nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
        
        //Processamento da média
        double media= (nota01+nota02)/2;
        
        double medias= (nota01+nota02)/2;
        
        //Saída com println
        //System.out.println("A sua média é: "+media);
        //System.out.println("A sua média é: "((nota01+nota02)/2));
                 
        //Saída com JOptionPane        
        JOptionPane.showMessageDialog(null, "A sua média é: "+medias);
        
        
       if(media > 6){
            System.out.println("Aprovado!!");
       }
       else{
           JOptionPane.showMessageDialog(null, "Reprovado!!");
       }
       
    }
}       
