package exercicio_vetores;

import java.util.Locale;
import java.util.Scanner;

public class problema_aprovados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		
		String[] name = new String[n];
		double[] note1 = new double[n];
		double[] note2 = new double[n];
		
		for(int i = 0; i < name.length; i++) {
			
			System.out.printf("Digite nome, primeira e segunda nota do %do aluno: %n", i+1);
			sc.nextLine();
			name[i] = sc.nextLine();
			note1[i] = sc.nextDouble();
			note2[i] = sc.nextDouble();
			
		}
		
		String namePassed = name[0];
		
		System.out.println("Alunos Aprovados:");
		
		for(int i = 0; i < name.length; i++) {
			
			double sum = note1[i] + note2[i];
			double avg = sum / 2;
			
			if(avg >= 6.0) {
				namePassed = name[i];
				System.out.println(namePassed);
			}
		}
		
		
		
		sc.close();
	}

}
