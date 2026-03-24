package exerciciosjudgebeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class Miledezesete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int horas, velocidade, automovel;
		automovel = 12;
		
		//System.out.println("Digite o tempo gasto na viagem em horas:"); exercicio sem esse print
		horas = sc.nextInt();
		//System.out.println("Digite a velocidade média durante a viagem"); exercicio sem esse print
		velocidade = sc.nextInt();
		double distanciaPercorrida = horas * velocidade;
		double litrosNecessarios = distanciaPercorrida / automovel;
		
		
		System.out.printf("%.3f%n", litrosNecessarios);
		
		sc.close();
	}

}
