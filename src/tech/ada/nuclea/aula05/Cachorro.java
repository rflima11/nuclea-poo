package tech.ada.nuclea.aula05;

import java.util.Objects;

public class Cachorro extends Animal {

    private boolean isGuarda;

    public Cachorro(int numeroDePatas,
                    boolean isPeludo,
                    boolean seVoa,
                    boolean isGuarda) {
        super(numeroDePatas, isPeludo, seVoa);
        this.isGuarda = isGuarda;
    }

    @Override
    public String toString() {
        return "Essa instância é um cachorro";
    }

    @Override
    public void emitirSom() {
        System.out.println("AU AU");
    }

    public void emitirSom(String tipoDeSom) {
        if (tipoDeSom.equals("Triste")) {
            System.out.println("CAIN CAIN");
        }
    }

    public String emitirSom(int numero) {
        return "";
    }

    public void cavar() {
        System.out.println("Cachorro está cavando");
    }
}
