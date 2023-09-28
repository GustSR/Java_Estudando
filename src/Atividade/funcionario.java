package Atividade;

public class Funcionario{
    
    private String nome;
    private double salario_bruto;
    private double imposto;
    private double salario_liquido;


    public String getNome() {
        return nome;
    }

    public double getSalario_bruto() {
        return salario_bruto;
    }

    public double getImposto() {
        return imposto;
    }

    public double getSalario_liquido() {
        return salario_liquido;
    }

    public Funcionario(String nome, double salario_bruto, double imposto){
        this.nome = nome;
        this.salario_bruto = salario_bruto;
        this.imposto = imposto;
        this.salario_liquido = salario_bruto - imposto;
    }
    
    public void adicionar_salario(double porcentagem){
        this.salario_liquido = (this.salario_bruto * (porcentagem/100)) + this.salario_liquido;

    }

    public void printALL(){
        System.out.println(nome);
        System.out.println(salario_bruto);
        System.out.println(imposto);
        System.out.println(salario_liquido);
    }

}
