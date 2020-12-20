package com.izavasconcelos.bank.collections;

import java.util.ArrayList;

import static java.util.Collections.*;
import static java.util.Comparator.*;

public class TestaListaDeAula {
    public static void main(String[] args) {
        Aula a1 = new Aula("Aula 2", 23);
        Aula a2 = new Aula("Aula 4", 21);
        Aula a3 = new Aula("Aula 1", 28);

        ArrayList<Aula> aulas = new ArrayList<>();

        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        System.out.println(aulas);

        sort(aulas);

        System.out.println(aulas);

        aulas.sort(comparing(Aula::getTempo));

        System.out.println(aulas);
    }
}
