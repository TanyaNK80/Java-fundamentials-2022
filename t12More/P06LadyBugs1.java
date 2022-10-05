package t12More;

import java.util.Arrays;
import java.util.Scanner;

public class P06LadyBugs1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int fieldSize = Integer.parseInt(scan.nextLine());
		int[] field = new int[fieldSize];
		int[] indexes = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

//initial field
		initializeField(field, indexes);
//	commands
		String input = scan.nextLine();

		while (!input.equals("end")) {
			String[] inputArray = input.split(" ");
			String command = inputArray[1];
			int ladyBugFrom = Integer.parseInt(inputArray[0]);
			int ladyBugTo = Integer.parseInt(inputArray[2]);

			// proverka ima li ladybug tam
			if (field[ladyBugFrom] == 1) {

				switch (command) {
				case "right":

					int goTo = ladyBugFrom + ladyBugTo;
					
					
					while(goTo<=field.length-1) {
					if (field[goTo] == 0) {
						field[goTo] = 1;
						break;}
					else goTo++;
					}
					
					if (goTo > field.length-1) {
						field[ladyBugFrom] = 0;
						break;
					}
					
					break;
					
				case "left":

					break;

				}
			}
			else {continue;}

			input = scan.nextLine();
		}

		for (int element : field) {
			System.out.print(element + " ");
		}
		System.out.println();
		for (int element : indexes) {
			System.out.print(element + " ");
		}
	}

	private static void initializeField(int[] field, int[] indexes) {
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < indexes.length; j++) {
				if (i == indexes[j]) {
					field[i] = 1;
				}
			}
		}
	}

}
