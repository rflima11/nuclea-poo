package tech.ada.nuclea.aula05;

public class TesteAnimal {

    public static void main(String[] args) {
/*      Animal animal = new Animal();
        animal.andar();
        animal.emitirSom();*/
//      Cachorro cachorro = new Cachorro(4, true, false, true);

        Animal animal = new Cachorro(4, true, false, true);

        Animal animal2 = new Gato(4, true, false, "Siamês");

        animal.emitirSom();

        animal2.emitirSom();

        System.out.println(animal);

        // CAST
        ((Cachorro) animal).cavar();

/*
        cachorro.andar();
        cachorro.emitirSom();
        cachorro.cavar();
*/
        Gato gato = new Gato(4, true, false, "Siamês");

/*      gato.andar();
        gato.emitirSom();*/

    }

}
