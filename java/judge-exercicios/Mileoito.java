package exerciciosjudgebeecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Mileoito {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		// Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas,
		// o valor que recebe por hora e calcula o salário desse funcionário.
		//A seguir, mostre o número e o salário do funcionário, com duas casas decimais.
		int number;
		double horas, valor;
		
		number = sc.nextInt();
		horas = sc.nextDouble();
		valor = sc.nextDouble();
		
		System.out.println("NUMBER = "+ number);
		System.out.printf("SALARY = U$ %.2f%n", horas * valor);
		
		sc.close();
		
	}

}
