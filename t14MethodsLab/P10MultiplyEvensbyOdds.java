package t14MethodsLab;

import java.util.Scanner;

public class P10MultiplyEvensbyOdds {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int n = Integer.parseInt(scan.nextLine());

System.out.println(getMultipleOfEvensAndOdds(n));
	}
	
private static int getMultipleOfEvensAndOdds(int n) {
	int evensSum = getSumOfEvenDigits(n);
	int oddsSum = getSumOfOddDigits(n);
	return evensSum*oddsSum;
}

private static int getSumOfEvenDigits(int n) {
	int evensSum=0;
	int a=Math.abs(n);
	while(a>0) {
		int digit=a%10;
		if(digit%2==0) {
			evensSum+=digit;
		}
		a=a/10;
	}
	return evensSum;
}

private static int getSumOfOddDigits(int n) {
	int oddsSum=0;
	int a=Math.abs(n);
	while(a>0) {
		int digit=a%10;
		if(digit%2!=0) {
			oddsSum+=digit;
		}
		a=a/10;
	}
	return oddsSum;
}
}
