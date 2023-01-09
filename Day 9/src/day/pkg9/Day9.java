package day.pkg9;
import java.util.*;
public class Day9 {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);

    System.out.println("Informe o número inteiro");
    int x = ler.nextInt();
    
    System.out.println(isPalindromo(x));
}
static boolean isPalindromo(int x){
    
    String xString = "";
    
    for(int i = Integer.toString(x).length() - 1; i >= 0 ;i--){
        xString += Integer.toString(x).charAt(i);
    }
    if(xString.equals(Integer.toString(x))){
        return true;
    }
    return false;
    
}
    
}
