package lista_funcoes;

import java.util.Scanner;

public class lista_funcoes_ex2Joao {
   public static void main(String[]args){
       
    Scanner s = new Scanner(System.in);
    String frutas [] = new String[5];
    
     
       
       for (int i = 0; i < frutas.length; i++){
       frutas[i] = solicita_texto(s);
       }
       
       System.out.println("Frutas informadas : ");
       for (int i = 0; i < frutas.length; i++){
       System.out.println((i + 1) + "- " + frutas[i]);
       }
   } 
   
   public static String solicita_texto(Scanner s){
      String nome_fruta;
      while (true){
          System.out.println("Informe um nome de fruta com 5 ou mais caracteres: ");
          nome_fruta = s.nextLine();
   
      if (nome_fruta.length() >= 5){
          return nome_fruta;
      } else {
          System.out.println("Palavra muito pequena. Tente novamente. ");
      
        }
      }  
   }
}
