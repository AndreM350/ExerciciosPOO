package Exercicio7;

public class Vendedor extends Funcionario{

    @Override
    public double bonificacao() {
        return salario + 3000;
    }
}
