package q3;

import java.util.Scanner;

import q3.InterfaceRunner.Num_Process;

public class InterfaceExtender {
	public static void main(String[] args) {
		
		Num_Process[] ob = new Num_Process[4];
		ob[0] = (a,b)->a+b;
		ob[1] = (a,b)->a-b;
		ob[2] = (a,b)->a*b;
		ob[3] = (a,b)->a/b;
		
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a & b: ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		System.out.println("OPERATIONS\n1. Add\n2. Subtract\n3. Multiply\n4. Divide");
		System.out.print("Enter choice: ");
		int choice = scn.nextInt();
		
		System.out.println(ob[choice-1].cal(a, b));
	}
}
