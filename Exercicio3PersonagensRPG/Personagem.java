package Exercicio3PersonagensRPG;

public class Personagem {

    protected static int personagensCriados = 0;
    private String nome;
    protected int vida;
    protected int mana;
    protected int inteligencia;
    protected int forca;
    private int level;

    public Personagem(String nome, int vida, int mana, int inteligencia, int forca, int level) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.level = level;
        personagensCriados++;
        System.out.println("Um personagem foi criado, no total temos: " + this.getPersonagensCriados() + " personagens criados até momento" );


    }

    public void lvlup(int level){

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getPersonagensCriados() {
        return personagensCriados;
    }
}
