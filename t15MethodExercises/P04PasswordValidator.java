package t15MethodExercises;

import java.util.Scanner;

public class P04PasswordValidator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String password = scan.nextLine();
		boolean isAllValid=true;
		boolean isValid=true;
		if(passwordLength(password, isValid)==false) {
			isAllValid=false;
			System.out.println("Password must be between 6 and 10 characters");
		}
		if(passwordLettersAndDigits(password, isValid)==false) {
			isAllValid=false;
			System.out.println("Password must consist only of letters and digits");
		}
		if(passwordMin2digits(password, isValid)==false) {
			isAllValid=false;
			System.out.println("Password must have at least 2 digits");
		}
		if(isAllValid==true)System.out.println("Password is valid");
	}

	private static boolean passwordMin2digits(String password, boolean isValid) {
		int isCorrect = 0;
		for (int i = 0; i < password.length(); i++) {

			char symbol = password.charAt(i);

			if ((int) symbol >= 48 && (int) symbol <= 57) {
				isCorrect++;
			}
		}
		if(isCorrect<2) {
			
			isValid=false;
		}
		return isValid;
	}

	private static boolean passwordLettersAndDigits(String password, boolean isValid) {
		int isCorrect = 0;
		for (int i = 0; i < password.length(); i++) {

			char symbol = password.charAt(i);

			if ((int) symbol >= 65 && (int) symbol <= 90 || (int) symbol >= 97 && (int) symbol <= 122
					|| (int) symbol >= 48 && (int) symbol <= 57) {
				isCorrect++;
			}
		}
		if(isCorrect!=password.length()) {
			isValid=false;
			
		}
		return isValid;
	}

	private static boolean passwordLength(String password, boolean isValid) {
		if (password.length() < 6 || password.length() > 10) {
			isValid=false;
			
		}
return isValid;
	}
}
