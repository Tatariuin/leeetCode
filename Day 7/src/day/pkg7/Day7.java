package day.pkg7;
import java.util.*;
public class Day7 {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);

    System.out.println("Informe o número");
    int numero = ler.nextInt();
    
    System.out.println(invertDigitos(numero));
}
    static int invertDigitos(int x){
        String numeroString = Integer.toString(x);
    
    int finalizar = 0;
    String s = "";
    
    if(x < 0){
        finalizar = 1;
        s += "-";
    }
    
    for(int i = numeroString.length() - 1;i >= finalizar;i--){
       s += numeroString.charAt(i);
        
    }
    
    return Integer.parseInt(s);
    }
}
