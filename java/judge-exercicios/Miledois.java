package exerciciosjudgebeecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Miledois {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
						
		double n = 3.14159;
		double raio;
		raio = sc.nextDouble();
		
		double Area = raio*raio*n;
			
			System.out.printf("A=%.4f%n", Area);
				
		sc.close();

	}

}
