package controle;
import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o nome do funcionário: ");
		String nome = leia.nextLine();
		System.out.print("Digite o salário: ");
		Float salario = leia.nextFloat();

		System.out.print("Digite 1 para Funcionário e 2 para Vendedor: ");
		int opcao = leia.nextInt();
		
		switch (opcao) {
			case 1:
    			ControlaFuncionario contFunc = new ControlaFuncionario();
				
				contFunc.incluirFuncionario(nome, salario);
                contFunc.exibeFuncionario(); //exibe nome e salário do funcionário cadastrada
				break;
			case 2:
				System.out.println("VENDEDOR");
				System.out.print("Digite o valor da comissão: ");
				Float comissao = leia.nextFloat();
				
				ControlaVendedor contVend = new ControlaVendedor();
				
				contVend.incluirVendedor(nome, salario, comissao);
                contVend.exibeVendedor(); //exibe vendedor e salário com comissão
				break;
			default:
				System.out.println("Opção Inválida");
            
            leia.close();
		}
	}
}
