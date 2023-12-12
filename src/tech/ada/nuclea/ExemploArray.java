package tech.ada.nuclea;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ExemploArray {

    public static void main(String[] args) {

        Ator ator1 = new Ator("Mark Hammil");
        Ator ator2 = new Ator("Harrison Ford");

        ArrayList<Ator> elenco = new ArrayList<>();

        elenco.add(ator1);
        elenco.add(ator2);

        for(Ator ator : elenco) {
            System.out.println(ator.getNome());
        }


        Ator ator = elenco.get(0);
        ator.setNome("Mark Hammil Editado");


        for(Ator ator3 : elenco) {
            System.out.println(ator2.getNome());
        }

    }

}
