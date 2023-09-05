package Encapsulamento;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private String naturalidade;


    //METODO GET
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public int getIdade(){
        return idade;
    }
    public String geNaturalidade(){
        return naturalidade;
    }
    

    //METODO SET
    public void setNome(String nome){
        this.nome = nome; 
    }
    public void setCpf(String cpf){
        this.cpf = cpf; 
    }
    public void setIdade(int idade){
        this.idade = idade; 
    }
    public void setNaturalidade(String naturalidade){
        this.naturalidade = naturalidade; 
    }
    public void setAll(String nome, String cpf, int idade, String naturalidade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.naturalidade = naturalidade;
    }

    //PRINTAR TUDO
    public void printAll(){
        System.out.println("Nome: "+nome);
        System.out.println("Cpf: "+cpf);
        System.out.println("Idade: "+idade);
        System.out.println("Naturalidade: "+naturalidade);
    }

}
