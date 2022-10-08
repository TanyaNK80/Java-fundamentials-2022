package t15MethodsMore;

import java.util.Scanner;

public class P03LongerLine {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double X1FirstLine = Double.parseDouble(scan.nextLine());
		double Y1FirstLine = Double.parseDouble(scan.nextLine());
		double X2FirstLine = Double.parseDouble(scan.nextLine());
		double Y2FirstLine = Double.parseDouble(scan.nextLine());
		double X1SecondLine = Double.parseDouble(scan.nextLine());
		double Y1SecondLine = Double.parseDouble(scan.nextLine());
		double X2SecondLine = Double.parseDouble(scan.nextLine());
		double Y2SecondLine = Double.parseDouble(scan.nextLine());
		double lineLengthFirstLine = Math
				.sqrt((Math.pow(X2FirstLine - X1FirstLine, 2) + Math.pow(Y2FirstLine - Y1FirstLine, 2)) / 2);
		double lineLengthSecondLine = Math
				.sqrt((Math.pow(X2SecondLine - X1SecondLine, 2) + Math.pow(Y2SecondLine - Y1SecondLine, 2)) / 2);
//ako parvata liniq e po golqma ot vtorata
		if (lineLengthFirstLine >= lineLengthSecondLine) {
			// ako parvata liniq e po golqma ili ravna vzimame neinite koordinati, 
			//kato zapo4vame sto4kata po blizo do centara na sistemata

			if (getDistance(X1FirstLine, Y1FirstLine) >= getDistance(X2FirstLine, Y2FirstLine)) {
				// po blizkata to4ka na parvata liniq

				System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", X2FirstLine, Y2FirstLine, X1FirstLine, Y1FirstLine);

			} else {// po blizkata to4ka na parvata liniq

				System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", X1FirstLine, Y1FirstLine, X2FirstLine, Y2FirstLine);
			} // close else
		} // close if

//ako vtorata e po golqma ot parvata rabotim s neinite koordinati	
		else {
			if (getDistance(X1SecondLine, Y1SecondLine) >= getDistance(X2SecondLine, Y2SecondLine)) {

				System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", X2SecondLine, Y2SecondLine, X1SecondLine, Y1SecondLine);

			} else {
				System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", X1SecondLine, Y1SecondLine, X2SecondLine, Y2SecondLine);

			} // close else
		} // close if

	}

	private static double getDistance(double X1, double Y1) {
		Double distance = Math.sqrt((Math.pow(X1, 2) + Math.pow(Y1, 2)) / 2.0);
		return distance;
	}

}
