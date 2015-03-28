package pset2;

import pset2.MethodChoice;

public class Brick_Mortor {
	
	private MethodChoice dp_method;
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
	

	public void setDp_method(MethodChoice dp_method) {
		this.dp_method = dp_method;
	}
	
	public MethodChoice getDP_method() {
		return dp_method;
	}
	
	public void deliver_output() {
		
		dp_method.Draw_Pyramid(drawPyramid(this.height));
	}
	
	

}
