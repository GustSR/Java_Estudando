package Veiculo_professor;

public class Carro1 extends Veiculo1{

    private String porta;
    private String bagageiro;
    private String parabrisa;

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public String getBagageiro() {
        return bagageiro;
    }

    public void setBagageiro(String bagageiro) {
        this.bagageiro = bagageiro;
    }

    public String getParabrisa() {
        return parabrisa;
    }

    public void setParabrisa(String parabrisa) {
        this.parabrisa = parabrisa;
    }

    public Carro1 (String modelo, int ano, String cor, String marca, String porta, String bagageiro, String parabrisa){
        super(modelo, ano, cor, marca);
        this.porta = porta;
        this.bagageiro = bagageiro;
        this.parabrisa = parabrisa;
    }  
    
    public void arcodicionado(){
        System.out.println("arcondicionado...");
    }
}
