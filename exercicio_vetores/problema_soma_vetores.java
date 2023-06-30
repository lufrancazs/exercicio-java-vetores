package exercicio_vetores;

import java.util.Locale;
import java.util.Scanner;

public class problema_soma_vetores {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores vai ter cada vetor: ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		System.out.println("Digite os valores de A:");
		for(int i = 0; i < a.length; i++) {
			
			a[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores de B: ");
		for(int i = 0; i < b.length; i++) {
			
			b[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE: ");
		
		for(int i = 0; i < a.length; i++) {
			
			double sum = a[i] + b[i];
			System.out.println(sum);
		}
		
		sc.close();
	}

}
