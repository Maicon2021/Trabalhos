package telas;

import crud.ClienteCrud;
import models.Cliente;

import java.util.Scanner;

//Inicia tela cadastro de Cliente que extende de Cliente
public class CadastroCliente extends Cliente {

    public CadastroCliente(){

    }// fim do meu Contrutor Cadastro Cliente

    public static void cadastroCliente(Scanner sc) {

        // cria variavel de operação e seto 0 para ela
        int opcao = 0;

        //inicio da repetição Do While para Opção de operação
        do {
            System.out.println("\n --------    Cadatro Cliente   --------");
            System.out.println("\n 1 - Incluir\n 2 - Alterar\n 3 - Excluir\n 4 - Ler\n 0 - Sair\n");

            //Limpa memoria
            clearBuffer(sc);
            opcao = sc.nextInt();// Entrando valor para Opção

            //Inicio da opção de operação, Case
            switch (opcao){
                //Caso opção Incluir
                case 1:
                    //intancia uma variavel cliente para Cliente
                    Cliente cliente = new Cliente();
                    //Limpa memoria
                    clearBuffer(sc);

                    System.out.println("Informe CPF: ");
                    cliente.setCpf(sc.nextLine());

                    System.out.println("Informe o nome:");
                    cliente.setNome(sc.nextLine());

                    System.out.println("Informe o Telefone:");
                    cliente.setTelefone(sc.nextLine());

                    System.out.println("Informe o Limite:");
                    cliente.setLimite(sc.nextDouble());

                    System.out.println("\n\n-----------------------\nCliente: " + cliente.getNome() + "\nCPF: " + cliente.getCpf()
                            + "\nFone: " + cliente.getTelefone() + "\nCrédito de R$: " + cliente.getLimite() );

                    ClienteCrud clienteCrudIncluir = new ClienteCrud();
                    clienteCrudIncluir.incluir();
                    break;

                //Caso opção Alterar
                case 2:
                    ClienteCrud clienteCrudAlterar = new ClienteCrud();
                    clienteCrudAlterar.alterar();
                    break;

                //Caso opção Exluir
                case 3:
                    ClienteCrud clienteCrudExcluir = new ClienteCrud();
                    clienteCrudExcluir.excluir();
                    break;

                //Caso Opção Ler
                case 4:
                    ClienteCrud clienteCrudLer = new ClienteCrud();
                    clienteCrudLer.ler();
                    break;

                //Caso Opção Sair
                case 0:

                    break;
                //opção invalida
                default:
                    System.out.println("Opção Inválida...");
                    break;

            }// fim  do switch case

        } while (opcao != 0);// repete enquanto diferente de 0

    }// fim do Construtor cadastro Cliente

    // implementando limpar Buffer
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

}// fim tela cadastro de cliente
