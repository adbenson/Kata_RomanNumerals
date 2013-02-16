package net.adbenson.codekata.romanNumerals;

public class RomanNumerals {

	public static Object roman(int number) {
		String numeral = "";
		for (int i = 1; i <= number; i++) {
			numeral += "I";
		}
		return numeral;
	}

}
