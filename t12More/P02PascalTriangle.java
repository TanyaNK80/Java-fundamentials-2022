package t12More;


import java.util.Scanner;

public class P02PascalTriangle {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int n = Integer.parseInt(scan.nextLine());
int[] arr1 = {1};

int[] arr2 = new int[2];
	for(int i=0; i<arr2.length; i++) {
		arr2[i]=arr1[0];
	}
int[] arr3 = new int[3];
arr3[0]=1;
arr3[arr3.length-1]=1;

for(int i=1; i<arr3.length-1; i++) {
	arr3[i]=arr2[i-1]+arr2[i];
	}
int[] arr4 = new int[4];
arr4[0]=1;
arr4[arr4.length-1]=1;

for(int i=1; i<arr4.length-1; i++) {
	arr4[i]=arr3[i-1]+arr3[i];
	}
int[] arr5 = new int[5];
arr5[0]=1;
arr5[4]=1;

for(int i=1; i<arr5.length-1; i++) {
	arr5[i]=arr4[i-1]+arr4[i];
	}
int[] arr6 = new int[6];
arr6[0]=1;
arr6[5]=1;

for(int i=1; i<arr6.length-1; i++) {
	arr6[i]=arr5[i-1]+arr5[i];
	}

if(n==1) {
	for(int element:arr1) {System.out.println(element+" ");}
}
if(n==2) {
	for(int element:arr1) {System.out.println(element+" ");}
	for(int element:arr2) {System.out.println(element+" ");}
}
if(n==3) {
	for(int element:arr1) {System.out.print(element+" ");}
	System.out.println();
	for(int element:arr2) {System.out.print(element+" ");}
	System.out.println();
	for(int element:arr3) {System.out.print(element+" ");}
	System.out.println();
}
if(n==4) {
	for(int element:arr1) {System.out.print(element+" ");}
	System.out.println();
	for(int element:arr2) {System.out.print(element+" ");}
	System.out.println();
	for(int element:arr3) {System.out.print(element+" ");}
	System.out.println();
	for(int element:arr4) {System.out.print(element+" ");}
	System.out.println();
}
if(n==5) {
	for(int element:arr1) {System.out.print(element+" ");}
	System.out.println();
	for(int element:arr2) {System.out.print(element+" ");}
	System.out.println();
	for(int element:arr3) {System.out.print(element+" ");}
	System.out.println();
	for(int element:arr4) {System.out.print(element+" ");}
	System.out.println();
	for(int element:arr5) {System.out.print(element+" ");}
	System.out.println();
	
}
if(n==6) {
	for(int element:arr1) {System.out.print(element+" ");}
	System.out.println();
	for(int element:arr2) {System.out.print(element+" ");}
	System.out.println();
	for(int element:arr3) {System.out.print(element+" ");}
	System.out.println();
	for(int element:arr4) {System.out.print(element+" ");}
	System.out.println();
	for(int element:arr5) {System.out.print(element+" ");}
	System.out.println();
	for(int element:arr6) {System.out.print(element+" ");}
	System.out.println();
	
}
	}

}
