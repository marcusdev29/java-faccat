package faccat;

import java.util.Scanner;

public class _16_Macas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de ma�as a ser comprada: ");
		int macas = sc.nextInt();

		if (macas < 12) {
			double valorfinal = macas * 1.30;
			System.out.println("O valor final das ma�as ser� de: " + valorfinal);
			
		} else {
			double valorfinal = macas * 1.00;
			System.out.println("O valor final das ma�as ser� de: " + valorfinal);
			
		}


		sc.close();
	}
	
}
