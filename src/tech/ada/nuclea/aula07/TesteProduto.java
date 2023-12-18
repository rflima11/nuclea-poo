package tech.ada.nuclea.aula07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteProduto {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Televisao Samsung", 3000.00);

        Produto produto2 = new Produto("Celular", 2000.00);

        Produto produto3 = new Produto("Guarda-roupa", 1000.00);

        List<Produto> produtoList = new ArrayList<>();
        produtoList.add(produto1);
        produtoList.add(produto2);
        produtoList.add(produto3);

        Collections.sort(produtoList);

        for (Produto p: produtoList) {
            System.out.println("Produto: " + p.getNome() + " preço: " + p.getPreco());
        }


    }
}
