package t15MethodExercises;

import java.util.Scanner;

public class P02VowelsCount {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
String input = scan.nextLine();
System.out.println(getNumberOfVowel(input));
	}

	private static int getNumberOfVowel(String input) {
		int vowels=0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i)=='a'||input.charAt(i)=='o'||input.charAt(i)=='e'||
					input.charAt(i)=='i'||input.charAt(i)=='u'||input.charAt(i)=='A'
					||input.charAt(i)=='O'||input.charAt(i)=='E'||input.charAt(i)=='I'
					||input.charAt(i)=='U') {
				vowels++;
			}
		}
		return vowels;
	}

}
