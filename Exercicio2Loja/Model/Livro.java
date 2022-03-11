package Exercicio2Loja.Model;

import Exercicio2Loja.Interfaces.Imposto;

public class Livro extends Produto implements Imposto {

    String autor;
    String tema;
    int qntPag;

    public Livro() {
    }

    public Livro(String nome, double preco, int qtd, String autor, String tema, int qntPag) {
        super(nome, preco, qtd);
        this.autor = autor;
        this.tema = tema;
        this.qntPag = qntPag;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public int getQntPag() {
        return qntPag;
    }

    public void setQntPag(int qntPag) {
        this.qntPag = qntPag;
    }

    @Override
    public double calculaImposto() {
        if (this.tema.contains("educativo")){
            System.out.println("Livro Educativo não tem imposto: " + this.getNome());
            return 0;
        } else {
            double imposto = super.getPreco() * 0.1;
            System.out.println("R$ " + imposto +" de impostos sobre o livro " + this.getNome() + ".");
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Livro{" +
                "autor='" + autor + '\'' +
                ", tema='" + tema + '\'' +
                ", qntPag=" + qntPag +
                '}';
    }
}
