package faccat;

import java.util.Scanner;

public class _25_SaldoConta {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o n�mero de sua conta: ");
		String conta = sc.nextLine();
		System.out.println("Informe seu saldo: ");
		short saldo = sc.nextShort();
		System.out.println("Informe sua quantia monet�ria em d�bito: ");
		short debito = sc.nextShort();
		System.out.println("Informe sua quantia monet�ria em cr�dito: ");
		short credito = sc.nextShort();
		int saldoAtual = saldo-debito+credito;
		if (saldoAtual>=0) {
			System.out.println("N�mero da Conta: "+conta);
			System.out.println("Seu saldo atual � de: "+saldoAtual+" e, portanto, positivo.");
		} else {
			System.out.println("N�mero da Conta: "+conta);
			System.out.println("Seu saldo atual � de "+saldoAtual+" e, portanto, negativo");
		}
		sc.close();
	}

}
