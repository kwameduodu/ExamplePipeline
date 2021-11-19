package revature.demo;

import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {
	
	      Scanner in = new Scanner(System.in);
	        int N = in.nextInt();
	        int ans = 0;
	        String str = "";
	        int ascii = 0;
	      
	        if (in.hasNextLine()) {
	            in.nextLine();
	        }
	        for (int i = 0; i < N; i++) {
	        	  String  X = in.nextLine();
	        	  
	            char[] c = X.toCharArray();
	        
	                for(char sc: c){
	               ascii = (int) sc;
	              
	               System.out.print(ascii);
	                
	                }
	        }
	   
	               for (int b = 0; b < ascii; b++) { 
	            	   ans+=b;
	               }
	
	               System.out.println("");
	                
	                System.out.println(ans);
	       
	  
	}

}
