package Exercicio3PersonagensRPG;

import java.util.List;
import java.util.Random;

public class Mago extends Personagem {

    private List<String> Magia;

    public Mago(String nome, int vida, int mana, int inteligencia, int forca, int level) {
        super(nome, vida, mana, inteligencia, forca, level);
    }


    @Override
    public void lvlup(int level) {
        this.inteligencia += 5 + level;
        this.mana += 50 + level;
    }



    public double attack(){
        Random random = new Random();
        double aleatorio = random.nextInt(300 - 0);
        double danoCausado = (this.getInteligencia() * this.getLevel()) + aleatorio;
        return danoCausado;

    }

    public void aprenderMagia(String novaMagia){

    }


}
