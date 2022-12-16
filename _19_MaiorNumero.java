package faccat;

import java.util.Scanner;

public class _19_MaiorNumero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int n1 = sc.nextInt();
		
		System.out.println("Digite outro número: ");
		int n2 = sc.nextInt();

		if (n1 > n2) {
			System.out.println(n1 + " é maior que " + n2);
			
		} else if (n2 > n1) {
			System.out.println(n2 + " é maior que " + n1);
						
		} else {
			System.out.println("Os números são iguais.");
			
		}


		sc.close();
	}
}
