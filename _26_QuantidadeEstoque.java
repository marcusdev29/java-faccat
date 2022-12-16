package faccat;

import java.util.Scanner;

public class _26_QuantidadeEstoque {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o nome do produto: ");
		String produto = sc.nextLine();
		System.out.println("Informe a quantidade atual deste produto no estoque: ");
		short qAtual = sc.nextShort();
		System.out.println("Qual a quantidade m�xima que este produto pode ter: ");
		short qMaxima = sc.nextShort();
		System.out.println("Qual a quantidade m�nima que se deve considerar deste produto: ");
		short qMinima = sc.nextShort();
		int qMedia = (qMaxima+qMinima)/2;
		if (qAtual>=qMedia) {
			System.out.println("N�o efetuar a compra do produto: "+produto);
		} else {
			System.out.println("Efetuar a compra do produto: "+produto);
		}
		sc.close();
	}

}
