//Q.3 Write a Java program that accepts two integers from the user and then 4 prints the sum, the difference, the product, the average, the distance 
//(the 5 difference between integer), the maximum (the larger of the two integers), the 6 minimum (smaller of the two integers).

package javaproject;
import java.util.Scanner;
public class Calculation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input first number: "); 
		int a = in.nextInt();
		System.out.println("Input second number: ");
		int b = in.nextInt();
		
		 System.out.println("Sum of two numbers: "+(a + b));
		 System.out.println("Product of two numbers: "+(a * b));
		 System.out.println("Difference of two numbers: " + (a - b));
		 System.out.println("Average of two numbers: "+(a +b)/2);
         System.out.println("Distance of the two numbersL: "+(a - b));

	}

}
