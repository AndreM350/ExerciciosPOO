package Exercicio3PersonagensRPG;

public class TestaPersonagem {
    public static void main(String[] args) {

        Mago mago = new Mago("Gandalf",500,800,20,5,5);
        Guerreiro guerreiro = new Guerreiro("Arthas",1000,150,5,22,5);

        System.out.println("-------------------------------------");
        System.out.println("O mago " + mago.getNome() + " atacou, causando " + mago.attack() + " de dano no inimigo!");
        System.out.println("O guerreiro " + guerreiro.getNome() + " atacou, causando " + guerreiro.attack() + " de dano no inimigo!");








    }
}


