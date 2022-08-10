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
 
 int valor = 0;
 int um = 0;
 int dois = 0;
 int tres = 0;
 int quatro = 0;
 int cinco = 0;
 int quant = 0;
 
 System.out.println(" Caneta R$3,00 ");
 System.out.println(" Lápis R$2,30 ");
 System.out.println(" Borracha R$ 4,00");
 System.out.println(" Apontador R$ 4,50");
 
 
 int codigo = entrada.nextInt();
 
 if(quant==1){
 System.out.println(" Quantidade: ");
 quant = entrada.nextInt();
 
 switch (codigo){
     case 1:
         valor= um + quant;
           System.out.println(valor+ (valor*20)/100);
           System.out.println(" Resultado: " + valor);
           
     break;
     case 2:
         valor= dois + quant;
           System.out.println(valor+ (valor*20)/100);
           System.out.println(" Resultado " + valor);
     break;
     case 3:
         valor= tres + quant;
           System.out.println(valor+ (valor*20)/100);
           System.out.println(" Resultado " + valor);
     break;
     case 4:
         valor= quatro + quant;
           System.out.println(valor (valor*20)/100);
           System.out.println(" Resultado " + valor);
     break;
     case 5:
         valor= cinco + quant;
           System.out.println(valor+ (valor*20)/100);
           System.out.println(" Resultado " + valor);
     break;
     
     default:
         System.out.println("Código não existe");
     
     
 }
 }
}
