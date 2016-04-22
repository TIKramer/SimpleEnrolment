/*****************************************************************
 * Author: Thomas Kramer                                         *
 * Purpose: To Check if a char value contains a special character*
 * Date: 20/04/2016 4:40 PM                                      *
*****************************************************************/
public class CheckCharContainsSpecialCharacters {
	public static boolean containsSpecialCharacters(char charToBeChecked) {

		char[] specialCharacters = { '[', '-', '/', '@', '#', '!', '*', '$', '%', '^', '&', '.', '\'', '_', '+', '=',
				'{', '}', ':', '(', ')', '+', ']', '+' };
		boolean charContainsSpecialCharacters = false;

		for (int i = 0; i <= 23; i++) {
			if (charToBeChecked == specialCharacters[i]) {

				charContainsSpecialCharacters = true;
				i = 24;
			} else {

				charContainsSpecialCharacters = false;
			}
		}

		return charContainsSpecialCharacters;
	}
}