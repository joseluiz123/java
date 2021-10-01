package controle;

import dominio.Vendedor;

public class ControlaVendedor {
    private Vendedor vendedor = new Vendedor(null, 0, 0);
    
    public void incluirVendedor(String nome, Float salario, Float comissao) { 
		vendedor.setNome(nome);
        vendedor.setComissao(comissao);
		vendedor.setSalario(salario + comissao);
	}

    public void exibeVendedor(){
        System.out.println("===================================");
        System.out.println("Vendedor cadastrado: "+ vendedor.getNome());
        System.out.println("Comissão: R$ "+ vendedor.getComissao());
        System.out.println("Salário Total: R$ "+ vendedor.getSalario());
    }
}
