
package javaapplication1;

import calculadora.Calculadora;
import java.util.Scanner;

public class JavaApplication1 {

    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Calculadora calc = new Calculadora();
         int x;
         
       do{
          calc.calcular();
         x = read.nextInt();
          switch(x){
              
                  case 1:
                  System.out.print("Digite os 2 valores para ser somando:");
                      double n1 = read.nextDouble();
                      double n2 = read.nextDouble();
                      System.out.print(calc.somar(n1, n2));
                      break;
                      case 2:
                  System.out.print("Digite os 2 valores para ser subtraido:");
                       n1 = read.nextDouble();
                       n2 = read.nextDouble();
                       System.out.print(calc.sub(n1, n2));
                       break;
                       case 3:
                  System.out.print("Digite os 2 valores para ser multiplicado:");
                        n1 = read.nextDouble();
                        n2 = read.nextDouble();
                        System.out.print(calc.mult(n1, n2));
                        break;
                            case 4:
                  System.out.print("Digite os 2 valores para ser dividido:");
                        n1 = read.nextDouble();
                        n2 = read.nextDouble();
                        System.out.print(calc.div(n1, n2));
                        break;
                        case 5:
                  System.out.print("Digite os 2 valores para ser potêncializado:");
                        n1 = read.nextDouble();
                        n2 = read.nextDouble();
                       System.out.print(calc.potencia(n1, n2));
                        break;
                        case 6:
                  System.out.print("Digite os 2 valores para ser raiz:");
                        n1 = read.nextDouble();
                       
                        System.out.print(calc.raiz(n1));
    
                        defeault:
                  System.out.print("opção invalida");
                                                    
                          
                          
                          
       
                          }
       }while(x!=0);
           
    read.close();
    }
}
