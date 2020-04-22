package question2;

import java.util.ArrayList;

public class Command_Line1 {
	
	private int n;
	private ArrayList<Integer> a ;
	
	private int sum;
	private double avg;
	private int min;
	private int max;
	
	Command_Line1(int n){
		this.n = n;
		a = new ArrayList<Integer>();
		sum = 0;
		avg = 0;
		min = Integer.MAX_VALUE;
		max = Integer.MIN_VALUE;
	}
	
	public void setData(String[] args) {
		
		for(int i = 0; i<n; i++) {
			a.add(Integer.parseInt(args[i]));
		}
	}
	
	public void calData(){
		
		for(int i = 0; i<a.size(); i++) {
			sum+=a.get(i);
			min = Math.min(min, a.get(i));
			max = Math.max(max, a.get(i));
		}
		avg = sum/(n*1.0);
	}
	
	public void displaydata() {
		System.out.printf("Sum : %d",sum).println();
		System.out.printf("Average : %.2f,",avg).println();
		System.out.printf("Min : %d",min).println();
		System.out.printf("Max : %d",max).println();
	}
}
