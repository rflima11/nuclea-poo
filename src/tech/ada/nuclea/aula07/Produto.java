package tech.ada.nuclea.aula07;

public class Produto implements Comparable<Produto> {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    @Override
    public int compareTo(Produto produto) {
        //comparar o produto que chega como parâmetro com a instância atual.
        int resultado = 0;

        if (preco > produto.getPreco())
            resultado = 1;
        if (preco < produto.getPreco())
            resultado = -1;
        if (preco == produto.getPreco())
            resultado = 0;

        return resultado;
    }
}
