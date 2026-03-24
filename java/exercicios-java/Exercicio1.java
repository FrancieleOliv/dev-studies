package com.aprendendocodigos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double largura, comprimento, metroQuadrado;

		System.out.println("Digite largura do terreno:");
		largura = sc.nextDouble();
		System.out.println("Digite comprimento do terreno:");
		comprimento = sc.nextDouble();
		System.out.println("Digite valor do metro quadrado do terreno:");
		metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("A área do terreno é de:  %.2f m² %n", area);
		System.out.printf("O preço do terreno é de: R$ %.2f%n", preco);

		sc.close();
	}

}
