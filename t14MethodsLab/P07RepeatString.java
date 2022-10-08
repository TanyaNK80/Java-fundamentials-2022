package t14MethodsLab;

import java.util.Scanner;

public class P07RepeatString {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

String str = scan.nextLine();
int count = Integer.parseInt(scan.nextLine());
System.out.println(repeatString(str, count));

	}
private static String repeatString(String str, int count) {
	String result="";
	for (int i = 0; i < count; i++) {
		result=result+str;
	}
	return result;
}
}
