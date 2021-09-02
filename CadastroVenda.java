package telas;

import crud.VendaCrud;

import models.Venda;

import java.util.Scanner;

public class CadastroVenda {

    public CadastroVenda(){

    }// fim do construtor

    //inicia metodo Cadastro Venda
    public static void cadastroVenda(Scanner sc){

        //Limpa memoria
        clearBuffer(sc);

        // cria variavel de operação e seto 0 para ela
        int opcao = 0;

        //inicio da repetição Do While para Opção de operação
        do {
            System.out.println("\n --------    Cadatro Venda  --------");
            System.out.println("\n 1 - Incluir\n 2 - Alterar\n 3 - Excluir\n 4 - Ler\n 0 - Sair\n");

            opcao = sc.nextInt();// Entrando valor para Opção

            //Inicio da opção de operação, Case
            switch (opcao){
                //Caso opção Incluir
                case 1:
                    Venda venda = new Venda();
                    //Limpa memoria
                    clearBuffer(sc);
                    System.out.println("Informe Forma de Pagamento: ");
                    venda.setTipoPagamento(sc.nextLine());

                    System.out.println("\n\n------------------\n" + "Tipo da Venda : " + venda.getTipoPagamento());

                    VendaCrud vendaCrudIncluir = new VendaCrud();
                    vendaCrudIncluir.incluir();

                    break;

                //Caso opção Alterar
                case 2:
                    VendaCrud vendaCrudAlterar = new VendaCrud();
                    vendaCrudAlterar.alterar();
                    break;

                //Caso opção Exluir
                case 3:
                    VendaCrud vendaCrudExcluir = new VendaCrud();
                    vendaCrudExcluir.excluir();
                    break;

                //Caso Opção Ler
                case 4:
                    VendaCrud vendaCrudLer = new VendaCrud();
                    vendaCrudLer.ler();
                    break;

                //Caso Opção Sair
                case 0:

                    break;
                //se opção Invalida
                default:
                    System.out.println("Opção Inválida...");
                    break;

            }// fim  do switch case

        } while (opcao != 0);

    }//Fim do Metodo Cadastro Venda

    // implementando limpar Buffer
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

}// fim da classe venda
