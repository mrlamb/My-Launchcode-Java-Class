package pset2;

public class DrawPyramid {
	
	private StringBuilder DrawPyramid(int height)
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
	
	public static void pyramidToFile(int height) {
		
	}
	
	public static void pyramidToOutput(int height) {
		
		System.out.print(DrawPyramid(height));
	}

}
