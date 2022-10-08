package t14MethodsLab;

import java.util.Scanner;

public class P05Orders {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String product = scan.nextLine();
		int quantity = Integer.parseInt(scan.nextLine());

		orders(product, quantity);
	}

	public static void orders(String product, int quantity) {
		double sum = 0;
		switch (product) {
		case "coffee":
			sum = quantity * 1.50;
			break;
		case "water":
			sum = quantity * 1.00;
			break;
		case "coke":
			sum = quantity * 1.40;
			break;
		case "snacks":
			sum = quantity * 2.00;
			break;

		}
		System.out.printf("%.2f",sum);
	}
}
