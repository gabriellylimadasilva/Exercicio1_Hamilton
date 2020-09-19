/*
Faça um programa que recebe o nome e a data de nascimento de duas pessoas e exibe o nome da mais velha. 
Cada data deve ser fornecida em três valores inteiros, onde o primeiro representa o dia, o segundo o mês e o terceiro o ano.
 */
package exercicio_prof_hamilton;

import javax.swing.JOptionPane;

public class ExercicioL {
    public static void main(String[] args)
    {
        String nome1 = JOptionPane.showInputDialog("Digite o primeiro nome");
        int dia1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do nascimento"));
        int mes1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês do nascimento"));
        int ano1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do nascimento"));
        
        String nome2 = JOptionPane.showInputDialog("Digite o segundo nome");
        int dia2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia do nascimento"));
        int mes2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês do nascimento"));
        int ano2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do nascimento"));
        
        if((ano1<ano2) || (ano1 == ano2 && mes1<mes2) || (ano1 == ano2 && mes1 == mes2 && dia1<dia2))
        {
                System.out.println("A Pessoa mais velha é o primeiro nome: "+ nome1);
        }        
        else{
                  System.out.println("A Pessoa mais velha é o segundo nome: "+ nome2);
            }
    }
}
