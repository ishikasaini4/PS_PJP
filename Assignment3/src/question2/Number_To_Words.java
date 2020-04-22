package com.sapient.shapes;

public class Number_To_Words {
	
	static String[] got = { 
			"", 
			"Thousand", 
			"Million", 
			"Billion", 
			"Trillion", 
			"Zillion" };
	
	static String[] teen = { 
			"", 
			"One", 
			"Two", 
			"Three", 
			"Four", 
			"Five", 
			"Six", 
			"Seven", 
			"Eight", 
			"Nine", 
			"Ten",
			"Eleven", 
			"Twelve", 
			"Thirteen", 
			"Fourteen", 
			"Fifteen", 
			"Sixteen", 
			"Seventeen", 
			"Eighteen", 
			"Nineteen" };
				
	static String[] ten = { 
			"", 
			"", 
			"Twenty", 
			"Thirty", 
			"Forty", 
			"Fifty", 
			"Sixty", 
			"Seventy", 
			"Eighty", 
			"Ninety" };
	 
	
	
	public String fig_to_words(long n) {
		if(n==0)
			return "Zero";
		return convertToWords(n,0).trim()+" Only";
	}
	
	
	public static String convertToWords(long num,int i) {
		if(num==0)
			return "";
		return convertToWords(num/1000,i+1) +toWordsHelper(num%1000)+" "+got[i]+" ";
	}
	
	
	public static String toWordsHelper(long num){
		
		if(num>=100){
			return teen[(int) (num/100)]+ " Hundred " + toWordsHelper(num%100);
			}
		else if(num>=20) {
			return ten[(int) (num/10)]+ " "  + toWordsHelper(num%10);
			}
		else {
			return teen[(int) num];
			}
		}
}
