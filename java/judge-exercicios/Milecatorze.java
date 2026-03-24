package exerciciosjudgebeecrowd;
import java.util.Locale;
import java.util.Scanner;

public class Milecatorze {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		//Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida
		//(em Km) e o total de combustível gasto (em litros).
		//Entrada
		//O arquivo de entrada contém dois valores:
		//um valor inteiro X representando a distância total percorrida (em Km),
		//e um valor real Y representando o total de combustível gasto,
		//com um dígito após o ponto decimal.

		//Saída
		//Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula,
		//seguido da mensagem "km/l".
		int X;
		double Y, custoMedio;
		X = sc.nextInt();
		Y = sc.nextDouble();
		custoMedio = X/Y;
		
		System.out.printf("%.3f km/l%n", custoMedio);
		
		sc.close();

	}

}
