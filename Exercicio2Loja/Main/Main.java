package Exercicio2Loja.Main;

import Exercicio2Loja.Model.Livro;
import Exercicio2Loja.Model.Loja;
import Exercicio2Loja.Model.VideoGame;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Livro l1 = new Livro("Harry Potter",40,50,"J.K. Rowling","fantasia",300);
        Livro l2 = new Livro("Senhor dos Aneis",60,30,"J.R.R. Tolkien","fantasia",500);
        Livro l3 = new Livro("Java Poo",20,50,"GFT","educativo",300);

        VideoGame ps4 = new VideoGame("Ps4",1800,100,"Sony","Slim",false);
        VideoGame ps4Usado = new VideoGame("Ps4",1000,7,"Sony","Slim",true);
        VideoGame xbox = new VideoGame("XBOX",1500,500,"Microsoft","One",false);

        List<Livro> livros = new ArrayList<>();
        livros.add(l1);
        livros.add(l2);
        livros.add(l3);


        List<VideoGame> videoGames = new ArrayList<>();
        videoGames.add(ps4);
        videoGames.add(ps4Usado);
        videoGames.add(xbox);
        //System.out.println(videoGames);

        Loja americanas = new Loja("Americanas","12345678",livros,videoGames);

        System.out.println("---------------------------------------------------------------------------------------------");
        l2.calculaImposto();
        l3.calculaImposto();

        ps4.calculaImposto();
        ps4Usado.calculaImposto();


        System.out.println("---------------------------------------------------------------------------------------------");
        americanas.listaLivros();
        System.out.println("---------------------------------------------------------------------------------------------");
        americanas.listaVideoGames();
        System.out.println("---------------------------------------------------------------------------------------------");
        americanas.calculaPatrimonio();








    }

}
