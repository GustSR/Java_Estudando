package Encapsulamento;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Pessoa p = new Pessoa();
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu nome: ");
        String nome = scan.nextLine();
        p.setNome(nome);

        
        System.out.println("Qual seu Cpf: ");
        String cpf = scan.nextLine();
        p.setCpf(cpf);

        System.out.println("Qual sua Idade: ");
        int idade = scan.nextInt();
        p.setIdade(idade);

        System.out.println("Qual seu naturalidade: ");
        String naturalidade = scan.nextLine();
        p.setNaturalidade(naturalidade);

        
        p.printAll();
        




        



    }
}
