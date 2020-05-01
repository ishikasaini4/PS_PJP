package q3;

import q3.InterfaceRunner.Num_Process;

public class InterfaceExtender {
	public static Num_Process Add = (a, b) -> a + b;
	public static Num_Process Subtract = (a, b) -> a - b;
	public static Num_Process Multiply = (a, b) -> a * b;
	public static Num_Process Divide = (a, b) -> a / b;

	public static int compute(int a, int b, Num_Process op) {
		return op.cal(a, b);
	}
}
