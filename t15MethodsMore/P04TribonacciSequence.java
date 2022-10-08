package t15MethodsMore;

import java.util.Scanner;

public class P04TribonacciSequence {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int num = Integer.parseInt(scan.nextLine());
int[] arr=new int[num];
for (int i = 0; i < arr.length; i++) {
	if(i==0) {
		arr[i]=1;
	}
	else if(i==1) {
		arr[i]=1;
	}
	else if(i==2) {
		arr[i]=arr[i-1]+arr[i-2];
	}
	else {
	arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
	}
}

for(int element:arr) {
	System.out.print(element+" ");
}
	}

}
