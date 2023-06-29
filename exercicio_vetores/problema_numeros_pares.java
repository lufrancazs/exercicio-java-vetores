package exercicio_vetores;

import java.util.Locale;
import java.util.Scanner;

public class problema_numeros_pares {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar: ");
		int n = sc.nextInt();

		int[] vect = new int[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}

		int sum = 0;

		System.out.println("NUMEROS PARES:");

		for (int i = 0; i < vect.length; i++) {

			if (vect[i] % 2 == 0) {
				System.out.print(" " + vect[i]);
				sum++;
			}
		}
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + sum);

		sc.close();

	}

}
