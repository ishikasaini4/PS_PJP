package q3;

import java.util.Scanner;

public class InterfaceRunner {

	public interface Num_Process {
		public int cal(int a, int b);
	}

	public static void main(String[] args)
			throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, SecurityException {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a & b: ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		System.out.println("OPERATIONS\n1. Add\n2. Subtract\n3. Multiply\n4. Divide");
		System.out.print("Enter choice: ");
		String choice = scn.next();

		InterfaceExtender ie = new InterfaceExtender();
		Num_Process op = (Num_Process) InterfaceExtender.class.getField(choice).get(ie);
		int ans = InterfaceExtender.compute(a, b, op);
		System.out.println(ans);
	}

}
