package faccat;

import java.util.Scanner;

public class _14_MaiorOuMenorQue10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um n�mero inteiro: ");
		byte numero = sc.nextByte();

		if (numero < 10) {
			System.out.println(numero + " � menor que 10!");
			
		} else if (numero == 10) {
			System.out.println(numero + " � igual a 10!");
			
		} else {
			System.out.println(numero + " � maior que 10!");
		}

		sc.close();
	}

}
