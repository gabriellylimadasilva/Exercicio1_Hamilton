/*
Tendo como entrada a altura e o sexo de uma pessoa, construa um programa que exibe o peso ideal para ela, em quilos.
Use as seguintes fórmulas (adote ℎ como a altura e em metros): • Homens: 72,7 × ℎ
− 58 • Mulheres: 62,1 × ℎ − 44,7
 */


package exercicio_prof_hamilton;

import javax.swing.JOptionPane;

public class ExercicioB {
    public static void main(String[] args)
    {
    
        String sexo = JOptionPane.showInputDialog("Digite \n M - Masculino \n F - Feminino");  //F
        sexo = sexo.toUpperCase(); //F  
        if((sexo.equals("F")) || (sexo.equals("FEMININO")) || (sexo.equals("M")) || (sexo.equals("MASCULINO")))
        {
            double h = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura").replace(',', '.'));

            //sexo = sexo.toUpperCase(); //F  

            if((sexo.equals("F")) || (sexo.equals("FEMININO")))
            {
                System.out.println("O peso ideal de uma mulher é: "+(62.1 * h - 44.7));
                JOptionPane.showMessageDialog(null, "O peso ideal é: " + (62.1 * h - 44.7));
            }
            else if((sexo.equals("M")) || (sexo.equals("MASCULINO")))
            {
                System.out.println("O peso ideal de um homem é: "+(72.7 * h - 58));
                JOptionPane.showMessageDialog(null, "O peso ideal é: " + (72.7 * h - 58));
            }
             else
            {
                System.out.println("Opção inválida!!!");
                JOptionPane.showMessageDialog(null, "Opção inválida!!!");
            }
        
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Opção invalida ");
        }
    }
}      