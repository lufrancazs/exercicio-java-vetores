package exercicio_vetores;

import java.util.Locale;
import java.util.Scanner;

public class problema_maior_posicao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar: ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for(int i = 0; i < vect.length; i++) {
			
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		double maior = vect[0];
		int numeroMaior = 0;
		
		for(int i = 0; i < vect.length; i++) {
			
			if(maior < vect[i] ) {
				maior = vect[i];
				numeroMaior = i;
			}
		}
		
		System.out.println();
		System.out.println("MAIOR VALOR = " + maior);
		System.out.println("POSIÇÃO DO MAIOR VALOR = " + numeroMaior);
		
		sc.close();
	}

}
