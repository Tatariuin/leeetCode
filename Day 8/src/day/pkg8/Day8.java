package day.pkg8;
import java.util.*;
public class Day8 {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);

    System.out.print("Insira a String para ser convertida: ");
    String teste = ler.nextLine();
    
    System.out.println("String convertida para inteiro: "+paraInteiro(teste));
    
    
    
    
    }
static int paraInteiro(String as){
    String aux = "";
    
    boolean negativo = false;
    
   
    
    for(int i = 0;i < as.length();i++){
        if(as.charAt(i) == '1' || as.charAt(i) == '2' || as.charAt(i) == '3' || as.charAt(i) == '4' || as.charAt(i) == '5' || as.charAt(i) == '6' || as.charAt(i) == '7' || as.charAt(i) == '8' || as.charAt(i) == '9' || as.charAt(i) == '0' ){
            aux += as.charAt(i);
        }
        if(as.charAt(i) == '-'){
       negativo = true;
   }
    }
    as = aux;
    
        String s = "";
    ArrayList<Character> listN = new ArrayList();
    int cont = 1;
    for(int i = 0 ;i < as.length();i++){
         
        listN.add(as.charAt(i));
         
    }
   
    if(listN.size() > 3){
    for(int i = listN.size() - 1; i >= 0;i--){
        if(cont%3 == 0 && i != 0){
            listN.add(i,'.');
        }
        cont++;
    }
    }
    for(int i = 0;i < listN.size();i++){
        s += listN.get(i);
    }
    
    
    
    String sub = "";
    ArrayList<String> listaSubs = new ArrayList();
    int c = 0;
    
    while(c < s.length()){
        if(s.charAt(c) != '.'){
            sub += s.charAt(c);
        }
        if((s.charAt(c) == '.' && sub.length() != 0) || c == s.length() - 1){
            listaSubs.add(sub);
            sub = "";
        }
        c++;
    }
    int resultado = 0;
    
    for(int i = 0;i < listaSubs.size();){
        int multplicador = 1, multplicadorSub = 1;
        
        if(listaSubs.size()-1 == 1){
        multplicador = 1000;
        }
        else if(listaSubs.size()-1 == 2){
        multplicador = 1000000;
        }
        else if(listaSubs.size()-1 == 3){
        multplicador = 1000000000;
        }
        
        for(int k = 0;k < listaSubs.get(i).length();k++){
            int numero = 0;
            if(listaSubs.get(i).length() == 3){
                if(k == 0){
                    multplicadorSub = 100;
                }
                else if(k == 1){
                    multplicadorSub = 10;
                }
                else{
                    multplicadorSub = 1;
                }
                
                }
            if(listaSubs.get(i).length() == 2){    
                    if(k == 0){
                        multplicadorSub = 10; 
                    }    
                    else{
                        multplicadorSub = 1;
                    }
                }
            switch(listaSubs.get(i).charAt(k)){
                case '1':
                    numero = 1;
                    break;
                case '2':
                    numero = 2;
                    break;
                case '3':
                    numero = 3;
                    break;
                case '4':
                    numero = 4;
                    break;
                case '5':
                    numero = 5;
                    break;
                case '6':
                    numero = 6;
                    break;
                case '7':
                    numero = 7;
                    break;
                case '8':
                    numero = 8;
                    break;
                case '9':
                    numero = 9;
                    break;
                default:
                    numero = 0;
                    break;
            }
            numero = numero*multplicadorSub*multplicador;
            
            resultado += numero;
            }
        listaSubs.remove(i);
        }
    if(negativo == true){
        return resultado*-1;
    }
        return resultado;
    }
}
  

