package exerciciosjudgebeecrowd;

import java.util.Scanner;

public class Milesete {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		// Leia quatro valores inteiros A, B, C e D. A seguir
		//calcule e mostre a diferença do produto de A e B pelo produto de C e D
		//segundo a fórmula: DIFERENCA = (A * B - C * D).
		int A, B, C, D;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		System.out.println("DIFERENCA = "+ (A * B - C * D));
		
		sc.close();

	}

}
