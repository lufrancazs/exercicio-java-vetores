package exercicio_vetores;

import java.util.Locale;
import java.util.Scanner;

public class problema_alturas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas: ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		int[] age = new int[n];
		double[] heigth = new double[n];
		
		for(int i = 0; i < name.length; i++) {
			
			System.out.printf("Dados da %da pessoa: %n", i+1);
			
			System.out.print("Nome: ");
			name[i] = sc.next();
			System.out.print("Idade: ");
			age[i] = sc.nextInt();
			System.out.print("Altura: ");
			heigth[i] = sc.nextDouble();
		}
		
		double alturaTotal = 0, numeroMenores = 0;
		
		for(int i = 0; i < heigth.length; i++) {
			alturaTotal += heigth[i];
		}
		
		double alturaMedia = alturaTotal / n;
		System.out.printf("Altura Média %.2f%n", alturaMedia);
		
		for(int i = 0; i < age.length; i++) {
			
			if(age[i] < 16) {
				numeroMenores++;
			}
		}
		
		double percentual = (numeroMenores / n) * 100;
		System.out.println("Pessoas com menos de 16 anos: " + percentual + "%");
		
		for(int i = 0; i < age.length; i++) {
			
			if(age[i] < 16) {
				System.out.println(name[i]);
			}
		}
		
		sc.close();
	}

}
