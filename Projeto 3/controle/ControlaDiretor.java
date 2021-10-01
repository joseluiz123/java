package controle;

import dominio.Diretor;

public class ControlaDiretor {
    private Diretor diretor = new Diretor(null, 0, 0);
    
    public void incluirDiretor(String nome, Float salario, Float bonificacao) { 
		diretor.setNome(nome);
        diretor.setBonificacao(bonificacao);
		diretor.setSalario(salario + bonificacao);
	}

    public void exibeDiretor(){
        System.out.println("===================================");
        System.out.println("Diretor cadastrado: "+ diretor.getNome());
        System.out.println("Bonificação: R$ "+ diretor.getBonificacao());
        System.out.println("Salário Total: R$ "+ diretor.getSalario());
    }
}
