package tech.ada.nuclea.scanner;

import java.util.Scanner;

public class TestePessoa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, informe o nome: ");
        String nome = scanner.nextLine();

        System.out.println("Por favor, informa a idade");
        int idade = scanner.nextInt();

        Pessoa pessoa = new Pessoa(nome, idade);

        scanner.close();


    }
}
