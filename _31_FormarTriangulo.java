package faccat;

import java.util.Scanner;

public class _31_FormarTriangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		byte valor1 = sc.nextByte();
		System.out.println("Informe o segundo valor: ");
		byte valor2 = sc.nextByte();
		System.out.println("Informe o terceiro valor: ");
		byte valor3 = sc.nextByte();

		if ((valor1<valor2+valor3) && (valor2<valor1+valor3) && (valor3<valor2+valor1)) {
			System.out.println("De acordo com os valores informados, � poss�vel formar um tri�ngulo: ");
		} else {
			System.out.println("De acordo com os valores informados, n�o � poss�vel formar um tri�ngulo: ");
		}
		sc.close();
	}

}
