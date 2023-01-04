package day.pkg5;
import java.util.*;
public class Day5 {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);

    System.out.println("Insira a subString");
    String s = ler.nextLine();
    
    System.out.println("Maior subString: "+maiorSubString(s));
    
    
}
    static String maiorSubString(String s){
        s = s.toLowerCase();
        String veridica = "",candidata = "";
        for(int i = 0; i < s.length()-1;i++){
            
            for(int c = i+1;c < s.length();c++){
                
                if(s.charAt(i) == s.charAt(c)){

                    boolean isPalindromo = false;
                     candidata = "";
                     for(int j = 0; j < c && j < (int)((c-i));j++){
                         if(s.charAt(i + j) == s.charAt(c - j)){
                             isPalindromo = true;
                         }
                         else{
                             break;
                         }
      
                         }
                       if(isPalindromo == true){
                             for(int k = i;k <= c;k++){
                                 candidata += s.charAt(k);
                             }
                     }
                 if(candidata.length() > veridica.length() ){
                     veridica = candidata;
                 }
                }
            }
        }
        return veridica; 
    }
}
