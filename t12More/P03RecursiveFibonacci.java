package t12More;

import java.util.Scanner;

public class P03RecursiveFibonacci {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int n = Integer.parseInt(scan.nextLine());

int[] arr=new int[n];
arr[0]=1;
if(n>1) {
arr[1]=1;
for (int i = 2; i < arr.length; i++) {
	arr[i]=arr[i-2]+arr[i-1];
}
}
System.out.println(arr[n-1]);
	}

}
