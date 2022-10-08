package t15MethodExercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P08FactorialDivision {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
double a = Double.parseDouble(scan.nextLine());
double b = Double.parseDouble(scan.nextLine());

System.out.printf("%.2f",(factoriel(a)/factoriel(b)) );


	}

	private static double factoriel(double number) {
		double factoriel=1;
		for (double i = number; i >1; i--) {
			factoriel=factoriel*i;
		}
		
		return factoriel;
	}

}
