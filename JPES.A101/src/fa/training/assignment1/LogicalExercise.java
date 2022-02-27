/*Fresher training 2022
*Author ToanPDT
*Date Feb 27, 2022
*Study assignment
*/
package fa.training.assignment1;
import java.util.Scanner;

public final class LogicalExercise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input first integer: ");
		int a = sc.nextInt();
		System.out.println("Input second integer: ");
		int b = sc.nextInt();
		sc.close();
		
		if(a == b) {
			System.out.println(a + "==" + b);
		}
		if(a != b) {
			System.out.println(a + "!=" + b);
		}
		if(a < b) {
			System.out.println(a + "<" + b);
		}
		if(a > b) {
			System.out.println(a + ">" + b);
		}
		if(a <= b) {
			System.out.println(a + "<=" + b);
		}
		if(a >= b) {
			System.out.println(a + ">=" + b);
		}
		
		
		
	}

}
