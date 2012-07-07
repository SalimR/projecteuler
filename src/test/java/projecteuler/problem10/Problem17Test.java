package projecteuler.problem10;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem17Test {

	@Test
	public void numberWritten() {
		assertEquals("one", Problem17.numberWritten(1));
		assertEquals("two", Problem17.numberWritten(2));
		assertEquals("three", Problem17.numberWritten(3));
		assertEquals("four", Problem17.numberWritten(4));
		assertEquals("five", Problem17.numberWritten(5));
		assertEquals("six", Problem17.numberWritten(6));
		assertEquals("seven", Problem17.numberWritten(7));
		assertEquals("eight", Problem17.numberWritten(8));
		assertEquals("nine", Problem17.numberWritten(9));
		assertEquals("ten", Problem17.numberWritten(10));
		assertEquals("nineteen", Problem17.numberWritten(19));
		assertEquals("twenty", Problem17.numberWritten(20));
		assertEquals("twentyone", Problem17.numberWritten(21));
		assertEquals("fortytwo", Problem17.numberWritten(42));
		assertEquals("eightyeight", Problem17.numberWritten(88));
		assertEquals("onehundred", Problem17.numberWritten(100));
		assertEquals("onehundredandone", Problem17.numberWritten(101));
		assertEquals("onehundredandfiftyfive", Problem17.numberWritten(155));
		assertEquals("twohundredandsixtyseven", Problem17.numberWritten(267));
		assertEquals("onethousand", Problem17.numberWritten(1000));
	}

	@Test
	public void numberLetters() {
		assertEquals(23, Problem17.numberLetters(342));
		assertEquals(20, Problem17.numberLetters(115));
	}

	@Test
	public void calculateLetters() {
		assertEquals(19, Problem17.calculateLettersUntil(5));
		assertEquals(21124, Problem17.calculateLettersUntil(1000));
	}

}
