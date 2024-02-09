package br.edu.ifba.saj.fwads.model;

public class Carro {
    private String modelo;
    private String marca;
    private Int passageiro;
    private Int. Ano;

    public Carro(String modelo, String marca, Int passageiro, Int ano) {
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

    public Int getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Int Passageiro) {
        this.passageiro = passageiro;
    }

    public Int getAno() {
        return ano;
    }

    public void setAno(Int Ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Carro [modelo=" + modelo + ", marca=" + marca + ", passageiro=" + passageiro + ", ano=" + ano + "]";
    }
}
