package com.sapient.junitTesting;

public class Number {

	
	public int checkPrime(int n) {
		if (n<0)
			throw new IllegalArgumentException();
		
		else if(n==0||n==1)
			return 0;

		for (int i=2; i<=n/2; i++) {
			if(n%i==0)
				return 0;
		}

		return 1;
	}
	
	
	private int noOfDigits(int n) {
		int d = 0;
		while (n!=0) {
			d++;
			n=n/10;
		}
		return d;
	}

	
	public boolean checkArmstrong(int n) {
		if(n<0)
			throw new IllegalArgumentException();
		
		int d = noOfDigits(n);
		int temp = n, sum = 0;

		while (temp!=0) {
			int rem = temp%10;
			sum += Math.pow(rem,d);
			temp = temp/10;
		}

		if (sum==n)
			return true;

		return false;
	}

	
	
	
	public boolean checkPallindrome(int n) {
		if (n<0)
			throw new IllegalArgumentException();
		
		int temp = n, sum = 0;

		while (temp!=0) {
			int rem = temp%10;
			sum = (sum*10) + rem;
			temp = temp/10;
		}
		if (sum==n)
			return true;
		
		return false;
	}
}
