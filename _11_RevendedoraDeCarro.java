package faccat;

import java.util.Scanner;

public class _11_RevendedoraDeCarro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do funcion�rio: ");
		String nome = sc.nextLine();

		System.out.println("Digite o sal�rio fixo de " + nome + ": R$");
		float salario = sc.nextFloat();

		System.out.println("Digite o total de ve�culos vendidos pelo "+ nome +":");
		byte ncarros = sc.nextByte();
		
		System.out.println("Digite a comiss�o por ve�culo vendido: R$");
		float comissao = sc.nextFloat();
		
		System.out.println("Digite o valor total de vendas efetuadas por " + nome + ":");
		float valordevendas = sc.nextFloat();
		
		float salarioFinal = salario + (ncarros * comissao)+ (valordevendas * 5 / 100);
		
		System.out.println("Sal�rio final de " + nome + ", ser� de: R$" + salarioFinal); 
		
		sc.close();

	}

}
