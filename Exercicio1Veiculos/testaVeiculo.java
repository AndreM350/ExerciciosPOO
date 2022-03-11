package Exercicio1Veiculos;

public class testaVeiculo {
    public static void main(String[] args) {

        Veiculo carro1 = new Veiculo();

        System.out.println("------------------------- Abastecimento -------------------------");
        carro1.setLitrosCombustivel(55);
        System.out.println("Tanque atual: " + carro1.getLitrosCombustivel());
        carro1.abastecer(5);
        System.out.println("Tanque atual: " + carro1.getLitrosCombustivel());
        carro1.abastecer(5);
        System.out.println("Tanque atual: " + carro1.getLitrosCombustivel());




        System.out.println("------------------------- Acelerar/Frear -------------------------");
        carro1.acelerar(); //20
        carro1.acelerar(); //40
        System.out.println("A valocidade atual é: "+carro1.getVelocidade());

        carro1.frear(); //20
        System.out.println("A valocidade atual após frenagem é: "+carro1.getVelocidade());
        carro1.frear(); //velocidade 0
        carro1.frear(); //aqui deve printar "Veiculo já está parado"
        System.out.println("A valocidade atual após frenagem é: "+carro1.getVelocidade());

        System.out.println("------------------------- Pintura -------------------------");
        carro1.setCor("Vermelho");
        System.out.println("A cor de fábrica do veiculo é: "+carro1.getCor());
        carro1.pintar("Amarelo");
        System.out.println("A nova cor do veiculo é: "+carro1.getCor());

        System.out.println("------------------------- Ligado/Desligado -------------------------");


        System.out.println("O carro está: " + carro1.isLigado()); //false = desligado
        carro1.ligar();
        System.out.println("O carro está: " + carro1.isLigado()); //true = ligado
        carro1.ligar(); //deve printar "O veiculo já está ligado"
        carro1.desligar();
        System.out.println("O carro está: " + carro1.isLigado()); //false = desligado
        carro1.desligar(); //deve printar "O veiculo já está desligado"




    }
}
