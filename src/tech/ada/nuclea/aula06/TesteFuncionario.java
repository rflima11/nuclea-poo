package tech.ada.nuclea.aula06;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TesteFuncionario {


    public static void main(String[] args) {

        Funcionario dev = new Desenvolvedor("Oliver",
                LocalDate.of(1973,6,22),
                5000.00);

        Funcionario gerente = new Gerente("Arthur",
                LocalDate.of(1967, 6, 23), 4000.00);

        System.out.println(dev.calcularBonus());

        System.out.println(gerente.calcularBonus());

    }
}
