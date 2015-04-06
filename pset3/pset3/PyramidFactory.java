package pset3;

public class PyramidFactory {
	
	private PrintMethods printMethod;
	private int height;
	
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
	public void setHeight(int height) {
		this.height = height;
	}
	

	public void setPrintMethod(PrintMethods printMethod) {
		this.printMethod = printMethod;
	}
	
	public PrintMethods getPrintMethod() {
		
		return printMethod;
		
	}
	
	public void deliver_output() {
		
		printMethod.printOutput(drawPyramid(this.height));
	}
	
	

}
