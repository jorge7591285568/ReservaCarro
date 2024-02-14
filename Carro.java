

public class Carro {

    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private Double diaria;
    private Boolean disponivel;
    private int passageiro;

    public Carro(String placa, String marca, String modelo, int ano, String cor, Double diaria, Boolean disponivel,
            int passageiro) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.diaria = diaria;
        this.disponivel = disponivel;
        this.passageiro = passageiro;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getDiaria() {
        return diaria;
    }

    public void setDiaria(Double diaria) {
        this.diaria = diaria;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(int passageiro) {
        this.passageiro = passageiro;
    }

    @Override
    public String toString() {
        return "Carro [placa=" + placa + ", marca=" + marca + ", modelo=" + modelo + ", ano=" + ano + ", cor=" + cor
                + ", diaria=" + diaria + ", disponivel=" + disponivel + ", passageiro=" + passageiro +"]";
    }

}

