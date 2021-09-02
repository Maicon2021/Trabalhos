package telas;

import crud.ClienteCrud;

import java.util.Scanner;

public class Login {

    // iniciando Contrutor Login
    public static void login(Scanner sc){

        // cria variavel de operação e seto 0 para ela
        int opcao = 0;

        //inicio da repetição Do While para Opção de operação
        do {
            System.out.println("\n --------    Sitema Inicio   --------");
            System.out.println("\n 1 - Cliente\n 2 - Funcionário\n 3 - Produto\n 4 - Venda\n 0 - Sair\n");

            opcao = sc.nextInt();// Entrando valor para Opção

            //Inicio da opção de operação, Case
            switch (opcao){
                //Caso opção Cadastro Cliente
                case 1:
                    //chama a tela cadastro cliente
                    CadastroCliente.cadastroCliente(sc);
                    break;

                //Caso opção Opção Cadastro Funcionário
                case 2:
                    //chama a tela cadastro funcionario
                    CadastroFuncionario.cadastroFuncionario(sc);
                    break;

                //Caso opção Cadastro Produto
                case 3:
                    //Chama a tela cadastro Produto
                    CadastroProduto.cadastroProduto(sc);
                    break;

                //Caso Opção Venda
                case 4:
                    System.out.println("Em construção");
                    //chama a tela cadastro venda
                    CadastroVenda.cadastroVenda(sc);
                    break;

                //Caso Opção Sair
                case 0:

                    break;

                default:
                    System.out.println("Opção Inválida...");
                    break;

            }// fim  do switch case

        } while (opcao != 0);// repete ate condição diferente de 0


    }// fim do Contrutor Login
    /*private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }*/

}// fim da classe Login
