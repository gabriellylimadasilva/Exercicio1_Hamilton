/*
Elabore um programa que lê as medidas de três cubos retangulares (base, altura e largura) e exibe a ordem que eles devem ser colocados em um caminhão, 
obedecendo ao critério de que cubos com maior área devem ser colocados primeiro. Observe o exemplo a seguir:
a.	Cubo 1 – Base: 2 / Altura: 4 / Comprimento: 5;
b.	Cubo 2 – Base: 4 / Altura: 4 / Comprimento: 4;
c.	Cubo 3 – Base: 2 / Altura: 1 / Comprimento: 2.
Ordem da colocação: cubo 2, cubo 1 e cubo 3.

 */
package exercicio_prof_hamilton;

import javax.swing.JOptionPane;

public class ExercicioQ {
    public static void main(String[] args)
    {
        
   
    double base1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a base1"));
    double altura1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura1"));
    double largura1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura1")); 
    
    double base2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a base2"));
    double altura2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura2"));
    double largura2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura2")); 
    
    double base3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a base3"));
    double altura3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura3"));
    double largura3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a largura3")); 
    
    double cubo1 = base1 * altura1 * largura1; //40
    double cubo2 = base2 * altura2 * largura2; //64
    double cubo3 = base3 * altura3 * largura3; //4
    
    
    
    
        if (cubo1 > cubo2 && cubo1 > cubo3 && cubo2 > cubo3 ){ //64 40 4
            //System.out.println ("Ordem dos cubos: "+cubo1+" "+cubo2+" "+cubo3);
            System.out.println ("ordem de colocacao: cubo1, cubo2 e cubo3 ("+cubo1+" "+cubo2+" "+cubo3+")");
        }
        else if (cubo1 > cubo2 && cubo1 > cubo3 && cubo3 > cubo2 ){ //64 4 40
            System.out.println ("Ordem dos cubos: cubo1, cubo3 e cubo2 ("+cubo1+" "+cubo3+" "+cubo2+")");
        }     
        else if (cubo2 > cubo3 && cubo2 > cubo1 && cubo1 > cubo3){ //40 64 4 
            System.out.println ("Ordem dos cubos: cubo2, cubo1 e cubo3 ("+cubo2+" "+cubo1+" "+cubo3+")");
        }
        else if (cubo2 > cubo3 && cubo2 > cubo1 && cubo1 < cubo3){ //4 64 40
            System.out.println ("Ordem dos cubos: cubo2, cubo3 e cubo1 ("+cubo2+" "+cubo3+" "+cubo1+")");
        }
        else if (cubo3 > cubo1 && cubo3 > cubo2 && cubo2 > cubo1){ //4 40 64
            System.out.println ("Ordem dos cubos: cubo3, cubo2 e cubo1 ("+cubo3+" "+cubo2+" "+cubo1+")");
        }   
        else if (cubo3 > cubo1 && cubo3 > cubo2 && cubo2 < cubo1){ //40 4 64    
            System.out.println ("Ordem dos cubos: cubo3, cubo1 e cubo2 ("+cubo3+" "+cubo1+" "+cubo2+")");
        }
    }
}

