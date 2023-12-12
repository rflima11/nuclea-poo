import tech.ada.nuclea.Ator;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TesteFilme {

    public static void main(String[] args) {
        Diretor diretor = new Diretor("Georg Lucas");

        Ator ator1 = new Ator("Mark Hammil");
        Ator ator2 = new Ator("Harrison Ford");

        ArrayList<Ator> elenco = new ArrayList<>();

        elenco.add(ator1);
        elenco.add(ator2);


        Filme filme = new Filme("Star Wars", diretor, elenco);

    }
}
