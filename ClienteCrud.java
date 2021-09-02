package crud;

import interfaces.Repositorio;


public class ClienteCrud implements Repositorio {
    @Override
    public void incluir() {
        System.out.println("### ------------------- ###\nSalvando Dados....\n### ------------------- ###");
        System.out.println("Cliente Salvo....");
    }

    @Override
    public void alterar() {
        System.out.println("### ------------------- ###\nAlterando Dados....\n### ------------------- ###");
        System.out.println("Alterando Cliente....");
    }

    @Override
    public void excluir() {
        System.out.println("### ------------------- ###\nExcluindo Dados....\n### ------------------- ###");
        System.out.println("Cliente Excluido....");
    }

    @Override
    public void ler() {
        System.out.println("### ------------------- ###\nLendo Dados....\n### ------------------- ###");
        System.out.println("Lendo Cliente....");

    }
}
