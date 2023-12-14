package tech.ada.nuclea.aula06.resolucaoexec;

public class TestePagamento {

    public static void main(String[] args) {

        Pagamento pagamentoGenerico = new Pagamento(20.00);

        Pagamento pagamentoBoletoLuz = new PagamentoBoleto(150.00, false);

        Pagamento pagamentoCartao = new PagamentoCartao(1500.00);

        System.out.println(pagamentoGenerico.calcularPagamento());

        System.out.println(pagamentoCartao.calcularPagamento());

        System.out.println(pagamentoBoletoLuz.calcularPagamento());

    }
}
