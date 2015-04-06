package pset4;

import pset4.outputs.*;

public class PrinterFactory {
	
	private PrinterFactory() {}
	
	private static PrinterFactory pf;
	
	public static PrinterFactory getInstance() {
		if (pf == null) {
			pf = new PrinterFactory();
		}
		return pf;
	}
	
	
	public PrintMethods printMethod (int option) {
		
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
