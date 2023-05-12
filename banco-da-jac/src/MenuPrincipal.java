import java.util.Scanner;

public class MenuPrincipal {

    public static void main(String[] args) {

        menuPrincipal();

    }

    public static void menuPrincipal(){
        Scanner scn = new Scanner(System.in);
        String opcao = "0";

        System.out.println("##############################################");
        System.out.println("\n");
        System.out.println("Menu Principal");
        System.out.println("0 - Saldo");
        System.out.println("1 - Enviar");
        System.out.println("2 - Receber");
        System.out.println("9 - Encerrar");


        System.out.printf("Escolha uma opção: ");
        opcao = scn.next();
        // valida opção caractere inválido
        if (opcao.equals("9")){
            return;
        }
        if (opcao.equals("0") || opcao.equals("1") || opcao.equals("2")){
            System.out.println("opção válida!!!" + opcao);
            menuPrincipal();
        }else{
            System.out.println("ERRO - OPÇÃO INVÁLIDA !!!");
            menuPrincipal();
        }
    }
}