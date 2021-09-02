package telas;

import crud.FuncionarioCrud;
import models.Funcionario;

import java.util.Scanner;

//inicia tela cadastro funcionário
public class CadastroFuncionario extends Funcionario {

    //Iniciando Construtor
    public CadastroFuncionario(){

    }// construtor Cadastro funcionario

    // Metodo Funcionario
    public static void cadastroFuncionario(Scanner sc){
        // cria variavel de operação e seto 0 para ela
        int opcao = 0;

        //inicio da repetição Do While para Opção de operação
        do {
            //Limpa memoria
            clearBuffer(sc);
            System.out.println("\n --------    Cadatro Funcionário  --------");
            System.out.println("\n 1 - Incluir\n 2 - Alterar\n 3 - Excluir\n 4 - Ler\n 0 - Sair\n");

            opcao = sc.nextInt();// Entrando valor para Opção

            //Inicio da opção de operação, Case
            switch (opcao){
                //Caso opção Incluir
                case 1:
                    Funcionario funcionario = new Funcionario();
                    //Limpa memoria
                    clearBuffer(sc);

                    System.out.println("Informe CPF: ");
                    funcionario.setCpf(sc.nextLine());

                    System.out.println("Informe o nome:");
                    funcionario.setNome(sc.nextLine());

                    System.out.println("Informe o Telefone:");
                    funcionario.setTelefone(sc.nextLine());

                    System.out.println("Infome Salario:");
                    funcionario.setSalario(sc.nextDouble());

                    //Limpa memoria
                    clearBuffer(sc);

                    System.out.println("Informe Pis:");
                    funcionario.setPis(sc.nextLine());

                    System.out.println("\n\n--------------------------\n" +
                            "Funcionário: " + funcionario.getNome() + "\nCPF: " + funcionario.getCpf() +
                            "\nFone: " + funcionario.getTelefone() + "\nN° Pis: " + funcionario.getPis() +
                            "\nSalario: " + funcionario.getSalario() );

                    FuncionarioCrud funcionarioCrudIncluir = new FuncionarioCrud();
                    funcionarioCrudIncluir.incluir();

                    break;

                //Caso opção Alterar
                case 2:
                    FuncionarioCrud funcionarioCrudAlterar = new FuncionarioCrud();
                    funcionarioCrudAlterar.alterar();
                    break;

                //Caso opção Exluir
                case 3:
                    FuncionarioCrud funcionarioCrudExcluir = new FuncionarioCrud();
                    funcionarioCrudExcluir.excluir();
                    break;

                //Caso Opção Ler
                case 4:
                    FuncionarioCrud funcionarioCrudLer = new FuncionarioCrud();
                    funcionarioCrudLer.ler();
                    break;

                //Caso Opção Sair
                case 0:

                    break;

                default:
                    System.out.println("Opção Inválida...");
                    break;

            }// fim  do switch case

        } while (opcao != 0);

    }// fim Contrutor Funcionario

    // implementando limpar Buffer
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

}//fim tela cadastro funcionário
