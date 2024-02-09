
public class Reserva {
    private String modelo;
    private String marca;
    private int passageiro;
    private int ano;

    public Reserva(String modelo, String marca, int passageiro, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.passageiro = passageiro;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(int Passageiro) {
        this.passageiro = passageiro;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int Ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro [modelo=" + modelo + ", marca=" + marca + ", passageiro=" + passageiro + ", ano=" + ano + "]";
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
