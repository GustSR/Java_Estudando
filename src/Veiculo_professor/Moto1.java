package Veiculo_professor;

public class Moto1 extends Veiculo1 {

    private String tripe;
    private String guidon;
    
    public String getTripe() {
        return tripe;
    }

    public void setTripe(String tripe) {
        this.tripe = tripe;
    }

    public String getGuidon() {
        return guidon;
    }

    public void setGuidon(String guidon) {
        this.guidon = guidon;
    }

    public Moto1(String modelo, int ano, String cor, String marca, String tripe, String guidon) {
        super(modelo, ano, cor, marca);
        this.tripe = tripe;
        this.guidon = guidon;
    }


    
}
