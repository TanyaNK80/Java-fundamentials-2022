package t15MethodExercises;

import java.util.Scanner;

public class P05AddandSubtract {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int first = Integer.parseInt(scan.nextLine());
int second = Integer.parseInt(scan.nextLine());
int third = Integer.parseInt(scan.nextLine());

int sum = sum(first, second);

substract(third, sum);

	}

	private static void substract(int third, int sum) {
		int substract =sum-third;
		System.out.println(substract);
	}

	private static int sum(int first, int second) {
		int sum=0;
		sum=first+second;
		return sum;
	}

}
