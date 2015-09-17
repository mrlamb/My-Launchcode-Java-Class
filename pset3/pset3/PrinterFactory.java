package pset3;

import pset3.outputs.*;

public class PrinterFactory {
	
	public static PrintMethods printMethod (int option) {
		
		PrintMethods printMethod = null;
		
		if (option == 1) {
			printMethod = new OutputToConsole();
		}
		else if (option == 2) {
			printMethod = new OutputToFile();
		}
		return printMethod;
	}

}
