package exerciciosjudgebeecrowd;
import java.util.Locale;
import java.util.Scanner;

public class Mileseis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double a, b, c, pesoA, pesoB, pesoC, media, somadospesos;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		pesoA = 2;
		pesoB = 3;
		pesoC = 5;
		somadospesos = pesoA + pesoB + pesoC;
		
		media = ((a*pesoA)+(b*pesoB)+(c*pesoC))/somadospesos;
		System.out.printf("MEDIA = %.1f%n", media);
		
		sc.close();

	}

}
