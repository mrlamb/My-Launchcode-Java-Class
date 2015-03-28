package pset2.outputs;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import pset2.MethodChoice;

public class PyramidToFile implements MethodChoice {

	@Override
	public void Draw_Pyramid(StringBuilder sb) {
		PrintWriter out;
		try {
			out = new PrintWriter("pyramid.txt");
			out.print(sb);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to create file, sorry.");
		}
		
		
	}
	

}
