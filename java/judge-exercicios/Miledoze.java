package exerciciosjudgebeecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Miledoze {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		//Escreva um programa que leia 3 valores c/ ponto flutuante de dupla precisão: A, B e C.
		//Em seguida, calcule e mostre:
		//a) a área do triângulo retângulo que tem A por base e C por altura.
		//b) a área do círculo de raio C. (pi = 3.14159)
		//c) a área do trapézio que tem A e B por bases e C por altura.
		//d) a área do quadrado que tem lado B.
		//e) a área do retângulo que tem lados A e B.
		
		double A, B, C, areaTriangulo, areaCirculo, pi, areaTrapezio, areaQuadrado, areaRetangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		pi = 3.14159;
		
		areaTriangulo = A * C / 2.0;
		
		//A área de um círculo é pi vezes o raio elevado ao quadrado (A = π r²).
		areaCirculo = pi * Math.pow(C, 2.0);
		
		// para área do trapézio A=(a+b)h/2
		areaTrapezio = (A + B) * C / 2;
		
		areaQuadrado = Math.pow(B, 2.0);
		areaRetangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", areaTriangulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

		sc.close();

	}

}
