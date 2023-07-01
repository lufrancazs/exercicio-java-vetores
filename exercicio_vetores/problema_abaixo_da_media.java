package exercicio_vetores;

import java.util.Locale;
import java.util.Scanner;

public class problema_abaixo_da_media {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor: ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0;
		
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
		
		double avg = sum / vect.length;
		
		System.out.println();
		System.out.printf("MEDIA DO VETOR = %.3f%n", avg);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		
		for(int i = 0; i < vect.length; i++) {
			
			if(vect[i] < avg) {
				System.out.printf("%.1f%n", vect[i]);
			}
		}
		
		sc.close();
	}

}
