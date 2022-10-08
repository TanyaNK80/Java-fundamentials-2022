package t15MethodExercises;

import java.util.Scanner;

public class P03CharactersinRange {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
char first = scan.nextLine().charAt(0);
char last = scan.nextLine().charAt(0);
printChars(first,last);
	}

	private static void printChars(char first, char last) {
		int start=0;
		int end=0;
		if((int)first<(int)last) {
			start=(int)first+1;
			end=(int)last;
		}
		else {
			start=(int)last+1;
			end=(int)first;
		}
for (int i = start; i <end; i++) {
	System.out.printf("%c ", (char)i);
}		
	}

}
