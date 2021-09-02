package crud;

import interfaces.Repositorio;

public class ProdutoCrud implements Repositorio {

    @Override
    public void incluir() {
        System.out.println("### ------------------- ###\nSalvando Dados....\n### ------------------- ###");
        System.out.println("Produto Salvo....");
    }

    @Override
    public void alterar() {
        System.out.println("### ------------------- ###\nAlterando Dados....\n### ------------------- ###");
        System.out.println("Produto Alterado....");
    }

    @Override
    public void excluir() {
        System.out.println("### ------------------- ###\nExcluindo Dados....\n### ------------------- ###");
        System.out.println("Produto Excluindo....");
    }

    @Override
    public void ler() {
        System.out.println("### ------------------- ###\nLendo Dados....\n### ------------------- ###");
        System.out.println("Produtos Lidos....");
    }
}
