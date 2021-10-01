package controle;

import dominio.Funcionario;

public class ControlaFuncionario {
    private Funcionario funcionario = new Funcionario(null, 0);

    public void incluirFuncionario(String nome, Float salario) { 
		funcionario.setNome(nome);
		funcionario.setSalario(salario);
	}

    public void exibeFuncionario(){
        System.out.println("===================================");
        System.out.println("Funcionario cadastrado: "+ funcionario.getNome());
        System.out.println("Salário: R$ "+ funcionario.getSalario());
    }
}
