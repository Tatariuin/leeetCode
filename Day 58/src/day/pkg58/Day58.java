package day.pkg58;
import java.util.*;
public class Day58 {
public static void main(String[] args) {
//Tamanho da ultima palavra da frase
Scanner ler = new Scanner(System.in);
    String UltimaPalavra = "";
    
    System.out.println("Informe a frase");
    String frase = ler.nextLine();
    int i = frase.length() - 1; 
    while(frase.charAt(i) != ' '){
        UltimaPalavra += frase.charAt(i);
        i--;
        if(i == -1)
            break;
    }
    System.out.println(UltimaPalavra.length());

}

    
}
