package pset1;

import java.util.Scanner;
import java.lang.Exception;

public class Mario {
	
	private static StringBuilder drawPyramid(int height)
	{
		//The pyramid will be Height hashes tall
		int hashes = 2;
		StringBuilder sb = new StringBuilder();
		while(hashes < height + 2)
	    {
	        for(int i=0; i <= (height - hashes); i++)
	        {
	           sb.append(" ");
	            // Print the spaces
	        }
	        for(int i=0; i < hashes; i++)
	        {
	            sb.append("#");
	            // Print the hashes
	        }
	        sb.append("\n");
	        hashes++;
	     }
		return sb;
	}

	public static void main(String[] args) {
		// Main method for Mario class, responsible for
		// getting the height of the pyramid then passing control
		// to BuildPyramid(height);
		int height = -1;
		
		// Initialize new scanner object to get an int
		Scanner getInt = new Scanner(System.in);
		
		while (height < 0 || height > 23)
		{			
			try 
			{
				// Let's get an int
				System.out.print("Height?: ");
				height = getInt.nextInt();
			}
			catch (Exception e)
			{
				// If it wasn't an int...
				
				System.out.println("Invalid input, try an integer!");
				getInt.next();
			}
			if (height < 0 || height > 23)
			{
				System.out.println("Try a number from 0 to 23");
			}
		}
		
		// close the scanner
		getInt.close();
		
		// Draw the pyramid
		System.out.print(drawPyramid(height));
		
	}

}