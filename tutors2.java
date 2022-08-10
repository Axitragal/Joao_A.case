/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package umnovocomeço;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class tutors {
    
 public static void main(String[] args){
 Scanner entrada = new Scanner(System.in);
 
 System.out.println("Valor de a: ");
 int a = entrada.nextInt();
 System.out.println("Valor de b: ");
 int b = entrada.nextInt();
 System.out.println(" informe o código. 3, 4 ou 5");
 int codigo = entrada.nextInt();
 int c = 0;
 
 switch (codigo){
     case 3:
         c= a+b;
           System.out.println(a=a+ (a*20)/100);
           System.out.println(" Resultado: " + c);
           
     break;
     case 4:
         c= a+b;
           System.out.println(a=a+ (a*20)/100);
           System.out.println(" Resultado " + c);
     break;
     case 5:
         c= a+b;
           System.out.println(a=a+ (a*20)/100);
           System.out.println(" Resultado " + c);
     break;
     
     default:
         System.out.println("Código não existe");
     
     
 }
 }
}
