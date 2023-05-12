package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {

    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(10);

        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(5);

        Serie lost = new Serie("Lost", 2000);
        lost.avalia(2);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item:lista) {
            System.out.println(item.getNome());
//            if (item instanceof Filme )
            if (item instanceof Filme filme){
                System.out.println("Classificação: "+filme.getClassificacao());
            }
        }
        System.out.println("==================================================== TESTANDO ORDENAÇÃO ==================");
        ArrayList<String> buscarPorArtista = new ArrayList<>();
        buscarPorArtista.add("Adam Sandler");
        buscarPorArtista.add("Paulo");
        buscarPorArtista.add("Jacqueline");

        System.out.println(buscarPorArtista);
        Collections.sort(buscarPorArtista);
        System.out.println("---------------->> depois do Collections.sort ");
        System.out.println(buscarPorArtista);

        System.out.println("----------------->> lista ANTES do Collections.sort ");
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println("----------------->> lista DEPOIS do Collections.sort ");
        System.out.println(lista);
        System.out.println("----------------->> lista DEPOIS do Comparator.compating ");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);

    }
}
