package test;

import java.io.PrintStream;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Main {

	public static void main(String[] args) {
		PrintStream output = System.out;
		Result result = JUnitCore.runClasses(TestByte.class);
		for (Failure failure : result.getFailures()) {
			output.println(failure.getMessage());
			output.println(failure.getException());
		}
		if (result.wasSuccessful()) {
			output.println("All tests passed.");
		}
	}

}
