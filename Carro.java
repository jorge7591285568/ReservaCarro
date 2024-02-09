public class Carro {
    private String modelo;
    private String marca;
    private int passageiro;
    private int ano;

    public Carro(String modelo, String marca, int passageiro, int ano) {
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

