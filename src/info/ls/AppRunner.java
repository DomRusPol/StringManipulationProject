package info.ls;

public class AppRunner {

	public static void main(String[] args) {

		int number1 = 12345;
		int number2 = 123;

		System.out.println(getResult(number1, number2));

	}

	public static String getResult(int number1, int number2) {
		
		String out = "";
		int result = number1 * number2;
		int maxLength = String.valueOf(result).length();
		out += getSpaces(maxLength - String.valueOf(number1).length()) + number1 + "\n";
		out += getSpaces(maxLength - String.valueOf(number2).length()) + number2 + "\n";
		if (number1 > number2) {
			out += getSpaces(maxLength - String.valueOf(number1).length()) + getUnderlines(String.valueOf(number1).length()) + "\n";
		} else {
			out += getSpaces(maxLength - String.valueOf(number2).length()) + getUnderlines(String.valueOf(number2).length()) + "\n";
		}
		if (String.valueOf(number2).length() == 1) {
			out += result;
		} else {
		out += getRows(number1,number2,maxLength);
		out += getUnderlines(maxLength) + "\n" + result;
		}
		return out;
	}

	private static String getUnderlines(int amount) {
		
		String out = "";
		for (int i = 0; i < amount; i++) {
			out += "_";
		}
		return out;
	}

	private static String getRows(int number1, int number2, int maxLength) {

		String out = "";
		int counter = 0;
		char[] symbols = String.valueOf(number2).toCharArray();
		for (int i = symbols.length - 1; i >= 0; i--) {
			int rowResult = number1 * Character.getNumericValue(symbols[i]);
			out += getSpaces(maxLength - String.valueOf(rowResult).length() - counter) + rowResult + "\n";
			counter++;
		}
		
		return out;
	}

	private static String getSpaces(int amount) {

		String out = "";
		for (int i = 0; i < amount; i++) {
			out += " ";
		}
		return out;
	}
}

