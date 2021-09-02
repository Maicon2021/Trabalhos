package models;

//define e inicia classe produto
public class Produto {

    // define as variaveis da classe produto
    public int codigo;
    public String descricao;
    public double valor;

    //Cria as operações de recebe e retorna o valor das variaveis
    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}// fim da classe produto
