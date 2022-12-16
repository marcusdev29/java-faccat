package faccat;

import java.util.Scanner;

public class _13_MediaPonderada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do aluno: ");
		String nome = sc.nextLine();

		System.out.println("Digite a nota com peso 2: ");
		float peso2 = sc.nextFloat();

		System.out.println("Digite a note com peso 3:");
		float peso3 = sc.nextFloat();

		System.out.println("Digite a nota com peso 5: ");
		float peso5 = sc.nextFloat();

		float notafinal = (peso2 * 2 + peso3 * 3 + peso5 * 5) / 10;

		System.out.println("Nota final de " + nome + ", será de: " + notafinal);

		sc.close();
	}

}
