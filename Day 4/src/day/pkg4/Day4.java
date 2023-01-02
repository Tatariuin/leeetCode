package day.pkg4;
import java.util.*;
public class Day4 {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
    
    int[]a = {1,4};
    int[]b = {2,3};
    System.out.println(mediana(a,b));
    
    
}
    static double mediana(int a[],int b[]){
        int []resultado = new int[a.length+b.length];
        int c = 0;
        for(int i = 0; i < a.length+b.length;i++){
            if(i < a.length){
                resultado[i] = a[i];
            }
            else{
                resultado[i] = b[c];
                c++;
            }
            
        }
        Arrays.sort(resultado);
        
        if(resultado.length%2 != 0){
            return resultado[(int)resultado.length/2];
        }
        return (double) (resultado[resultado.length/2]+resultado[resultado.length/2-1])/2;
        
        
        
    }
}
