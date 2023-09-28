package Heranca2;

public class Veiculo {

    private String marca;
    private String cor;
    private String modelo;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Veiculo(String _marca, String _modelo, String _cor) {
        this.marca = _marca;
        this.modelo = _modelo;
        this.cor = _cor;
    }
    
    
}
