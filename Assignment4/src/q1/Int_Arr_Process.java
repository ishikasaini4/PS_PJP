package q1;

import java.util.Arrays;
import java.util.Scanner;

public class Int_Arr_Process {

	private int[] a;

	public Int_Arr_Process() {
		this.a = new int[10];
	}

	public Int_Arr_Process(int n) {
		this.a = new int[n];
	}

	public Int_Arr_Process(int[] that) {
		this.a = that;
	}

	public Int_Arr_Process(Int_Arr_Process ob) {
		this.a = ob.a;
	}

	public void read() {
		Scanner scn = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			a[i] = scn.nextInt();
		}
	}

	public void display() {
		System.out.println("Horizontal: ");
		for (int num : a) {
			System.out.print(num + " ");
		}

		System.out.println("\nVertical: ");
		for (int num : a) {
			System.out.println(num);
		}
	}

	public void sort() {
		Arrays.sort(a);
	}

	public void findMinMax() {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int num : a) {
			min = Math.min(min, num);
			max = Math.max(max, num);
		}
		System.out.println("Min : " + min + "\nMax : " + max);
	}

	public int sum() {
		int sum = 0;
		for (int num : a)
			sum += num;
		return sum;
	}

	public void secondLargest() {
		int max = Integer.MIN_VALUE;
		int secMax = max;

		for (int num : a) {
			if (num > max) {
				secMax = max;
				max = num;
			} else if (num < max && num > secMax) {
				secMax = num;
			}
		}

		System.out.println("Second Largest Element: " + secMax);
	}
}
