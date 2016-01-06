package test;

import static org.junit.Assert.*;
import org.junit.Test;
import junit.framework.Assert;
import quiz.Byte;

public class TestByte {

	@Test
	public void testConstructor() {
		try {
			Byte b = new Byte((byte) 0);
			b = new Byte((byte) -100);
		} catch (Exception e) {
			fail(e.getMessage());
		}

    // Test null byte creation.
		try {
			new Byte((java.lang.Byte) null);
			fail("Exception was expected for null input");
		} catch (NullPointerException e) {
		}
	}

	/**
	 * Test that the static attribute, MAX_VALUE, of Byte is the desired 127
	 */
	@Test
	public void testMaxValue() {
		Assert.assertEquals(Byte.MAX_VALUE, (byte) 127);
	}

	/**
	 * Test that the static attribute, MIN_VALUE, of Byte is the desired -128
	 */
	@Test
	public void testMinValue() {
		Assert.assertEquals(Byte.MIN_VALUE, (byte) -128);
	}

	/**
	 * Test the two Byte's are the same when created with the same value.
	 */
	@Test
	public void testEquals() {
		Byte a = new Byte(Byte.MIN_VALUE);
		Byte b = new Byte(Byte.MIN_VALUE);
		Assert.assertEquals(a.equals(b), true);
	}

	/**
	 * Test that two are not the same.
	 */
	@Test
	public void testNotEquals() {
		Byte a = new Byte(Byte.MIN_VALUE);
		Byte b = new Byte(Byte.MAX_VALUE);
		Assert.assertEquals(a.equals(b), false);
	}

	@Test
	public void testHashCode() {
		Byte a = new Byte(Byte.MIN_VALUE);
		Assert.assertEquals(a.hashCode(), (int) -128);
	}

	/**
	 * Test isEven() with: MIN_VALUE, MAX_VALUE, 0
	 */
	@Test
	public void testIsEven() {

		// Test that MIN_VALUE isEven
		Byte b = new Byte(Byte.MIN_VALUE);
		Assert.assertEquals(b.isEven(), true);

		// Test that MAX_VALUE !isEven
		b = new Byte(Byte.MAX_VALUE);
		Assert.assertEquals(b.isEven(), false);

		// Test that 0 isEven
		b = new Byte((byte) 0);
		Assert.assertEquals(b.isEven(), true);
	}

	/**
	 * Test toString() Prints a string representation of the Byte
	 */
	@Test
	public void testToString() {
		// Test if MIN_VALUE isEven
		Byte b = new Byte(Byte.MIN_VALUE);
		Assert.assertEquals(b.toString(), "-128");
	}

}
