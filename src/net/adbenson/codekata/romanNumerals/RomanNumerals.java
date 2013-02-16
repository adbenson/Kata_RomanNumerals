package net.adbenson.codekata.romanNumerals;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumerals {
	
	private static Map<Integer, String> numerals;
	
	static {
		numerals = new LinkedHashMap<Integer, String>();
		numerals.put(10, "X");
		numerals.put(9, "IX");
		numerals.put(5, "V");
		numerals.put(4, "IV");
		numerals.put(1, "I");
	}

	public static Object roman(int number) {
		String numeral = "";
		for (Map.Entry<Integer, String> entry : numerals.entrySet()) {
			while (number >= entry.getKey()) {
				numeral += entry.getValue();
				number -= entry.getKey();
			}
		}
		return numeral;
	}

}
