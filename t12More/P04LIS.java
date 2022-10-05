package t12More;
//from int to string and reverse using stringbuilder
import java.util.Arrays;
import java.util.Scanner;
//1 2 5 3 5 2 4 1
public class P04LIS {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int[] seq = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//System.out.println();
int[] len=new int[seq.length];
for (int i = 0; i < len.length; i++) {
	len[i]=1;
}
int[] prev=new int[seq.length];
for (int i = 0; i < prev.length; i++) {
	prev[i]=i;
}
//j is an index for the NUMBERS BEFORE the current number at index i
int j=0;
//System.out.println();
for (int i = 1; i <= seq.length-1; ) {
	
	if(i==seq.length) {break;}
	while(seq[i]>seq[j]
			&&len[j]+1>len[i]) {
		
		len[i]=len[j]+1;
		prev[i]=j;
		j++;
		if(j==i) {j=0;i++;}
		if(i==seq.length) {break;}
	}//close while
	j++;
	if(j==i) {j=0;i++;}
	
}//close for i

//points to the index of the number with biggest LIS value
int lastIndex=0;
//System.out.println();
for (int l = 0; l < len.length-1; l++) {
	if(len[l+1]>len[lastIndex]) {
		lastIndex=l+1;
	}
}
//print the LIS
String[] printArr=new String[1];
printArr[0]=String.valueOf(seq[lastIndex]);
if(lastIndex==0) {
	System.out.println(printArr[0]);
	}//close if one element only
else {
lastIndex=prev[lastIndex];
while(true) {
//while(lastIndex!=0) {

	String newPrint=seq[lastIndex]+" "+String.join(" ",printArr);
	printArr=newPrint.split(" ");
	lastIndex=prev[lastIndex];
	if(len[lastIndex]==1) {
		String newPrintLast=seq[lastIndex]+" "+String.join(" ",printArr);
		printArr=newPrintLast.split(" ");
		break;
		}//close if

}//close while

for(String element:printArr) {
	System.out.print(element + " ");
}//close for print
}//close else

	}

}
