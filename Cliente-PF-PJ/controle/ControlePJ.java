package controle;

import dominio.PessoaJuridica;

public class ControlePJ {
	private PessoaJuridica pj = new PessoaJuridica(null, null, null, null);
	
	public void incluirPessoaJuridica(String endereco, String telefone, String cnpj, String razaoSocial) { 
		pj.setEndereco(endereco);
		pj.setTelefone(telefone);
		pj.setCnpj(cnpj);
		pj.setRazaoSocial(razaoSocial);
	}

    public void exibePJ(){
        System.out.println("===================================");
        System.out.println("Razão Social cadastrado: "+ pj.getRazaoSocial());
        System.out.println("CNPJ cadastrado: "+ pj.getCnpj());
    }
}