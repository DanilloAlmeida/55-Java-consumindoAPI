package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String busca;

        System.out.println("Digite um filme para busca");
        busca = leitura.nextLine();

        String endereco = "https://www.omdbapi.com/?t=" +busca+ "&apikey=736218fb";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println("\n\n---------->>>   imprimimdo json");
            System.out.println(json);

//        Gson gson = new Gson(); //dessa forma não reconhece variáveis com letra maiúscula
            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
//        Titulo meuTitulo = gson.fromJson(json, Titulo.class);

            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println("\n---------->>>   imprimimdo meuTituloOmdb");
            System.out.println(meuTituloOmdb);

            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("\n---------->>>   imprimimdo meuTitulo");
            System.out.println(meuTitulo);
        }catch (NumberFormatException e){
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("Argumento inválido");
        }


        System.out.println("\n<<< fim normal >>>");
    }
}
