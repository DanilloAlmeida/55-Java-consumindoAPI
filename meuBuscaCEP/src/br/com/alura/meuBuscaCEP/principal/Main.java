package br.com.alura.meuBuscaCEP.principal;

import br.com.alura.meuBuscaCEP.fabrica.GeradorDeArquivos;
import br.com.alura.meuBuscaCEP.modelos.ConsultaCep;
import br.com.alura.meuBuscaCEP.modelos.Endereco;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();
        Endereco novoEndereco;

        System.out.println("Digite o CEP: ");
        String cepEntrada = leitura.nextLine();

        try {
//            novoEndereco = consultaCep.buscaEndereco("01");
//            novoEndereco = consultaCep.buscaEndereco("01001000");
            novoEndereco = consultaCep.buscaEndereco(cepEntrada);
            System.out.println(novoEndereco);
            GeradorDeArquivos gerador = new GeradorDeArquivos();
            gerador.salvaJson(novoEndereco);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("\n\n-------->>>> fim normal");
    }
}