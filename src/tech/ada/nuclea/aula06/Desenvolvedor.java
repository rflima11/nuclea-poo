package tech.ada.nuclea.aula06;

import java.time.LocalDate;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome,
                         LocalDate dataNascimento,
                         Double salario) {
        super(nome, dataNascimento, salario);
    }

    @Override
    public Double calcularBonus() {
        return getSalario() * 4;
    }


}
