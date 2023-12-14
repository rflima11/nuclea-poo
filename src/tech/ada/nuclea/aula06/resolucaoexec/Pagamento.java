package tech.ada.nuclea.aula06.resolucaoexec;

public class Pagamento {

    protected Double valor;

    public Pagamento(Double valor) {
        this.valor = valor;
    }

    public String calcularPagamento() {
        return "Pagamento efetuado, valor: " + valor;
    }

    public Double getValor() {
        return valor;
    }


}



