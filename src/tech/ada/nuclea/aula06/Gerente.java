package tech.ada.nuclea.aula06;

import java.time.LocalDate;

public class Gerente extends Funcionario {

    public Gerente(String nome,
                   LocalDate dataNascimento,
                   Double salario) {
        super(nome, dataNascimento, salario);
    }

    @Override
    public Double calcularBonus() {
        return getSalario() * 3;
    }

}
