package faccat;

import java.util.Scanner;

public class _42_Aposentadoria {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu c�digo como empregado: ");
		 short codigo = sc.nextShort();
		
		System.out.println("Informe o ano em que nasceu: ");
		short anoNascimento = sc.nextShort();
		System.out.println("Informe o ano atual: ");
		short anoAtual = sc.nextShort();
		System.out.println("Ano que foi contratado nessa empresa: ");
		short anosTrabalhados = sc.nextShort();
		
		int idade = anoAtual - anoNascimento;
		
		int tempoTrabalhado = anoAtual - anosTrabalhados;
		
		if (idade >= 60 && tempoTrabalhado >= 25) {
			System.out.println("O funcion�rio "+codigo+" pode requerer sua aposentadoria");
		} else {
			System.out.println("O funcion�rio "+codigo+" n�o pode requerer sua aposentadoria");
		}
		sc.close();
	}

}
