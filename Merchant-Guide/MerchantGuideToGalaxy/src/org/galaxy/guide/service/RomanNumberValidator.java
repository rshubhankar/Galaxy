package org.galaxy.guide.service;

import org.galaxy.guide.constants.RomanNumeral;

/**
 * @author Shubhankar Roy
 *
 */
public class RomanNumberValidator {
	
	private static final RomanNumberValidator INSTANCE = new RomanNumberValidator();
	private static final String VALID_ROMAN_NUMBER_PATTERN = "^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$";
	
	/**
	 * Private Constructor to make Singleton
	 */
	private RomanNumberValidator() {
		
	}
	
	/**
	 * @return return singleton instance of {@link RomanNumberValidator}
	 */
	public static RomanNumberValidator getInstance() {
		return INSTANCE;
	}
	
	/**
	 * Is Valid Roman Number String.
	 * 
	 * @param romanNumber
	 * @return true if valid.
	 */
	public boolean isValidRomanNumber(String romanNumber) {
		return VALID_ROMAN_NUMBER_PATTERN.matches(romanNumber);
	}
	
	/**
	 * Get Arabic equivalent value of Roman Number.
	 * 
	 * @param romanNumber
	 * @return arabic equivalent value.
	 */
	public int getArabicNumber(String romanNumber) {
		int result = -1;
		if(isValidRomanNumber(romanNumber)) {
			result = convert(romanNumber);
		}
		return result;
	}
	
	/**
	 * Convert roman number to arabic number.
	 * 
	 * @param romanNumber
	 * @return arabic number
	 */
	public int convert(String romanNumber) {
		int number = 0;
		int lastNumber = 0;
		char ch;
		int arabicNumber;
		
		for (int i = 0; i < romanNumber.length(); i++) {
			ch = romanNumber.charAt(i);
			arabicNumber = RomanNumeral.getNumericValue(ch);
			
			if(lastNumber > arabicNumber) {
				number = number - arabicNumber;
			} else {
				number = number + arabicNumber;
			}
			
			lastNumber = arabicNumber;
		}
		
		return number;
	}
}
