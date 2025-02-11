package com.izavasconcelos.bank.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com colecoes", 24));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        System.out.println(aulas);

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));

        System.out.println(aulas);

        System.out.println(javaColecoes.getTempoTotal());
        System.out.println(javaColecoes);

    }
}
