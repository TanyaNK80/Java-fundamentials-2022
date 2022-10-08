package t15MethodExercises;

import java.util.Scanner;

public class P07NxNMatrix {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int a = Integer.parseInt(scan.nextLine());

int[][] board = new int[a][a];

for (int i = 0; i < board.length; i++) {
	for (int j = 0; j < board.length; j++) {
		System.out.print(a+" ");
	}
	System.out.println();
}
	}

}
