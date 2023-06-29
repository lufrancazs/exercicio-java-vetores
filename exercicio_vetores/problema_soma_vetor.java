package exercicio_vetores;

import java.util.Locale;
import java.util.Scanner;

public class problema_soma_vetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0;
		
		System.out.print("VALROES = ");
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print(" " + vect[i]);
			
			sum += vect[i];
		}
		
		System.out.println();
		System.out.printf("SOMA = %.2f%n", sum);
		
		double avg = sum/vect.length;
		
		System.out.printf("MEDIA = %.2f%n", avg);
		
		

		sc.close();
	}

}
