package day.pkg3;
import java.util.*;
public class Day3 {
public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Informe a string");
    String s = ler.nextLine();
    
    String resposta = "";
    resposta += s.charAt(0);
    
    boolean repetida;
    
    for(int i = 0; i < s.length();i++){
        
        repetida = false;
        
        for(int c = 0;c < resposta.length();c++){
            if(s.charAt(i) == resposta.charAt(c)){
                repetida = true;
                break;
            }
        }
        
        if(repetida == false){
            resposta += s.charAt(i);
        }
        
    }
    System.out.println("Substring gerada: "+resposta+"\nTamanho da substring: "+resposta.length());
}
    
}
