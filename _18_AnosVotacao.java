package faccat;

import java.util.Scanner;

public class _18_AnosVotacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o ano em que nasceu: ");
		int anoNasc = sc.nextInt();
		
		System.out.println("Digite o ano atual: ");
		int anoAtual = sc.nextInt();

		int idade = anoAtual - anoNasc;
		
		if ((idade >= 16) && (idade < 18)) {
			System.out.println(idade + " anos. Pode votar porem � opcional");
			
		} else if (idade >= 18){
			System.out.println(idade + " anos. Voto obrigat�rio");
			
		} else {
			System.out.println(idade + " anos. N�o pode votar ainda.");
			
		}


		sc.close();
	}
	
}
