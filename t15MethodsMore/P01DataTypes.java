package t15MethodsMore;

import java.util.Scanner;

public class P01DataTypes {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

proba(scan);

	}

	private static void proba(Scanner scan) {
		
		String input1=scan.nextLine();
		String input2=scan.nextLine();
		
		if(input1.equals("int")) {
			int a=Integer.parseInt(input2);
			System.out.println(a*2);
		}
		else if(input1.equals("real")) {
			double a = Double.parseDouble(input2);
			System.out.printf("%.2f",a*1.5);
		}
		else if(input1.equals("string")) {
			
			System.out.println("$"+input2+"$");
		}
	}

}
