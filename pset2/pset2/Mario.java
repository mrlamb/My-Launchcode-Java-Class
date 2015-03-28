	package pset2;

	import java.util.Scanner;
	import java.lang.Exception;
	import pset2.PyramidFactory;
	import pset2.outputs.*;

	public class Mario {
		
		public static void main(String[] args) {
			// Main method for Mario class, responsible for
			// getting the height of the pyramid then passing control
			// to buildPyramid(height);
			int height = -1;
			int outputSelection = -1;
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
			
			
			
			PyramidFactory pyramid = new PyramidFactory();
			pyramid.setHeight(height);
						
			while (outputSelection == -1) {
				System.out.println("Choose your preferred method (1 or 2):");
				System.out.println("1 - Output to console");
				System.out.println("2 - Output to a file");
				
				try {
					outputSelection = getInt.nextInt();
								
					switch (outputSelection)
					{
					case 1:
						pyramid.setPrintMethod(new OutputToConsole());
						break;
					case 2:
						pyramid.setPrintMethod(new OutputToFile());
						break;
		
					default:
						outputSelection = -1;
						System.out.println("Try again...");
					}
				}
				catch (Exception e)
				{
					outputSelection = -1;
					getInt.next();
					System.out.println("Try again...");
				}
			}
			pyramid.deliver_output();
			// close the scanner
			getInt.close();
			
						
		}

	}
