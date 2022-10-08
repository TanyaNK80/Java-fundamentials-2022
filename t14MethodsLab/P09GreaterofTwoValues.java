package t14MethodsLab;

import java.util.Scanner;

public class P09GreaterofTwoValues {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
String command = scan.nextLine();
switch (command) {
case "int":
	int firstNumber = Integer.parseInt(scan.nextLine());
	int secondNumber = Integer.parseInt(scan.nextLine());
	System.out.println(getMax(firstNumber, secondNumber));
	break;
	
case "char":
char first = scan.nextLine().charAt(0);
char second = scan.nextLine().charAt(0);
System.out.println(getMax(first, second));
	break;
	
case "string":
String first1 = scan.nextLine();
String second1 = scan.nextLine();
System.out.println(getMax(first1, second1));
	break;


}
	}

	static int getMax(int firstNumber, int secondNumber) {
		if(firstNumber>secondNumber) {
			return firstNumber;}
		return secondNumber;
	}
	
	static char getMax(char first, char second) {
		if((int)first>(int)second) {
			return first;
		}
		return second;
	}
	
	static String getMax(String first, String second) {
		if(first.compareTo(second)>=0) {
			return first;
		}
		return second;
		
	}
}
