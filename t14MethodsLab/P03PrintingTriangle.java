package t14MethodsLab;

import java.util.Scanner;

public class P03PrintingTriangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		printTriangle(Integer.parseInt(scan.nextLine()));
	}

	public static void printline(int start, int end) {
		for (int i = start; i <= end; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void printTriangle(int n) {
		for (int line = 1; line < n; line++) {
			printline(1, line);
		}
		printline(1, n);
		for (int line = n - 1; line >= 1; line--) {
			printline(1, line);

		}
	}
}
