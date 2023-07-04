package exercicio_vetores;

import java.util.Locale;
import java.util.Scanner;

public class problema_dados_pessoas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas: ");
		int n = sc.nextInt();
		
		double[] altura = new double[n];
		char[] genero = new char[n];
		
		for(int i = 0; i < altura.length; i++) {
			
			System.out.printf("Altura da %da pessoa: ", i+1);
			altura[i] = sc.nextDouble();
			
			System.out.printf("Genero da %da pessoa: ", i+1);
			genero[i] = sc.next().charAt(0);
		}
		
		double menorAltura = altura[0];
		double maiorAltura = altura[0];

		
		for(int i = 0; i < altura.length; i++) {
			
			if(maiorAltura < altura[i]) {
				maiorAltura = altura[i];
				
			}
			
			else if(menorAltura > altura[i]) {
					menorAltura = altura[i];
			}
		}
		
		double sum = 0;
		int qtdM = 0;
		int qtdF = 0;
		
		for(int i = 0; i < altura.length; i++) {
			
			if(genero[i] == 'F') {
				qtdF++;
				sum += altura[i];
			}
			
			else {
				qtdM++;
			}
			
		}
		
		double avg = sum / qtdF;
		
		System.out.printf("Menor altura = %.2f%n", menorAltura);
		System.out.printf("Maior altura = %.2f%n", maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n", avg);
		System.out.println("Numero de homens = " + qtdM);

		
		sc.close();
	}

}
