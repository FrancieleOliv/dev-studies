package exerciciosjudgebeecrowd;
import java.util.Scanner;

public class Milequatro {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a,b;
		double PROD;
		a = sc.nextInt();
		b = sc.nextInt();
		PROD = a * b;
		
		System.out.printf("PROD = %.0f%n", PROD);
		sc.close();
	}

}
