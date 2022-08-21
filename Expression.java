// Q.1 Write a Java program to find the value of specified expression.
package javaproject;

public class Expression {

	public static void main(String[] args) {
		int a1 = (100 + 50) / 3;
		double a2 = 3.0-6* 10000000.1 ;
		boolean a3 =  true && true;
		boolean a4 =  false && true;
		boolean a5 =  (false && false) || (true && true);
		boolean a6 = (false || false) && (true && true);

		System.out.println("(200 + 100) / 3->"+a1);
		System.out.println("3.0-6* 10000000.1->"+a2);
		System.out.println("true && true->"+a3);
		System.out.println("false && true->"+a4);
		System.out.println("(false && false) || (true && true)->"+a5);
		System.out.println("(false || false) && (true && true->"+a6);

	}

}
