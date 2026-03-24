package exerciciosjudgebeecrowd;
import java.util.Scanner;

public class Mildezenove {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int N, resto, hora, minuto, segundo;
		N = sc.nextInt();
		
		hora = N / 3600;
		resto = N % 3600;
		
		minuto = resto / 60;
		segundo = resto % 60;
			
		System.out.println(hora + ":" + minuto + ":" + segundo);
		sc.close();
	}

}
