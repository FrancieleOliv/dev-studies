package exerciciosjudgebeecrowd;

import java.util.Scanner;
import java.util.Locale;
		 
public class Mileonze {
		 
	public static void main(String[] args) {
		 Scanner sc = new Scanner (System.in);
		 Locale.setDefault(Locale.US);
		        
		 double R, V;
		 R = sc.nextDouble();
		 V = Math.pow (R,3);
		    
		    System.out.printf("VOLUME = %.3f%n", (4/3.0) * 3.14159 * V);
		    
		    sc.close();

	}

}
