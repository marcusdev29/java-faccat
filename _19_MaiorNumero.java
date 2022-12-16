package faccat;

import java.util.Scanner;

public class _19_MaiorNumero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		int n1 = sc.nextInt();
		
		System.out.println("Digite outro n�mero: ");
		int n2 = sc.nextInt();

		if (n1 > n2) {
			System.out.println(n1 + " � maior que " + n2);
			
		} else if (n2 > n1) {
			System.out.println(n2 + " � maior que " + n1);
						
		} else {
			System.out.println("Os n�meros s�o iguais.");
			
		}


		sc.close();
	}
}
