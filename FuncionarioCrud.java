package crud;

import interfaces.Repositorio;

public class FuncionarioCrud implements Repositorio {

    @Override
    public void incluir() {
        System.out.println("### ------------------- ###\nSalvando Dados....\n### ------------------- ###");
        System.out.println("Funcionário Salvo....");
    }

    @Override
    public void alterar() {
        System.out.println("### ------------------- ###\nAlterando Dados....\n### ------------------- ###");
        System.out.println("Alterando Funcionário....");
    }

    @Override
    public void excluir() {
        System.out.println("### ------------------- ###\nExluindo Dados....\n### ------------------- ###");
        System.out.println("Cliente Excluindo....");
    }

    @Override
    public void ler() {
        System.out.println("### ------------------- ###\nLendo Dados....\n### ------------------- ###");
        System.out.println("Lendo Funcionários....");
    }
}
