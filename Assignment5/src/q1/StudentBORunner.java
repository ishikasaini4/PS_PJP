package q1;

import java.util.Scanner;

public class StudentBORunner {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter n: ");
		int n = scn.nextInt();

		StudentBO ob = new StudentBO();
		
		for (int i = 0; i < n; i++) {
			ob.read();
		}

	}
}
