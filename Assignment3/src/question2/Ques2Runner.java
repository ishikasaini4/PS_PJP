package question2;

import java.util.Scanner;

public class Ques2Runner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Command_Line1
		Command_Line1 commandline = new Command_Line1(args.length);	
		commandline.setData(args);
		commandline.calData();
		commandline.displaydata();

		
		//KeyRead_line2u
		System.out.println("Enter number of elements : ");
		int n = scanner.nextInt();
		KeyRead_Line2 keyline = new KeyRead_Line2(n);
		keyline.read();
		keyline.display();
		keyline.sort();
		keyline.display();
		keyline.find();
		
		
		//Number_to_Words
		 Number_To_Words w = new Number_To_Words();
		
		 System.out.println("Enter number : ");
		 long num = scanner.nextLong();
		
		 String ans = w.fig_to_words(num);
		 System.out.println(ans);

	}

}
