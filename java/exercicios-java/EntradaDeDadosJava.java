package com.aprendendocodigos;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDadosJava {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x, s1, s2, s3;
		int y;
		double z;
		char w;
		
		System.out.println("Digite casa ou apartamento");
		x = sc.next();
		System.out.println("Você digitou: " +x);
		
		System.out.println("Digite um número dela");
		y = sc.nextInt();
		System.out.println("Você digitou: " +y);
		
		System.out.println("Digite o complemento do nº, se for fundos digite F e se não tiver digite asterístico");
		w = sc.next().charAt(0);
		System.out.println("" +w);
		// outra operação de teste
		System.out.println("Digite o valor dela");
		z = sc.nextDouble();
		System.out.printf("Você digitou:R$ %.2f%n", z);
		// outra operação de teste
		
		System.out.print("Você digitou: " +x);
		System.out.print(" Nº " +y);
		System.out.print("" +w);
		System.out.printf(" Valor de R$ %.2f reais%n", z);
		System.out.println(" ou ");
		// dessa forma o código fica mais enxuto
		System.out.printf("Você digitou: %s cujo nº é %d%c no valor de R$ %.2f reais%n", x, y, w, z);
		// outra operação de teste
		
		System.out.println("Digite todas as opções acima já digitada mas faça isso em uma linha apenas com espaço separando-as");
		x = sc.next();
		y = sc.nextInt();
		w = sc.next().charAt(0);
		z = sc.nextDouble();
		System.out.println("Dados digitados:");
		System.out.println (x);
		System.out.println (y);
		System.out.println (w);
		System.out.println (z);
		// outra operação de teste
		sc.nextLine();
		
		System.out.println("Agora vamos para texto até quebra de linha");
		System.out.println("Digite três textos e de Enter apos concluir cada um deles");
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		// outra operação de teste
		System.out.println("Dados digitados:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		sc.close();
	}

}
