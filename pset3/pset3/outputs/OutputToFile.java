package pset3.outputs;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import pset3.PrintMethods;

public class OutputToFile implements PrintMethods {

	@Override
	public void printOutput(StringBuilder sb) {
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
