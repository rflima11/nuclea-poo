package tech.ada.nuclea.aula06.resolucaoexec;

public class PagamentoCartao extends Pagamento {
    public Double valor;

    public PagamentoCartao(Double valor) {
        super(valor);

    //   super.valor = this.valor;
    }

    @Override
    public String calcularPagamento() {
        return "Pago no cartão de crédito, valor: " + valor;
    }
}
