package org.galaxy.guide.constants;

/**
 * @author Shubhankar Roy
 *
 */
public enum RomanNumeral {
	
	I(1),
	V(5),
	X(10),
	L(50),
	C(100),
	D(500),
	M(1_000);
	
	private int value;
	
	/**
	 * @param value
	 */
	private RomanNumeral(int value) {
		this.value = value;
	}
	
	/**
	 * @return value
	 */
	public int getValue() {
		return value;
	}
	
	/**
	 * Get numerical value of roman Number
	 * 
	 * @param romanNum
	 * @return numerical value of Roman number 
	 */
	public static int getNumericValue(char romanNum) {
		return RomanNumeral.valueOf(romanNum + "").value;
	}
}
