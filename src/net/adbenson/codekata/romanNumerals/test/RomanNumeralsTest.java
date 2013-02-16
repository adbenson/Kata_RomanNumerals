package net.adbenson.codekata.romanNumerals.test;

import static org.junit.Assert.*;
import net.adbenson.codekata.romanNumerals.RomanNumerals;

import org.junit.Test;

public class RomanNumeralsTest {
	
	@Test //1
	public void romanNumerals1returnsI() {
		assertEquals("I", RomanNumerals.roman(1));
	}
	
	@Test //2
	public void romanNumerals2returnsII() {
		assertEquals("II", RomanNumerals.roman(2));
	}
	
	@Test //3
	public void romanNumerals3returnsIII() {
		assertEquals("III", RomanNumerals.roman(3));
	}
	
	@Test //4
	public void romanNumerals4returnsIV() {
		assertEquals("IV", RomanNumerals.roman(4));
	}

	@Test //5
	public void romanNumerals5returnsV() {
		assertEquals("V", RomanNumerals.roman(5));
	}
	
	@Test //6
	public void romanNumerals6returnsVI() {
		assertEquals("VI", RomanNumerals.roman(6));
	}
	
	@Test //7
	public void romanNumerals8returnsVIII() {
		assertEquals("VIII", RomanNumerals.roman(8));
	}

}
