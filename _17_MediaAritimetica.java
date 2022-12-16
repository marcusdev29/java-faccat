package faccat;

import java.util.Scanner;

public class _17_MediaAritimetica {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o nome do aluno: ");
		String nome = sc.nextLine();

		System.out.println("Digite a primeira nota:");
		float nota1 = sc.nextFloat();

		System.out.println("Digite a segunda nota:");
		float nota2 = sc.nextFloat();

		float notaFinal = (nota1 + nota2) / 2;

		if (notaFinal < 6) {
			System.out.println(nome + " foi reprovado(a) com uma média de: " + notaFinal + " pontos");

		} else {
			System.out.println(nome + " foi aprovado(a) com uma média de: " + notaFinal + " pontos");

		}

		sc.close();
	}

}
