package Exercicio2Loja.Model;

import java.util.ArrayList;
import java.util.List;

public class Loja {

    private String nome;
    private String cnpj;

    List<Livro> livros;
    List<VideoGame> videoGames;

    public Loja() {
    }

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    public void listaLivros() {
        if (livros.isEmpty()) {
            System.out.println("A loja não tem livro no seu estoque");
        } else {
            System.out.println("A lojas americanas possui estes livros para venda:");
            for (Livro l : livros) {
                System.out.println("Titulo: " + l.getNome() + ", " + "preço: " + l.getPreco() + ", " + "quantidade: " + l.getQtd() + " em estoque.");
            }
        }
    }

    public void listaVideoGames() {
        if (videoGames.isEmpty()) {
            System.out.println("A loja não tem video-games no seu estoque");
        } else {
            System.out.println("A lojas americanas possui estes videogames para venda:");
            for (VideoGame v : videoGames) {
                System.out.println("Video-game: " + v.getNome() + ", " + "preço: " + v.getPreco() + ", " + "quantidade: " + v.getQtd() + " em estoque.");
            }
        }
    }

    public void calculaPatrimonio() {

        ArrayList<Double> arrayVG = new ArrayList<>();
        for (VideoGame vg : videoGames) {
            double res = vg.getQtd() * vg.getPreco();
            arrayVG.add(res);
            //System.out.println(arrayVG);
        }

        ArrayList<Double> arrayLV = new ArrayList<>();
        for (Livro lv : livros) {
            double res = lv.getQtd() * lv.getPreco();
            arrayLV.add(res);
            //System.out.println(arrayLV);
        }

        //System.out.println(arrayVG);
        double totalVideogame = arrayVG.get(0)+arrayVG.get(1)+arrayVG.get(2);
        double totalLivros = arrayLV.get(0)+arrayLV.get(1)+arrayLV.get(2);
        double totalGeral = totalLivros + totalVideogame;
        System.out.println("O patrimonio da loja: " + this.getNome() + " é de R$" + totalGeral);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<VideoGame> getVideoGames() {
        return videoGames;
    }

    public void setVideoGames(List<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }

    @Override
    public String toString() {
        return "Loja{" +
                "nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", livros=" + livros +
                ", videoGames=" + videoGames +
                '}';
    }
}
