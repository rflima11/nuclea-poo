package tech.ada.nuclea.scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TesteLista {


    //Stream
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> listaNomes = new ArrayList<>();

        listaNomes.add("Carlos César");
        listaNomes.add("olga");
        listaNomes.add("Rodolfo");
        listaNomes.add("Rodrigo");
        listaNomes.add("Patricia");

/*
        String retornoFiltro = listaNomes.stream().filter(nome -> {
            return nome.contains("ol");
        }).findAny().orElse(null);
*/

        String nomeFiltrado = scan.nextLine();
        List<String> nomesQueTemOl = listaNomes.stream().filter(nome -> {
            return nome.toLowerCase().startsWith(nomeFiltrado.toLowerCase());
        }).collect(Collectors.toList());

        System.out.println(nomesQueTemOl);

    }
}
