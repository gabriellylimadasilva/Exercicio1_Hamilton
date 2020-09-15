/*
 Faça um programa que mostre um menu com as opções "adição", "subtração", "multiplicação" e "divisão", 
recebe dois valores reais, a operação escolhida pelo usuário e exibe o resultado da operação sobre os valores. 
 */
package exercicio_prof_hamilton;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exerciciog {
    public static void main(String[] args)
    {
    
    double n1 = 0, n2 = 0, soma, subtracao, multiplicacao, divisao;
    int opcao;
        Scanner entrada = new Scanner (System.in);
        
    do{
            
        System.out.println("\nDigite o primeiro número");
        n1 = entrada.nextDouble();
       
        System.out.println("Digite o segundo número");
        n2 = entrada.nextDouble();
                    
        System.out.println("\nDigite 1 para adição");
        System.out.println("Digite 2 para subtração");
        System.out.println("Digite 3 para multiplicação");
        System.out.println("Digite 4 para divisão");
        
               
        opcao = entrada.nextInt();
        switch(opcao){
            case 1:
                soma = n1 + n2;
                System.out.println ("A soma é: " + soma);
                break;
              case 2:
                subtracao = n1 - n2;
                System.out.println ("A subtração é: " + subtracao);
                break;                  
              case 3:
                multiplicacao = n1 * n2;
                System.out.println ("A multiplicação é: " + multiplicacao);
                break;
              case 4:
                divisao = n1 / n2;
                System.out.println ("A divisãoo é: " + divisao);
                break;
              default: 
                  System.out.println ("Opção inválida");
                      JOptionPane.showMessageDialog(null, "Opção inválida!!!");
        }
        
    }while (opcao != 0);
    }
}
