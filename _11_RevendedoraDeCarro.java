package faccat;

import java.util.Scanner;

public class _11_RevendedoraDeCarro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do funcionário: ");
		String nome = sc.nextLine();

		System.out.println("Digite o salário fixo de " + nome + ": R$");
		float salario = sc.nextFloat();

		System.out.println("Digite o total de veículos vendidos pelo "+ nome +":");
		byte ncarros = sc.nextByte();
		
		System.out.println("Digite a comissão por veículo vendido: R$");
		float comissao = sc.nextFloat();
		
		System.out.println("Digite o valor total de vendas efetuadas por " + nome + ":");
		float valordevendas = sc.nextFloat();
		
		float salarioFinal = salario + (ncarros * comissao)+ (valordevendas * 5 / 100);
		
		System.out.println("Salário final de " + nome + ", será de: R$" + salarioFinal); 
		
		sc.close();

	}

}
