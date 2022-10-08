package t15MethodExercises;

import java.util.Scanner;

public class P09PalindromeIntegers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		boolean isPalindrome = false;

		while (!input.equals("END")) {
			int number = Integer.parseInt(input);
			
			if (number >= 0 && number <= 9) {
				isPalindrome = true;
			}
			else  {
				isPalindrome=biggerNumbers(number, isPalindrome);
			}
			System.out.println(isPalindrome);		
			input = scan.nextLine();
		}

	}

	
	private static boolean biggerNumbers(int number, boolean isPalindrome) {
		int remember = number;
		int reversed=0;
		
		while(number!=0) {
			int reminder = number%10;
			reversed=reversed*10+reminder;
			number=number/10;
		}
		
		if(remember==reversed) {isPalindrome=true;}
		else {isPalindrome=false;}
		
		return isPalindrome;
	}
}