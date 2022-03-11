package Exercicio1Veiculos;

public class Veiculo {

    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private float km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;
    private double preco;

    //Métodos --------------------------------------------

    public void acelerar(){
        this.velocidade += 20;
    }

    public void abastecer(int valorAbastecido){
        if (this.litrosCombustivel + valorAbastecido <= 60){
            this.litrosCombustivel += valorAbastecido;
        } else {
            System.out.println("Limite do tanque ultrapassado, o abastecimento não foi concluido.");
        }
    }

    public void frear(){
        if(this.velocidade > 0){
            this.velocidade -= 20;
        } else {
            System.out.println("O Veiculo já está parado");
        }
    }

    public void pintar(String novaCorDoVeiculo){
        this.cor = novaCorDoVeiculo;
    }

    public void ligar(){
        if(!isLigado){
            System.out.println("O veiculo foi ligado!");
            isLigado = true;
        } else {
            System.out.println("O veiculo já está ligado");
        }
    }

    public void desligar(){
        if(isLigado){
            if(velocidade > 0){
            System.out.println("Não é possível desligar o veiculo em movimento!");
            } else {
                System.out.println("O Veiculo foi desligado");
                isLigado = false;
            }
        } else {
            System.out.println("O veiculo já está desligado");
        }
    }



    //Getter e Setter ------------------------------------

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

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        if(litrosCombustivel > 60){
            System.out.println("Impossivel abastecer mais que 60 litros");
        } else {
        this.litrosCombustivel = litrosCombustivel;

        }
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
