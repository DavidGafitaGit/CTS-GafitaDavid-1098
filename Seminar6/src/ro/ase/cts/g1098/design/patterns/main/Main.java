package ro.ase.cts.g1098.design.patterns.main;

import java.io.IOException;

import ro.ase.cts.g1098.design.patterns.interfaces.ILogging;
import ro.ase.cts.g1098.design.patterns.models.LoggerGenerator;
import ro.ase.cts.g1098.design.patterns.models.LoggerType;

public class Main {

	public static void main(String[] args) throws IOException {
		
		ILogging errorlog = LoggerGenerator.getLogger(LoggerType.ERROR);
		errorlog.log("Hello !");
		
		
		//we have a bug
		// we can't have the singleton and the singleton registry in the same time
		// in 2 different classes
		ILogging infolog = LoggerGenerator.getLogger(LoggerType.INFO);
		infolog.log("Hello again!");
		
		System.out.println("The end");
	}

}
