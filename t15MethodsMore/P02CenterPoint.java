package t15MethodsMore;

import java.util.Scanner;

public class P02CenterPoint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X1 = Integer.parseInt(scan.nextLine());
		int Y1 = Integer.parseInt(scan.nextLine());
		int X2 = Integer.parseInt(scan.nextLine());
		int Y2 = Integer.parseInt(scan.nextLine());

		if (getDistance(X1, Y1) <= getDistance(X2, Y2)) {
			System.out.printf("(%d, %d)", X1, Y1);
		} else {
			System.out.printf("(%d, %d)", X2, Y2);
		}
	}

	private static double getDistance(int X1, int Y1) {
		Double distance = Math.sqrt((Math.pow(X1, 2) + Math.pow(Y1, 2)) / 2.0);
		return distance;
	}

}
