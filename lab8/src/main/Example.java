package main;

import java.util.Random;

/**
 * Example class given by prof.
 */
public class Example {
	public static void main(String[] args) {
		Random random = new Random();
		if (random.nextBoolean()) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
