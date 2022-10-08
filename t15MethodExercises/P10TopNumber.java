package t15MethodExercises;

import java.util.Scanner;

public class P10TopNumber {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int n = Integer.parseInt(scan.nextLine());
boolean isValid=false;

for (int number = 1; number <= n; number++) {
	if(sumOfDigitsDevisibleBy8(number, isValid)==true
			&&holdsAtleastOneOddDigit(number,isValid)==true) {
		System.out.println(number);
	}
}
	}

	private static boolean holdsAtleastOneOddDigit(int number, boolean isValid) {
		
		while(number!=0) {
			int reminder=number%10;
			if(reminder%2!=0) {isValid=true;break;}
			number=number/10;
			}
		
		return isValid;
	}

	private static boolean sumOfDigitsDevisibleBy8(int number, boolean isValid) {
		int sum = 0;
		while(number!=0) {
		int reminder=number%10;
		sum+=reminder;
		number=number/10;
		}
		if(sum%8==0) {isValid=true;}
		return isValid;
	}

}
