/*
Faça um programa que recebe duas datas distintas e exibe a mais 
recente. Cada data deve ser fornecida como três valores inteiros, onde o 
primeiro representa o dia, o segundo o mês e o terceiro o ano. Dica: comece verificando pelo ano
 */
package exercicio_prof_hamilton;

import javax.swing.JOptionPane;


public class ExercicioK {
    public static void main(String[] args)
    {
                
        int dia1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira data - Dia"));
        int mes1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira data - Mês"));
        int ano1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a primeira data - Ano"));
        
        int dia2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda data - Dia"));
        int mes2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda data - Mês"));
        int ano2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a segunda data - Ano"));
        
        if((ano1>ano2) || (ano1 == ano2 && mes1>mes2) || (ano1 == ano2 && mes1 == mes2 && dia1 > dia2))
        {
                System.out.println("data1 é a mais recente: "+ dia1+"/"+mes1+"/"+ano1);
        }        
        else{
                  System.out.println("data2 é a mais recente: "+ dia2+"/"+mes2+"/"+ano2);
            }
    }
}
