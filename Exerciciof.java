/*
Faça um programa que recebe três números reais e os exibe em ordem crescente.
 */
package exercicio_prof_hamilton;

import javax.swing.JOptionPane;

public class Exerciciof {
    public static void main(String[] args)
    {

        double n1, n2, n3;
                
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite o terceiro número"));
        
//        if ((n1 < n2) && (n2 < n3)){ 
//            System.out.println("ordem crescente: " + n1 + " " + n2 + " " + n3);
//        }
//        else if ((n1 < n2) && (n2 > n3)){ //
//            System.out.println("ordem crescente: " + n1 + " " + n3 + " " + n2);
//        }
//        else if ((n1 > n2) && (n2 < n3)){
//            System.out.println("ordem crescente: " + n2 + " " + n1 + " " + n3);          
//        }
//    
//        else if ((n1 > n2) && (n2 < n3)){
//            System.out.println("ordem crescente: " + n3 + " " + n1 + " " + n2);
//        }
//        else if ((n1 > n2) && (n2 > n3)){
//            System.out.println("ordem crescente: " + n3 + " " + n2 + " " + n1);
//        }

        if( n1 < n2 && n2 < n3 ) {

		System.out.println ( n1 + " " + n2 + " " + n3);

	} else if( n1 < n3 && n3 < n2 ) {

		System.out.println ( n1 + " " + n3 + " " + n2);

	} else if( n2 < n1 && n1 < n3 ) {

		System.out.println ( n2 + " " + n1 + " " + n3);

	} else if( n2 < n3 && n3 < n1 ) {

		System.out.println ( n2 + " " + n3 + " " + n1);

	} else if( n3 < n2 && n2 < n1 ) {

		System.out.println ( n3 + " " + n2 + " " + n1);

	} else if( n3 < n1 && n1 < n2 ) {

		System.out.println ( n3 + " " + n1 + " " + n2);

	}
    }
    
    
}
        

        