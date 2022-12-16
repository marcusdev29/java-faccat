package faccat;

import java.util.Scanner;

public class _22_HoraExtra {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o salário por hora do funcionário: ");
		float salario = sc.nextFloat();

		System.out.println("Digite o total de horas trabalhadas no mês: ");
		float horas = sc.nextFloat();

		float extras = horas - 160;
		System.out.println("Hora extra: " + extras + "horas.");

		if (extras > 0) {
			float salarioExtra = extras * (salario + salario * 50 / 100);
			System.out.println("Salario extra: R$" + salarioExtra);

			float salarioFinal = (salario * (horas - extras)) + salarioExtra;
			System.out.println("O salário final é de: R$" + salarioFinal);

		} else {
			float salarioFinal = horas * salario;
			System.out.println("O salário final de é de: R$" + salarioFinal);

		}

		sc.close();
	}

}
