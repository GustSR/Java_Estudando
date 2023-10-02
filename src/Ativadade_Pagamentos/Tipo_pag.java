package Ativadade_Pagamentos;

public class Tipo_pag implements Pagamento {


    public void credito(float valor, float valor_produto){
       float valor_pago = (valor_produto - valor)+(5/100);
    }

    public void debito(){

    }

    public void dinheiro(){


    }
}
