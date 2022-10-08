package t15MethodExercises;

import java.util.Scanner;

public class P04PasswordValidator1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String password = scan.nextLine();
		boolean isValid=true;
		passwordMin2digits(password, isValid);
		passwordLettersAndDigits(password, isValid);
		passwordLength(password, isValid);
		
		
		if((passwordLength(password, isValid)==true)&& 
		(passwordLettersAndDigits(password, isValid)==true) &&
		(passwordMin2digits(password, isValid)==true)) {
						
		System.out.println("Password is valid");}
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
			System.out.println("Password must have at least 2 digits");
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
			System.out.println("Password must consist only of letters and digits");
			
			isValid=false;
			
		}
		return isValid;
	}

	private static boolean passwordLength(String password, boolean isValid) {
		if (password.length() < 6 || password.length() > 10) {
			System.out.println("Password must be between 6 and 10 characters");
			isValid=false;
			
		}
return isValid;
	}
}
