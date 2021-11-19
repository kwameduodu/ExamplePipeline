package com.revature;

import java.util.Arrays;

public class Order {


	public static boolean isAscending(String input) {
		 System.out.println("Check Ascending order");
			char[] ordered = input.toCharArray();	
	        for(int i = 0; i < ordered.length; i++) {
	        	for(int j = i + 1; j < ordered.length; j++) {
	        		
	        		if(ordered[i] > ordered[j]) {
	        		int	tmp = ordered[i];
	        			ordered[i] = ordered[j];
	        			ordered[j] = (char) tmp;
	        	}
	        	}
	        }	   

    boolean result = (ordered.equals(input))? true: false;
     return result;
	
	        	}
	public static boolean isConsecutive(String stringToCheck) {
		 System.out.println("Check Consecutive");
		 boolean result = false;
		int length = stringToCheck.length();

		for (int i = 0; i < length / 2; i++)
		{
		    String newString = stringToCheck.substring(0, i + 1);

		    int number = Integer.parseInt(newString);

		    while (newString.length() < length)
		    {
		        number++;

		        newString += String.valueOf(number);
		    }
		
	result = (newString.equals(stringToCheck))? true: false;
		}
		return result;
	
	}

	    public static int[][] NXNsquare(int n)
	    {
	        int squareArray[][] = new int[n][n];

	        for (int j = 0; j < n; j++)
	        {
	            for (int k = 0; k < n; k++)
	            {
	                squareArray[j][k] = n;
	            }
	        }
	        if (n == 0)
	        {
	            squareArray = new int[][]{};
	            System.out.println(Arrays.toString(squareArray));
	            return squareArray;
	        }
	        
	        for (int[] arr: squareArray)
	        {
	            System.out.println(Arrays.toString(arr));
	        }
	        System.out.println(" ");
	        return squareArray;
	    }


	    public static void main(String[] args)
	    {
	    
	      System.out.println( isAscending("1234"));
	      System.out.println( isAscending("42153"));
          System.out.println(isAscending("4444445"));
	      System.out.println(isConsecutive("4444445"));
	      System.out.println(isConsecutive("456815"));
	      
	        NXNsquare(4);
	        NXNsquare(6);
	        NXNsquare(10);
	        NXNsquare(0);
	    }
	      }