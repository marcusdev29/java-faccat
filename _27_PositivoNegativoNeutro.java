package faccat;

import java.util.Scanner;

public class _27_PositivoNegativoNeutro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um valor: ");
		byte valor = sc.nextByte();
		if (valor>0) {
			System.out.println("O valor informado � positivo");
		} else if (valor==0) {
			System.out.println("O valor informado � neutro");
		} else {
			System.out.println("O valor informado � negativo");
		}
		sc.close();

	}

}
