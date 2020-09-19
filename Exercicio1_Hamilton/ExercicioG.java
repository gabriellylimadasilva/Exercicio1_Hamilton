/*
 Faça um programa que mostre um menu com as opções "adição", "subtração", "multiplicação" e "divisão", 
recebe dois valores reais, a operação escolhida pelo usuário e exibe o resultado da operação sobre os valores. 
 */
package exercicio_prof_hamilton;

import javax.swing.JOptionPane;

public class ExercicioG {
    public static void main(String[] args)
    {
    
    double n1 = 0, n2 = 0, soma, subtracao, multiplicacao, divisao;
    int opcao;
        
    
  
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
       
                    
       opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para adição \nDigite 2 para subtração \nDigite 3 para multiplicação \nDigite 4 para divisão"));
              
            if (opcao == 1)
            {
                soma = n1 + n2;
                JOptionPane.showMessageDialog(null, "A soma é: " + soma);
            }
            else if (opcao == 2)
            {
                subtracao = n1 - n2;
                JOptionPane.showMessageDialog(null, "A subtração é: " + subtracao);
            }
            else if (opcao == 3)
            {    
                multiplicacao = n1 * n2;
                JOptionPane.showMessageDialog(null, "A multiplicação é: " + multiplicacao);
            }
            else if (opcao == 4)
            {
                divisao = n1 / n2;
                JOptionPane.showMessageDialog(null, "A divisãoo é: " + divisao);
            }
            else if (opcao == 0 || opcao >4)
            {
                JOptionPane.showMessageDialog(null, "Opção inválida!!!");
            }   

    }
}

