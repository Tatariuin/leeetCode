package day.pkg1;
import java.util.*;
public class Day1 {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);

 int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
 
    System.out.println("Informe o alvo");
    int alvo = ler.nextInt();
    int c = 0,i = 0;
    boolean fim = false;
 for(i =0;i < numeros.length && fim == false;i++){
   
     for(c = 0;c < numeros.length && fim == false;c++){
         if((numeros[i]+numeros[c] == alvo) && (i != c)){
             System.out.println("["+i+", "+c+"]");
             
             fim = true;
         }         
     }   
 }
    
}
    
}
