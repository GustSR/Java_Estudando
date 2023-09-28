package Veiculo_professor;

public class Main {

    public static void main(String[] args){

        Carro1 carro =  new Carro1("Onix",2020,"Preto","Chevrole",
        "4 portas","Bagageiro 60L","Parabrisa com sensor");

        Moto1 moto = new Moto1("CB650",2023,"vermelha","honda","Tripe comum", "Guidon esportivo");
        System.out.println("Modelo "+carro.getModelo());
        System.out.println("Modelo "+moto.getModelo());


    }
    
}
