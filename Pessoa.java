package models;

//define clase pessoa
public class Pessoa {

    // define as variaveis da classe
    private String cpf;
    private String nome;
    private String telefone;

    //Cria as operações que recebe e retorna o valor das variaveis
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}// Fim clase pessoa
