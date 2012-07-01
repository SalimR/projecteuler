package projecteuler.problem1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Problem4PalindromTest {

	@Test
	public void calculateLargestPalindrome() {
		assertEquals(9009, Problem4Palindrom.calculateLargestPalindrome(2));
		assertEquals(906609, Problem4Palindrom.calculateLargestPalindrome(3));
		assertEquals(99000099, Problem4Palindrom.calculateLargestPalindrome(4));
		// assertEquals(9966006699L,
		// Problem4Palindrom.calculateLargestPalindrome(5));
	}

	@Test
	public void calculateSmallestNumber() {
		assertEquals(1, Problem4Palindrom.calculateSmallestNumberWithDigits(1));
		assertEquals(10, Problem4Palindrom.calculateSmallestNumberWithDigits(2));
		assertEquals(100,
				Problem4Palindrom.calculateSmallestNumberWithDigits(3));
	}

	@Test
	public void calculateLargestNumber() {
		assertEquals(9, Problem4Palindrom.calculateLargestNumberWithDigits(1));
		assertEquals(99, Problem4Palindrom.calculateLargestNumberWithDigits(2));
		assertEquals(999, Problem4Palindrom.calculateLargestNumberWithDigits(3));
	}

	@Test
	public void isPalindrome() {
		assertFalse(Problem4Palindrom.isPalindrome(-2));
		assertFalse(Problem4Palindrom.isPalindrome(0));
		assertFalse(Problem4Palindrom.isPalindrome(4));
		assertFalse(Problem4Palindrom.isPalindrome(1));
		assertFalse(Problem4Palindrom.isPalindrome(10));
		assertFalse(Problem4Palindrom.isPalindrome(98));
		assertFalse(Problem4Palindrom.isPalindrome(900));
		assertFalse(Problem4Palindrom.isPalindrome(9019));
		assertTrue(Problem4Palindrom.isPalindrome(909));
		assertTrue(Problem4Palindrom.isPalindrome(22));
		assertTrue(Problem4Palindrom.isPalindrome(242));
		assertTrue(Problem4Palindrom.isPalindrome(243342));
	}

}
