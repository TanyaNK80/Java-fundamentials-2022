package t15MethodExercises;

import java.util.Scanner;

public class P06MiddleCharacters {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
String word = scan.nextLine();
middleChar(word);
	}

	private static void middleChar(String word) {
		if(word.length()%2!=0) {
		char middleOdd=word.charAt(word.length()/2);
		System.out.printf("%c", middleOdd);}
		
		else {
			String middleEven=""+word.charAt((word.length()/2)-1)+word.charAt((word.length()/2));
			System.out.printf("%s", middleEven);
		}
	}

}
