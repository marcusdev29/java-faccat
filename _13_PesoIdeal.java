package faccat;

import java.util.Scanner;

public class _13_PesoIdeal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu sexo: ");
		System.out.println("'M para masculino e F para feminino'");
		String sexo = sc.nextLine();

		System.out.println("Digite sua altura em Cm: ");
		float altura = sc.nextFloat();
		
		System.out.println(sexo);

		if (sexo.equals("M") || sexo.equals("m")) {
			float pesoideal = (727 / 10 * altura / 100) - 58;
			System.out.println("Seu peso ideal é: " + pesoideal + "Kg");

		} else {
			float pesoideal = (621 / 10 * altura / 100) - 447 / 10;
			System.out.println("Seu peso ideal é: " + pesoideal + "Kg");

		}

		sc.close();
	}

}
