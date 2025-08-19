package collections;

import java.util.Scanner;

public class largest {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int a = scanner.nextInt();

	        System.out.print("Enter second number: ");
	        int b = scanner.nextInt();

	        System.out.print("Enter third number: ");
	        int c = scanner.nextInt();

	        if (a >= b && a >= c) {
	            System.out.println("The largest number is: " + a);
	        }

	        if (b >= a && b >= c) {
	            System.out.println("The largest number is: " + b);
	        }

	        if (c >= a && c >= b) {
	            System.out.println("The largest number is: " + c);
	        }

	        scanner.close();
	    }

}
