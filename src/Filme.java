import tech.ada.nuclea.Ator;

import java.util.ArrayList;

public class Filme {

    private String titulo;

    private Diretor diretor;

    private ArrayList<Ator> atores;

    public Filme(String titulo, Diretor diretor, ArrayList<Ator> atores) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.atores = atores;
    }
}
