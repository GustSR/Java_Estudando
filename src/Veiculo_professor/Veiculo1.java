package Veiculo_professor;

public class Veiculo1 {

    private String modelo;
    private String marca;
    private int ano;
    private String cor;

    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }
    public String getCor() {
        return cor;
    }
    public String getMarca() {
        return marca;
    }

  

    public Veiculo1(String modelo, int ano, String cor, String marca) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.marca = marca;
    }

    

    
}
