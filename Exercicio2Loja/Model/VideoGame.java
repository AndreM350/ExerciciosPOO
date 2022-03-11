package Exercicio2Loja.Model;

import Exercicio2Loja.Interfaces.Imposto;

public class VideoGame extends Produto implements Imposto {

    String marca;
    String modelo;
    boolean isUsado;

    public VideoGame() {
    }

    public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
        super(nome, preco, qtd);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
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

    public boolean isUsado() {
        return isUsado;
    }

    public void setUsado(boolean usado) {
        isUsado = usado;
    }

    @Override
    public double calculaImposto() {
        if (isUsado){
            double impostoUsado = super.getPreco() * 0.25;
            System.out.println("Imposto " + this.getNome() +" "+ this.getModelo() + " usado," + " R$ "+ impostoUsado);
            return 0;
        } else {
            double impostoNovo = super.getPreco() * 0.45;
            System.out.println("Imposto " + this.getNome() +" "+ this.getModelo() + " R$ "+impostoNovo);
            return 0;
        }
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", isUsado=" + isUsado +
                '}';
    }
}
