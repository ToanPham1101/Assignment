/*Fresher training 2022
*Author ToanPDT
*Date Feb 27, 2022
*Study assignment
*/
package fa.training.assignment1;
import java.util.Scanner;

public class ArithmeticExercise2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first number: ");
		int a = sc.nextInt();
		System.out.println("Input second number: ");
		int b = sc.nextInt();
		sc.close();
		System.out.println(a + "+" + b + "=" + (a + b));
		System.out.println(a + "-" + b + "=" + (a - b));
		System.out.println(a + "x" + b + "=" + (a * b));
		System.out.println(a + "/" + b + "=" + (a / b));
		System.out.println(a + "%" + b + "=" + (a % b));
		
	}

}
