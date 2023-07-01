package exercicio_vetores;

import java.util.Locale;
import java.util.Scanner;

public class problema_media_pares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] pares = new int[n];
		
		for(int i = 0; i < pares.length; i++) {
			
			System.out.print("Digite um número: ");
			pares[i] = sc.nextInt();
		}
		
		double sum = 0;
		int numPares = 0;
		
		for(int i = 0; i < pares.length; i++) {
			
			if(pares[i] % 2 == 0) {
				sum+= pares[i];
				numPares++;
			}
		}
		
		if(numPares == 0) {
			System.out.println("NENHUM NÚMERO PAR");
		}
		
		else {
			double avg = sum / numPares;
			System.out.printf("MEDIA DOS PARES = %.1f%n", avg);
		}
		
		sc.close();
	}

}
