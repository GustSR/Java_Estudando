package Atividade;

public class Main {

    public static void main(String[] args){

        Funcionario f = new Funcionario("Gustavo",1500, 200);
        System.out.println("-------------------------");
        System.out.println("Antes de adicionar a %:");
        f.printALL();
        
        System.out.println("-------------------------");
        System.out.println("Depois de adicionar a %:");

        f.adicionar_salario(10);
        f.printALL();
        System.out.println("-------------------------");



    }
    
}
