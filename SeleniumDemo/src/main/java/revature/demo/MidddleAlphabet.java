package revature.demo;

import java.util.Scanner;

public class MidddleAlphabet {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String c = sc.nextLine();
		int l = sc.nextInt();
	
		
		if (l%2 == 0) {
		for (int i = 0; i < l; i++) {
				if(i == l/2) {
					System.out.print(c);
				}
			System.out.print("*");
			
				} 
		
		
		} else {
		
System.out.println("Can't");
		}
		
	}
	

}
