package tech.ada.nuclea.aula05;

public class Gato extends Animal {

    private String raca;

    public Gato(int numeroDePatas,
                boolean isPeludo,
                boolean seVoa,
                String raca) {
        super(numeroDePatas, isPeludo, seVoa);
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println("MIAU");
    }

}
