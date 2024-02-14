public class Reserva {
    private Cliente cliente;
    private Carro carro;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private double valorTotal;

    

    public Reserva(Cliente cliente, Carro carro, LocalDate dataInicio, LocalDate dataFim, double valorTotal) {
        this.cliente = cliente;
        this.carro = carro;
        dataInicio = dataInicio;
        dataFim = dataFim;
        this.valorTotal = valorTotal;
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        dataFim = dataFim;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }


    @Override
    public String toString() {
        return "Reserva [cliente=" + cliente + ", carro=" + carro + ", dataInicio=" + dataInicio + ", dataFim="
                + dataFim + ", valorTotal=" + valorTotal + "]";
    }


}

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
        result = prime * result + ((marca == null) ? 0 : marca.hashCode());
        result = prime * result + ((passageiro == null) ? 0 : passageiro.hashCode());
        result = prime * result + ((ano == null) ? 0 : ano.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Carro other = (Carro) obj;
        if (marca == null) {
            if (other.marca != null)
                return false;
        } else if (!modelo.equals(other.modelo))
            return false;
        if (passageiro == null) {
            if (other.passageirol != null)
                return false;
        } else if (!passageiro.equals(other.passageiro))
            return false;
        if (ano == null) {
            if (other.ano != null)
                return false;
        } else if (!ano.equals(other.ano))
            return false;
        return true;
    }
