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
	
	@Test //8
	public void romanNumerals9returnsIX() {
		assertEquals("IX", RomanNumerals.roman(9));
	}
	
	@Test //9
	public void romanNumerals10returnsX() {
		assertEquals("X", RomanNumerals.roman(10));
	}
	
	@Test //10
	public void romanNumerals11returnsXI() {
		assertEquals("XI", RomanNumerals.roman(11));
	}
	
	@Test //11
	public void romanNumerals13returnsXIII() {
		assertEquals("XIII", RomanNumerals.roman(13));
	}
	
	@Test //12
	public void romanNumerals14returnsXIII() {
		assertEquals("XIII", RomanNumerals.roman(13));
	}
	
	@Test //13
	public void romanNumerals18returnsXVIII() {
		assertEquals("XVIII", RomanNumerals.roman(18));
	}
	
	@Test //14
	public void romanNumerals19returnsXIX() {
		assertEquals("XIX", RomanNumerals.roman(19));
	}
	
	@Test //15
	public void romanNumerals24returnsXXIV() {
		assertEquals("XXIV", RomanNumerals.roman(24));
	}
	
	@Test //16
	public void romanNumerals39returnsXXXIX() {
		assertEquals("XXXIX", RomanNumerals.roman(39));
	}
	
	@Test //17
	public void romanNumerals40returnsXL() {
		assertEquals("XL", RomanNumerals.roman(40));
	}

	@Test //18
	public void romanNumerals49returnsXLIX() {
		assertEquals("XLIX", RomanNumerals.roman(49));
	}
	
	@Test //19
	public void romanNumerals50returnsL() {
		assertEquals("L", RomanNumerals.roman(50));
	}

}
