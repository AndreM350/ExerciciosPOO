package Exercicio3PersonagensRPG;

import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {

    private List<String> Habilidades;

    public Guerreiro(String nome, int vida, int mana, int inteligencia, int forca, int level) {
        super(nome, vida, mana, inteligencia, forca, level);
    }


    @Override
    public void lvlup(int level) {
        this.forca += 5 + level;
        this.vida += 65 + level;
    }


    public double attack(){
        Random random = new Random();
        double aleatorio = random.nextInt(300 - 0);
        double danoCausado = (this.getForca() * this.getLevel()) + aleatorio;
        return danoCausado;


    }

    public void aprenderHabilidade(String novaHabilidade){

    }

}
