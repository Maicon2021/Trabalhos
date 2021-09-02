package models;

// defini e inicia classe Funcionario que extende de Pessoa
public class Funcionario extends Pessoa{

    //Cria as variaveis que é atributo de funcionario apenas
    double salario;
    String pis;

    //Cria as operações que recebe e retorna o valor das variaveis
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPis() {
        return pis;
    }

    public void setPis(String pis) {
        this.pis = pis;
    }

}// fim da Classe funcionario
