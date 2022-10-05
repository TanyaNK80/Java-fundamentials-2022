package t12More;

import java.util.Arrays;
import java.util.Scanner;

public class P06LadyBugs2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int fieldSize = Integer.parseInt(scan.nextLine());
		int[] field = new int[fieldSize];
		String[] indexes = scan.nextLine().split(" ");

//initial field
		for (int i = 0; i < indexes.length; i++) {
			int index=Integer.parseInt(indexes[i]);
			if(index>=0&&index<fieldSize)
				field[index] = 1;
			
		}
//print initialized array
//		for(int element:field) {
//		System.out.print(element+" ");}

//	commands
		String input = scan.nextLine();

		while (!input.equals("end")) {

			String[] inputArray = input.split(" ");
			String direction = inputArray[1];
			int index = Integer.parseInt(inputArray[0]);
			int flyLength = Integer.parseInt(inputArray[2]);

			// proverka dali sme v poleto i dali ima kalinka tam
			if (field[index] == 0 || index < 0 || index > fieldSize-1) {
				input = scan.nextLine();
				continue;
			}
			
			
			field[index] = 0;

			if (direction.equals("right")) {
				index+=flyLength;
				
				while (index<fieldSize&&field[index]==1) {
					index+=flyLength;}
				
					if(index>=0&&index<fieldSize) {
						field[index]=1;
					}
			}

			else  {
				index=index-flyLength;

				while (index>=0&&field[index]==1) {
					index=index-flyLength;}
				
				if(index>=0&&index<fieldSize) {
					field[index]=1;
				}
			}

			input = scan.nextLine();
		} // close while

// print the array
		for (int element : field) {
			System.out.print(element + " ");
		}

	}
}
