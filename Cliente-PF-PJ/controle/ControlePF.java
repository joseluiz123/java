package controle;

import dominio.PessoaFisica;

public class ControlePF {
	private PessoaFisica pf = new PessoaFisica(null, null, null, null);
	
	public void incluirPessoaFisica(String endereco, String telefone, String cpf, String nome) {
		pf.setEndereco(endereco);
		pf.setTelefone(telefone);
		pf.setCpf(cpf);
		pf.setNome(nome);
	}

    public void exibePF(){
        System.out.println("===================================");
        System.out.println("Nome cadastrado: "+ pf.getNome());
        System.out.println("CPF cadastrado: "+ pf.getCpf());
    }
}
