package Exercicio456Pessoas;

import java.util.*;

public class testaPessoa {
    public static void main(String[] args) {

        Pessoa joao = new Pessoa("João", 15);
        Pessoa leandro = new Pessoa("Leandro", 21);
        Pessoa paulo = new Pessoa("Paulo", 17);
        Pessoa jessica = new Pessoa("Jessica", 18);

        ArrayList<Pessoa> pessoasListadas = new ArrayList<>();
        pessoasListadas.add(joao);
        pessoasListadas.add(leandro);
        pessoasListadas.add(paulo);
        pessoasListadas.add(jessica);


        System.out.println("\n\n---- Lista Original / Exercicio 4 ----");
        System.out.println(pessoasListadas);

        Pessoa maiorIdade = pessoasListadas.stream().max(Comparator.comparing(Pessoa::getIdade)).get();
        System.out.println("\n\n---- Maior Idade / Exercicio 4 ----");
        System.out.println(maiorIdade);

        ArrayList<Pessoa> pessoas18menos = new ArrayList<>();
        for (Pessoa pessoa : pessoasListadas) {
            if (pessoa.getIdade() >= 18) {
                pessoas18menos.add(pessoa);
            }
        }

        System.out.println("\n\n---- Removendo pessoas de idade <= 18 Anos / Exercicio 5 ----");
        System.out.println(pessoas18menos);



        System.out.println("\n\n---- Contém o nome Especificado / Exercicio 6 ----");
        String nomePesquisado = "Jessica";
        boolean contemJessica = pessoasListadas.stream().anyMatch(o -> o.getNome().equals(nomePesquisado));

        if (contemJessica) {
            System.out.println("Sim o nome " + nomePesquisado + " está presente na lista");

        } else {
            System.out.println("Não! O nome " + nomePesquisado + " não foi encontrado na lista");
        }




    }


}

