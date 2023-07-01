package exercicio_vetores;

import java.util.Locale;
import java.util.Scanner;

public class problema_mais_velho {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você vai digitar? ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		int[] age = new int[n];
		
		
		for(int i = 0; i < name.length; i++) {
			
			System.out.printf("Dados da %da pessoa: %n", i+1);
			
			System.out.print("Nome: ");
			name[i] = sc.next();
			
			System.out.print("Idade: ");
			age[i] = sc.nextInt();
		}
		
		String nameMaior = name[0];
		int ageMaior = age[0];
		
		for(int i = 0; i < age.length; i++) {
			
			if(ageMaior < age[i]) {
				ageMaior = age[i];
				nameMaior = name[i];
			}
		}
		
		System.out.println("PESSOA MAIS VELHA: " + nameMaior);
		
		sc.close();
	}

}
