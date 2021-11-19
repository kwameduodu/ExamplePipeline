package revature.demo;

import java.util.Scanner;

public class ReplaceLetter {

	public static void main(String[] args) {
		

		//setup Scanner 
		Scanner sc = new Scanner(System.in);
		
		
		//get User input
		String letter = sc.nextLine();

	String repl = letter.replaceFirst("v", "w");
	String ans =  repl.replace("v", "");		
	System.out.println(ans);
		

	}
		
}
