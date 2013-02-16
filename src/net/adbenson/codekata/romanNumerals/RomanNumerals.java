package net.adbenson.codekata.romanNumerals;

public class RomanNumerals {

	public static Object roman(int number) {
		String numeral = "";
		if (number < 4) {
			for (int i = 1; i <= number; i++) {
				numeral += "I";
			}
		}
		else {
			numeral += "IV";
		}
		return numeral;
	}

}
