package crud;

import interfaces.Repositorio;

public class VendaCrud implements Repositorio {

    @Override
    public void incluir() {
        System.out.println("### ------------------- ###\nSalvando Dados....\n### ------------------- ###");
        System.out.println("Venda Salva....");
    }

    @Override
    public void alterar() {
        System.out.println("### ------------------- ###\nAlterando Dados....\n### ------------------- ###");
        System.out.println("  ** ERRO **\nApós Finalizado uma Venda não é Possível Alterar....");

    }

    @Override
    public void excluir() {
        System.out.println("### ------------------- ###\nExcluindo Dados....\n### ------------------- ###");
        System.out.println("  ** ERRO **\nApós Finalizado uma Venda não é Possível Excluir....");

    }

    @Override
    public void ler() {
        System.out.println("### ------------------- ###\nLendo Dados....\n### ------------------- ###");
        System.out.println("Vendas Lidas....");

    }
}
