package t12More;

import java.util.Arrays;
import java.util.Scanner;

public class P05KaminoFactory {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int sizeOfArray = Integer.parseInt(scan.nextLine());
int[] arrPrinted=new int[sizeOfArray];
int indexPrinted=0;
int sumPrinted=0;
int Sub1Printed=0;
int Sub1IndexPrinted=0;

int indexCurrent=0;
String input = scan.nextLine();


while(!input.equals("Clone them!")) {
	indexCurrent++;
	int sumCurrent=0;
	int Sub1Current=0;
	int Sub1IndexCurrent=0;
	
	String sequence = input.replaceAll("!+"," ");
	int[] arrCurrent = Arrays.stream(sequence.split(" ")).mapToInt(Integer::parseInt).toArray();

	//calculate sum of the elements
	for (int i = 0; i < arrCurrent.length; i++) {
		sumCurrent+=arrCurrent[i];
	}//+
	
	//calculate the max subsequence of 1 and it`s index
	int Sub1ArrayCurrent=0;
	int counterFirstEqualSubsecuence=1;
	for (int i = 0; ; ) {
		//while is a sequence of 1
		while(arrCurrent[i]==1) {
			Sub1ArrayCurrent++;
			i++;
			if(i>=arrCurrent.length)break;
		}//close while
		
		if(Sub1ArrayCurrent>Sub1Current) {
			Sub1Current=Sub1ArrayCurrent;
			Sub1IndexCurrent=i-Sub1ArrayCurrent;
			//get the first index of the longest sequence
			if(Sub1IndexCurrent==Sub1IndexPrinted
					&&counterFirstEqualSubsecuence==1) {
				Sub1IndexPrinted=Sub1IndexCurrent;
				counterFirstEqualSubsecuence++;
			}
			
			Sub1ArrayCurrent=0;
		}//close if
		else {i++;}
		if(i>=arrCurrent.length)break;
	}//close for
	
	
	
	
	
	
	//start the process of comparing current with printed
	
	//if is with longest sequence
	if(Sub1Current>Sub1Printed) {
		indexPrinted=indexCurrent;
		sumPrinted=sumCurrent;
		Sub1Printed=Sub1Current;
		Sub1IndexPrinted=Sub1IndexCurrent;
		arrPrinted=arrCurrent;

		input=scan.nextLine();
	}
	//if equal sequence length chooses the one with smallest sub1index
	// leftmost starting index
	else if(Sub1Current==Sub1Printed
			&&Sub1IndexCurrent<Sub1IndexPrinted) {
		indexPrinted=indexCurrent;
		sumPrinted=sumCurrent;
		Sub1Printed=Sub1Current;
		Sub1IndexPrinted=Sub1IndexCurrent;
		arrPrinted=arrCurrent;

		input=scan.nextLine();
	}
	else if(Sub1Current==Sub1Printed
			&&Sub1IndexCurrent==Sub1IndexPrinted&&
			sumCurrent>sumPrinted) {
		indexPrinted=indexCurrent;
		sumPrinted=sumCurrent;
		Sub1Printed=Sub1Current;
		Sub1IndexPrinted=Sub1IndexCurrent;
		arrPrinted=arrCurrent;
		
		input=scan.nextLine();
	}
	else if(indexCurrent==1){
		indexPrinted=indexCurrent;
		sumPrinted=sumCurrent;
		Sub1Printed=Sub1Current;
		Sub1IndexPrinted=Sub1IndexCurrent;
		arrPrinted=arrCurrent;
		
		input=scan.nextLine();
	}
	else {
		input=scan.nextLine();
	}
	
	

}//close while

System.out.printf("Best DNA sample %d with sum: %d.",
		indexPrinted, sumPrinted);
System.out.println();
for(int element:arrPrinted) {
	System.out.print(element+" ");
}
	}

}
