package tech.ada.nuclea.aula06.resolucaoexec;

public class PagamentoBoleto extends Pagamento {

    private boolean isVencido;

    public PagamentoBoleto(Double valor, boolean isVencido) {
        super(valor);
        this.isVencido = isVencido;
    }

    @Override
    public String calcularPagamento() {
        return "Pagamento efetuado com boleto, valor: " + valor;
    }
}
