package net.adbenson.codekata.romanNumerals.test;

import static org.junit.Assert.*;
import net.adbenson.codekata.romanNumerals.RomanNumerals;

import org.junit.Test;

public class RomanNumeralsTest {
	
	@Test
	public void romanNumerals1returnsI() {
		assertEquals("I", RomanNumerals.roman(1));
	}
	
	@Test
	public void romanNumerals2returnsII() {
		assertEquals("II", RomanNumerals.roman(2));
	}

}
