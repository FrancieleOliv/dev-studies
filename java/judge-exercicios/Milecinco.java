package exerciciosjudgebeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class Milecinco {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		double a,b,media,pesoA, pesoB, somadospesos;
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		pesoA = 3.5;
		pesoB = 7.5;
		somadospesos = pesoA + pesoB;
		media = ((a*pesoA)+(b*pesoB))/somadospesos;
		
		System.out.printf("MEDIA = %.5f%n", media);
		
		sc.close();
		
	}

}
