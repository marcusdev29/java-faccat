package faccat;

import java.util.Scanner;

public class _30_OrdemCrescente {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro valor: ");
		int a = sc.nextInt();
		System.out.println("Informe o segundo valor: ");
		int b = sc.nextInt();
		System.out.println("Informe o terceiro valor: ");
		int c = sc.nextInt();
		if ((a>b) && (b>c)) {
			System.out.println("Os valores em ordem crescente s�o: "+c+", "+b+", "+a);
		} else if ((a>c) && (c>b)) {
			System.out.println("Os valores em ordem crescente s�o: "+b+", "+c+", "+a);
		} else if ((b>a) && (a>c)){
			System.out.println("Os valores em ordem crescente s�o: "+c+", "+a+", "+b);
		} else if ((b>c) && (c>a)) {
			System.out.println("Os valores em ordem crescente s�o: "+a+", "+c+", "+b);
		} else if ((c>a) && (a>b)) {
			System.out.println("Os valores em ordem crescente s�o: "+b+", "+a+", "+c);
		} else if ((c>b) && (b>a)) {
			System.out.println("Os valores em ordem crescente s�o: "+a+", "+b+", "+c);
		}
		sc.close();
		// 123, 132, 213, 231, 312, 321
	}
	
}
