package faccat;

import java.util.Scanner;

public class _28_MaiorValor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		byte a = sc.nextByte();
		System.out.println("Informe o segundo valor: ");
		byte b = sc.nextByte();
		System.out.println("Informe o terceiro valor: ");
		byte c = sc.nextByte();
		
		if ((a>b) && (a>c)) {
			System.out.println("Dos valores informados, o maior valor � A");
		} else if ((b>a) && (b>c)) {
			System.out.println("Dos valores informados, o maior valor � B");
		} else {
			System.out.println("Dos valores informados, o maior valor � C");
		}
		sc.close();
	}

}
