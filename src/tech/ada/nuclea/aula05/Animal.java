package tech.ada.nuclea.aula05;

public class Animal {

    private int numeroDePatas;
    private boolean isPeludo;
    private boolean seVoa;

    public Animal() {
        System.out.println("Chamando o construtor da classe animal!");
    }

    public Animal(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public Animal(int numeroDePatas,
                  boolean isPeludo,
                  boolean seVoa) {
        this.numeroDePatas = numeroDePatas;
        this.isPeludo = isPeludo;
        this.seVoa = seVoa;
    }

    public void emitirSom() {
        System.out.println("Animal emitindo som!");
    }

    public void andar() {
        System.out.println("Animal está andando");
    }

}
