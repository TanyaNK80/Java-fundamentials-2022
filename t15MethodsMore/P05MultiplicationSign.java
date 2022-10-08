package t15MethodsMore;

import java.util.Scanner;

public class P05MultiplicationSign {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = Integer.parseInt(scan.nextLine());
		int b = Integer.parseInt(scan.nextLine());
		int c = Integer.parseInt(scan.nextLine());

		if (a == 0 || b == 0 || c == 0) {
			System.out.println("zero");
		} 
		else {
			checkPositiveNegative(a, b, c);
		}
		
		
		
	}

	private static void checkPositiveNegative(int a, int b, int c) {
		int counterNegativ = 0;
		int[] arr = { a, b, c };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				counterNegativ++;
			}
		}

		if (counterNegativ % 2 == 0 || counterNegativ == 0) {
			System.out.println("positive");
		} else
			System.out.println("negative");
	}

}
