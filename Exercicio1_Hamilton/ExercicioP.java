/*
Uma empresa decide presentear seus funcionários com um bônus de Natal. O valor é definido como segue:
a.	20% do salário para os funcionários homens com mais de quinze anos de casa;
b.	25% do salário para as funcionárias mulheres com mais de dez anos de casa;
c.	R$ 200,00 para os demais que não se encaixaram nas categorias anteriores.

Elabore um programa que recebe o sexo, o tempo de casa e o salário de um funcionário e exibe o 
valor total que o funcionário receberá no Natal (salário + bônus).

 */
package exercicio_prof_hamilton;

import javax.swing.JOptionPane;

public class ExercicioP {
    public static void main(String[] args)
    {
        
    double tempoCasa, salario; 
               
    
    String sexo = JOptionPane.showInputDialog("Digite o sexo do funcionário \n M - Masculino \n F - Feminino");
       
    tempoCasa = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de casa do funcionário"));
    salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do funcionário"));
    
    
        if ((sexo.equals("M")) && tempoCasa >= 15){
            salario = salario+salario*20/100;
            System.out.println("O bônus será: " +salario);
        }
        else if ((sexo.equals("F")) && tempoCasa >= 10){
            salario = salario+salario*25/100;
            System.out.println("O bônus será: "+salario);
        }
        else if (((sexo.equals("M")) && tempoCasa < 10) || ((sexo.equals("F")) && tempoCasa < 10)){
            salario = salario+200;
            System.out.println("O bônus será: "+salario);
        }
    }
}
