package controle;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o endereço: ");
		String endereco = leia.nextLine();
		System.out.print("Digite o telefone: ");
		String telefone = leia.nextLine();
		System.out.print("Digite 1 para PF e 2 para PJ: ");
		int opcao = leia.nextInt();
		
		
		switch (opcao) {
			case 1:
				System.out.println("PESSOA FÍSICA");
				System.out.print("Digite o CPF: ");
				String cpf = leia.next();
				System.out.print("Digite o nome: ");
				String nome = leia.next();
				
    			ControlePF contPf = new ControlePF();
				
				contPf.incluirPessoaFisica(endereco, telefone, cpf, nome);
                contPf.exibePF(); //exibe nome e CPF da pessoa cadastrada
				break;
			case 2:
				System.out.println("PESSOA JURÍDICA");
				System.out.print("Digite o CNPJ: ");
				String cnpj = leia.next();
				System.out.print("Digite a Razão Social: ");
				String razaoSocial = leia.next();
				
				ControlePJ contPj = new ControlePJ();
				
				contPj.incluirPessoaJuridica(endereco, telefone, cnpj, razaoSocial);
                contPj.exibePJ(); //exibe razão social e CNPJ cadastrado
				break;
			default:
				System.out.println("Opção Inválida");
            
            leia.close();
		}
	}
}
