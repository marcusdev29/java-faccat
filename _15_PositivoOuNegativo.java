package faccat;

import java.util.Scanner;

public class _15_PositivoOuNegativo {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor: ");
		int numero = sc.nextInt();

		if (numero < 0) {
			System.out.println(numero + " � negativo.");
			
		} else {
			System.out.println(numero + " � positivo.");
			
		}


		sc.close();
	}
	
}
