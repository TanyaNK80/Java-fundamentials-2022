package t15MethodExercises;

import java.util.Scanner;

public class P01SmallestofThreeNumbers {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int first = Integer.parseInt(scan.nextLine());
int second = Integer.parseInt(scan.nextLine());
int third = Integer.parseInt(scan.nextLine());
System.out.println(findSmallestOfThreeIntegers(first, second, third));

	}
private static int findSmallestOfThreeIntegers(int first, int second,int third) {
	int smallest = Integer.MAX_VALUE;
	if(first<smallest) {
		smallest=first;
	}
	if(second<smallest) {
		smallest=second;
	}
	if(third<smallest) {
		smallest=third;
	}
	return smallest;
	
}
}
