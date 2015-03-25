package pset1;

import java.util.Scanner;
import java.lang.Exception;

public class Mario {
	
	private static void DrawPyramid(int Height)
	{
		//The pyramid will be Height hashes tall
		int Hashes = 2;
		while(Hashes < Height + 2)
	    {
	        for(int i=0; i <= (Height - Hashes); i++)
	        {
	            System.out.print(" ");
	            // Print the spaces
	        }
	        for(int i=0; i < Hashes; i++)
	        {
	            System.out.print("#");
	            // Print the hashes
	        }
	        System.out.print("\n");
	        Hashes++;
	     }   
	}

	public static void main(String[] args) {
		// Main method for Mario class, responsible for
		// getting the height of the pyramid then passing control
		// to BuildPyramid(height);
		int Height = -1;
		
		// Initialize new scanner object to get an int
		Scanner getInt = new Scanner(System.in);
		
		while (Height < 0 || Height > 23)
		{			
			try 
			{
				// Let's get an int
				System.out.print("Height?: ");
				Height = getInt.nextInt();
			}
			catch (Exception e)
			{
				// If it wasn't an int...
				
				System.out.println("Invalid input, try an integer!");
				getInt.next();
			}
			if (Height < 0 || Height > 23)
			{
				System.out.println("Try a number from 0 to 23");
			}
		}
		
		// close the scanner
		getInt.close();
		
		// Draw the pyramid
		DrawPyramid(Height);
		
	}

}