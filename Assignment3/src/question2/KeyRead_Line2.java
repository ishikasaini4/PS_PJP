package question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KeyRead_Line2 {
	
	private int n;
	private ArrayList<Integer>a ;
	
	KeyRead_Line2(int n){
		this.n = n;
		a = new ArrayList<Integer>();
	}
	
	public void read() {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter numbers :");
		for(int i = 0; i<n ; i++) {
			a.add(scn.nextInt());
		}
	}
	
	public void display() {
		
		for(int num : a) {
			System.out.print(num+" ");
		}
		System.out.println();
	}
	
	public void sort() {
		Collections.sort(a);
	}
	
	public void find() {
		System.out.println("Enter a number to find :");
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		
		for(int num : a) {
			if(num==x) {
				System.out.println("Found");
				return;
			}
		}
		System.out.println("Not Found");
	}
}
