package t12More;


import java.util.Scanner;

public class P02PascalTriangle1 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

int n = Integer.parseInt(scan.nextLine());
int[][] board=new int[60][60];
for (int i = 0; i < board.length; i++) {
	for (int j = 0; j < board.length; j++) {
		if(j==0||j==n) {
			board[i][j]=1;
		}else {
			if(i>=1&&j>=1) {
		board[i][j]=board[i-1][j-1]+board[i-1][j];}
			}
		
	}
}


for(int row=0; row<n; row++) {
	for(int column=0; column<n; column++) {
		if(board[row][column]!=0)
		System.out.print(board[row][column]+" ");
	}
	System.out.println();
}

	}

}
