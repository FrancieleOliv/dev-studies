package exerciciosjudgebeecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Miledez {

	public static void main(String[] args) {
		// Neste problema, deve-se ler
		//o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1,
		//o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
		//Após, calcule e mostre o valor a ser pago.

		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		int peca1, peca2, quant1, quant2;
		double valor1, valor2;
		
		peca1 = sc.nextInt();
		quant1 = sc.nextInt();
		valor1 = sc.nextDouble();
		peca2 = sc.nextInt();
		quant2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", (quant1*valor1)+(quant2*valor2));
		
		sc.close();
	}

}
