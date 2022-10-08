package t15MethodsMore;

import java.util.Arrays;
import java.util.Scanner;

public class P06ArrayManipulator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		String command = scan.nextLine();
		// String[] arrCommand = command.split(" ");

		while (!command.contains("end")) {
			// [1, 2, 3, 4, 5] -> exchange 2 -> result: [4, 5, 1, 2, 3]
			if (command.contains("exchange")) {
				String[] arrCommand = command.split(" ");
				int index = Integer.parseInt(arrCommand[1]);
				if (index < 0 || index > arr.length - 1) {
					System.out.println("Invalid index");
				} else {
					arr = exchange(arr, index);

				}
			} // close if exchange

//		max even/odd – returns the INDEX of the max even/odd element -> 
//		[1, 4, 8, 2, 3] -> max odd -> print 4
			else if (command.contains("max")) {
				if (command.contains("even")) {
					maxEven(arr);
				} // close if even
				else if (command.contains("odd")) {
					maxOdd(arr);
				} // close if odd
			} // close if max

			else if (command.contains("min")) {
				if (command.contains("even")) {
					minEven(arr);
				} // close if even
				else if (command.contains("odd")) {
					minOdd(arr);
				} // close if odd
			} // close if min

// [1, 8, 2, 3] -> first 2 even -> print [8, 2]
			else if (command.contains("first")) {
				String[] arrCommand = command.split(" ");
				int index = Integer.parseInt(arrCommand[1]);
				if (index > arr.length) {
					System.out.println("Invalid count");

				}

				else if (command.contains("even")) {
					firstEven(arr, index);
				} // close if even
				else if (command.contains("odd")) {
					firstOdd(arr, index);
				} // close if odd
			} // close if first

			else if (command.contains("last")) {
				String[] arrCommand = command.split(" ");
				int index = Integer.parseInt(arrCommand[1]);
				if (index > arr.length) {
					System.out.println("Invalid count");

				} else if (command.contains("even")) {
					lastEven(arr, index);
				} // close if even
				else if (command.contains("odd")) {
					lastOdd(arr, index);
				} // close if odd

			} // close if last

			command = scan.nextLine();

		} // close while
		System.out.println(Arrays.toString(arr));
	}// close main

	private static void lastOdd(int[] arr, int index) {
		int counter = 0;
		for (int j = 0; j < arr.length; j++) {
			if (counter< index)
				if (arr[j] % 2 != 0) {
					counter++;
				}
		}
		
		int[] arrOdd = new int[counter];
		int i = arrOdd.length - 1;
		for (int j = arr.length-1; j >=0; j--) {
			if (i >= 0)
				if (arr[j] % 2 != 0) {
					arrOdd[i] = arr[j];
					i--;
									}
		}
		if (counter == 0)
			System.out.println("[]");
		else
			System.out.println(Arrays.toString(arrOdd));
	}

	private static void lastEven(int[] arr, int index) {
		
		int counter = 0;
		for (int j = 0; j < arr.length; j++) {
			if (counter< index)
				if (arr[j] % 2 == 0) {
					counter++;
				}
		}
		
		int[] arrEven = new int[counter];//only the non null elements
		int i = arrEven.length - 1;
		for (int j = arr.length-1; j >=0; j--) {
			if (i >= 0)
				if (arr[j] % 2 == 0) {
					arrEven[i] = arr[j];
					i--;
									}
		}
		if (counter == 0)
			System.out.println("[]");
		else
			System.out.println(Arrays.toString(arrEven));
	}

	private static void firstOdd(int[] arr, int index) {
		int counter = 0;
		// counts the firstEven element to the index
		for (int j = 0; j < arr.length; j++) {
			if (counter < index)
				if (arr[j] % 2 != 0) {
					counter++;
				}
		}

		if (counter == 0)
			System.out.println("[]");
		else {// creates new array and sets values
			int i = 0;// for arrEven
			int[] arrOdd = new int[counter];
			for (int j = 0; j < arr.length; j++) {
				if (i < arrOdd.length)
					if (arr[j] % 2 != 0) {
						arrOdd[i] = arr[j];
						i++;
					}
			}

			System.out.println(Arrays.toString(arrOdd));
		}
	}

	private static void firstEven(int[] arr, int index) {

		int counter = 0;
		// counts the firstEven element to the index
		for (int j = 0; j < arr.length; j++) {
			if (counter < index)
				if (arr[j] % 2 == 0) {
					counter++;
				}
		}

		if (counter == 0)
			System.out.println("[]");
		else {// creates new array and sets values
			int i = 0;// for arrEven
			int[] arrEven = new int[counter];
			for (int j = 0; j < arr.length; j++) {
				if (i < arrEven.length)
					if (arr[j] % 2 == 0) {
						arrEven[i] = arr[j];
						i++;
					}
			}
			System.out.println(Arrays.toString(arrEven));
		}
	}

	private static void minOdd(int[] arr) {
		int index = 0;
		int minOdd = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0 && arr[i] <= minOdd) {
				minOdd = arr[i];
				index = i;
			} // close if
		} // close for
		if (minOdd == Integer.MAX_VALUE) {
			System.out.println("No matches");
		} else
			System.out.println(index);

	}

	private static void minEven(int[] arr) {
		int index = 0;
		int minEven = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0 && arr[i] <= minEven) {
				minEven = arr[i];
				index = i;
			} // close if
		} // close for
		if (minEven == Integer.MAX_VALUE) {
			System.out.println("No matches");
		} else
			System.out.println(index);

	}

	private static void maxEven(int[] arr) {
		int index = 0;
		int maxEven = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0 && arr[i] >= maxEven) {
				maxEven = arr[i];
				index = i;
			} // close if
		} // close for
		if (maxEven == -1) {
			System.out.println("No matches");
		} else
			System.out.println(index);
	}

	private static void maxOdd(int[] arr) {
		int index = 0;
		int maxOdd = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0 && arr[i] >= maxOdd) {
				maxOdd = arr[i];
				index = i;
			} // close if
		} // close for

		if (maxOdd == -1) {
			System.out.println("No matches");
		} else {
			System.out.println(index);
		}
	}// close maxOdd

	private static int[] exchange(int[] arr, int index) {
		int[] arrExchanged = new int[arr.length];
		if (index != arr.length - 1) {
			for (int i = 0; i < arrExchanged.length; i++) {
				arrExchanged[i] = arr[index + 1];
				index++;
				if (index == arr.length - 1) {
					index = -1;
				}
			}
			arr = arrExchanged;
		}

		return arr;
	}

}
