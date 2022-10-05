package t12More;
// from youtube the indian power

//import java.util.Arrays;
import java.util.Scanner;
public class P042LIS {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

//int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
int[] arr = {3,4,-1,0,6,2,3};
//1
int LIS[] = new int[arr.length];
//MASIV S INDEXI
int indexes[] = new int[arr.length];

for(int i=0; i < arr.length; i++){
    LIS[i] = 1;
//MASIV S INDEXI
    indexes[i] = i;
}

for(int i=1; i < arr.length; i++){
    for(int j=0; j < i; j++){
        if(arr[i] > arr[j]){
//IMPORTANT
            if(LIS[j] + 1 > LIS[i]){
                LIS[i] = LIS[j] + 1;
 //MASIV S INDEXI               
                //set the actualSolution INDEXES to point to guy before me
                indexes[i] = j;
            }
        }
    }
}

//find the index of max number in LIS 
int maxIndexLIS = 0;//INDEX KAM 4ISLOTO S NAI MNOGO RESHENIQ
for(int i=0; i < LIS.length; i++){
    if(LIS[i] > LIS[maxIndexLIS]){
        maxIndexLIS = i;
    }
}
//do tuk

//lets print the actual solution
int t = maxIndexLIS;
int newT = maxIndexLIS;
do{
    t = newT;//T E MAXINEDXLIST
    System.out.print(arr[t] + " ");
//MASIV S INDEXI
    newT = indexes[t];
}while(t != newT);
System.out.println();
	}

}
