package exerciciosjudgebeecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Milenove {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		// Faça um programa que leia o nome de um vendedor, o seu salário fixo
		//e o total de vendas efetuadas por ele no mês (em dinheiro).
		//Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
		//informar o total a receber no final do mês, com duas casas decimais.
		
		String nome;
		double salario, vendas, comissao;
		
		nome = sc.next();
		salario = sc.nextDouble();
		vendas = sc.nextDouble();
		comissao = 0.15;
		
		System.out.printf("TOTAL = R$ %.2f%n", + ((vendas*comissao) + salario));
		
		sc.close();

	}

}
