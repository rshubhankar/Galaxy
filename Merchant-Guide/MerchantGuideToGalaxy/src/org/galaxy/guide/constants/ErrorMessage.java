package org.galaxy.guide.constants;

public enum ErrorMessage {
	SUCCESS(""),
	INVALID("Input format is wrong. Input discarded."),
	INVALID_ROMAN_CHARACTER("Illegal character specified in roman number. Input discarded."),
	INVALID_ROMAN_STRING("Incorrect roman number format."),
	INCORRECT_LINE("Exception caused during processing due to incorrect line type supplied."),
	NO_IDEA("I have no idea what you are talking about."),
	NO_INPUT("No input was specified. Program exited.");
	
	private String message;
	
	private ErrorMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
