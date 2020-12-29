import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			Scanner sc = new Scanner(System.in); /*
													 * scanner is used as function for import , where sc is method name
													 * which will carry the value and check to the int s1,s2,s3.
													 */
			System.out.println("Enter three sides of a Triangle :" + "\n");

			System.out.println("Input 1st,2nd & 3rd sides of the triangle :");

			int s1 = sc.nextInt(); // first input as int s1
			int s2 = sc.nextInt(); // Second input as int s2
			int s3 = sc.nextInt(); // third value as int s3

			System.out.println();
			System.out.println("The Three side of the Triangle are :" + "\n" + "s1 : " + s1 + "\n" + "s2 : " + s2 + "\n"
					+ "s3 : " + s3);
			// all the three side value will shown by compiler
			System.out.println("=========================------===========================");

			if (s1 + s2 <= s3 || s2 + s3 <= s1 || s1 + s3 <= s2 || (s1 <= 0 && s2 <= 0 && s3 <= 0)) {
				System.out.println("This is an >>Invalid Triangle<< or the sides of a Triangle are Invalid.");
				System.out.println("=======================---------======================");
				System.out.println(
						"Hints: type three integer value , where \n s1+s2>s3,\n s2+s3>s1, \n s1+s3>s2 \n & s1,s2,s3>0");
				System.out.println("\n");
				System.out.println("Try Again Here!");

			} /*
				 * if the input is invalid, then compiler will show this all statement when
				 * the input is statisfied,the compiler will show the three value as the part of
				 * valid Triangle and will also Show if the triangle is Equilateral,Isosceles or Scalene
				 */
			else {
				System.out.println("Congratulations! The Input is correct for Valid Triangle");
				System.out.println("========================================================");
				if (s1 == s2 && s2 == s3) {
					System.out.println("This is an >>Equilateral Triangle<<");
				} else if (s1 == s2 || s2 == s3 || s3 == s1) {
					System.out.println("This is an >>Isosceles Triangle<<");
				} else if (s1 != s2 && s2 != s3) {
					System.out.println("This is a >>Scalene Triangle<<");
				}

				System.out.println("=======================-------=========================");
				System.out.println("\n");
			}
		}
	}
}