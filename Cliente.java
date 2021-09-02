package models;

//Define Clase Cliente
public class Cliente extends Pessoa{

    //Define as variavel que é atributo de cliente apenas
    double limite;

    //Cria as operações que recebe e retorna o valor das variaveis
    public double getLimite(){
        return limite;

    }

    public void setLimite(double limite){
        this.limite = limite;

    }



}// fim da classe cliente
