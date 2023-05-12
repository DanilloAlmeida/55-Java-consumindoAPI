import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Desafio {
        String nome = "Clark Kent";
        String tipoConta = "corrente";
        double saldo = 1599.99;
    public static void main(String[] args) {


        menuPrincipal();

    }

    public static void menuPrincipal(){
        Scanner scn = new Scanner(System.in);
        int opcao = 0;

        System.out.println("##############################################");
        System.out.println("\n");
        System.out.println("Menu Principal");
        System.out.println("0 - Saldo");
        System.out.println("1 - Enviar");
        System.out.println("2 - Receber");

        System.out.println("Escolha uma opção: ");
        opcao = scn.nextInt();
        if (opcao != 0 && opcao != 1 && opcao != 2) {
            System.out.println("ERRO - OPÇÃO INVÁLIDA !!!");
            menuPrincipal();
        }
    }

    public static void saldo(){
        System.out.println("##############################################");
        System.out.println("\n");
        System.out.println("\t\t\t SALDO ");
        System.out.println("\n");
        System.out.println("Nome...........: " + nome);
        System.out.println("Tipo de conta..: " + tipo);


    }
}