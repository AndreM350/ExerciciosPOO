package Exercicio7;

public class Main {
    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        Supervisor s1 = new Supervisor();
        Vendedor v1 = new Vendedor();

        g1.setSalario(6000);
        g1.setNome("Gerente1");
        g1.setIdade(45);


        s1.setSalario(4000);
        s1.setNome("Supervisor1");
        s1.setIdade(32);

        v1.setSalario(2000);
        v1.setNome("Vendedor1");
        v1.setIdade(23);

        System.out.println("Nome: " + g1.getNome());
        System.out.println("Idade: " + g1.getIdade());
        System.out.println("Salário: " + g1.getSalario());
        System.out.println("Bonificação: " + g1.bonificacao());

        System.out.println("-------");

        System.out.println("Nome: " + s1.getNome());
        System.out.println("Idade: " + s1.getIdade());
        System.out.println("Salário: " + s1.getSalario());
        System.out.println("Bonificação: " + s1.bonificacao());

        System.out.println("-------");

        System.out.println("Nome: " + v1.getNome());
        System.out.println("Idade: " + v1.getIdade());
        System.out.println("Salário: " + v1.getSalario());
        System.out.println("Bonificação: " + v1.bonificacao());



    }
}
