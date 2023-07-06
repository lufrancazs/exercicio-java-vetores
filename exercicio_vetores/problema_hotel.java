package exercicio_vetores;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class problema_hotel {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();

		Student[] student = new Student[10];

		for (int i = 1; i <= n; i++) {

			System.out.println("Rent #" + i + ":");

			System.out.printf("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.printf("Email: ");
			String email = sc.nextLine();

			System.out.printf("Room: ");
			int room = sc.nextInt();
			

			student[room] = new Student(name, email);
			
			System.out.println();
		}

		for (int i = 0; i < 10; i++) {

			if (student[i] != null) {
				System.out.println(i + ": " + student[i]);
			}
		}

		sc.close();

	}

}
