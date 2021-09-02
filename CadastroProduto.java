package telas;

import crud.ProdutoCrud;
import models.Produto;

import java.util.Scanner;

public class CadastroProduto {

    public CadastroProduto(){

    }// fim do construtor

    //inicia metodo Cadastro produto
    public static void cadastroProduto(Scanner sc){

        // cria variavel de operação e seto 0 para ela
        int opcao = 0;

        //inicio da repetição Do While para Opção de operação
        do {
            System.out.println("\n --------    Cadatro Produto  --------");
            System.out.println("\n 1 - Incluir\n 2 - Alterar\n 3 - Excluir\n 4 - Ler\n 0 - Sair\n");

            //Limpa memoria
            clearBuffer(sc);
            opcao = sc.nextInt();// Entrando valor para Opção

            //Inicio da opção de operação, Case
            switch (opcao){
                //Caso opção Incluir
                case 1:
                    Produto produto = new Produto();
                    //Limpa memoria
                    clearBuffer(sc);
                    System.out.println("Informe Codigo: ");
                    produto.setCodigo(sc.nextInt());

                    //Limpa memoria
                    clearBuffer(sc);

                    System.out.println("Informe Descrição: ");
                    produto.setDescricao(sc.nextLine());

                    System.out.println("Valor do Produto: ");
                    produto.setValor(sc.nextDouble());

                    System.out.println("\n\n------------------\n" + "Codigo: " + produto.getCodigo() + "\nDescrição: " +
                            produto.getDescricao() + "\nValor: " + produto.getValor());

                    ProdutoCrud produtoCrudIncluir = new ProdutoCrud();
                    produtoCrudIncluir.incluir();
                    break;

                //Caso opção Alterar
                case 2:
                    ProdutoCrud produtoCrudAlterar = new ProdutoCrud();
                    produtoCrudAlterar.alterar();
                    break;

                //Caso opção Exluir
                case 3:
                    ProdutoCrud produtoCrudExcluir = new ProdutoCrud();
                    produtoCrudExcluir.excluir();
                    break;

                //Caso Opção Ler
                case 4:
                    ProdutoCrud produtoCrudLer = new ProdutoCrud();
                    produtoCrudLer.ler();
                    break;

                //Caso Opção Sair
                case 0:

                    break;

                default:
                    System.out.println("Opção Inválida...");
                    break;

            }// fim  do switch case

        } while (opcao != 0);

    }//Fim do Metodo Cadastro Produto

    // implementando limpar Buffer
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

}// fim da class Cadastro Produto
