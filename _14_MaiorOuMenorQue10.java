package faccat;

import java.util.Scanner;

public class _14_MaiorOuMenorQue10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número inteiro: ");
		byte numero = sc.nextByte();

		if (numero < 10) {
			System.out.println(numero + " é menor que 10!");
			
		} else if (numero == 10) {
			System.out.println(numero + " é igual a 10!");
			
		} else {
			System.out.println(numero + " é maior que 10!");
		}

		sc.close();
	}

}
