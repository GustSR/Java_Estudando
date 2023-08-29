package Objeto3;

public class produto {

    //atributos da classe
    private double valor;
    private String nome;
    private int quantidade;

    public produto (double valor, String nome){
        this.valor = valor;
        this.nome = nome;
        quantidade = 0;
    }

    public double totalValorEmEstoque(){
        return quantidade;
    }

    public void adicionarProdutos(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade){
        this.quantidade -= quantidade;
    }   

    public void exibirInformacoes(){
        System.out.println("Nome: "+nome);
        System.out.println("Valor: "+valor);
        System.out.println("Estoque: "+quantidade);
    }
}
