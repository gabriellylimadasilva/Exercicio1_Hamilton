/*
Desenvolva um programa que, com base em duas notas de provas e três notas de trabalhos dadas pelo usuário, 
exibe uma mensagem indicando se o aluno foi aprovado, reprovado ou se fará o exame.
a.	6 ≤ 𝑀é𝑑𝑖𝑎 𝑓𝑖𝑛𝑎𝑙 ≤ 10, 𝑎𝑝𝑟𝑜𝑣𝑎𝑑𝑜
b.	4 ≤ 𝑀é𝑑𝑖𝑎 𝑓𝑖𝑛𝑎𝑙 < 6, 𝑒𝑥𝑎𝑚𝑒
c.	0 ≤ 𝑀é𝑑𝑖𝑎 𝑓𝑖𝑛𝑎𝑙 < 4, 𝑟𝑒𝑝𝑟𝑜𝑣𝑎𝑑𝑜
d.	Considere que 𝑀é𝑑𝑖𝑎 𝑓𝑖𝑛𝑎𝑙 =
𝑃𝑟𝑜𝑣𝑎𝑠+𝑇𝑟𝑎𝑏𝑎𝑙ℎ𝑜𝑠
 */
package exercicio_prof_hamilton;

import javax.swing.JOptionPane;

public class ExercicioO {
    public static void main(String[] args)
    {
        
    double prova1, prova2;
    double trabalho1, trabalho2, trabalho3;
    double media;
   
    prova1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota da prova"));
    prova2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota da prova"));
 
    trabalho1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota do trabalho"));
    trabalho2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota do trabalho"));
    trabalho3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a terceira nota do trabalho"));
    
    media = (prova1 + prova2 + trabalho1 + trabalho2 + trabalho3) /5;
    System.out.println("A média final é: "+media);
        
        if (media > 6 && media <= 10){
            System.out.println("Aprovado");
        }
        else if (media >= 4 && media < 6){
            System.out.println("Exame");
        }
        else{
            System.out.println("Reprovado");
        }
    }   
}
