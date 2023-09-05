package Sobrecarga;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        sobrecargaMetodo teste = new sobrecargaMetodo();
        Scanner entrada = new Scanner(System.in);
        
        double soma = teste.adicao(30.20,20.40);
        System.out.println(soma);

    }
}
