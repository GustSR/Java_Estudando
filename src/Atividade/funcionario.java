package Atividade;

public class funcionario {
    
    String nome;
    double salario_bruto;
    double imposto;
    double salario_liquido;


    public funcionario(double salario_bruto, double imposto){
        this.salario_bruto = salario_bruto;
        this.imposto = imposto;
        this.salario_liquido = salario_bruto - imposto;
    }
    
    public void adicionar_salario(double porcentagem){
        this.salario_liquido = (this.salario_bruto * porcentagem) + this.salario_liquido;

    }

    public void printALL(){
        System.out.println(nome);
        System.out.println(salario_bruto);
        System.out.println(imposto);
    }

}
