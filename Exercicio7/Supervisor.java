package Exercicio7;

public class Supervisor extends Funcionario{

    @Override
    public double bonificacao() {
        return salario + 5000;
    }
}
