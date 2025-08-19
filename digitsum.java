package collections;

import java.util.Scanner;

public class digitsum {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();

	        int sum = 0;
	        int original = num;

	        while (num != 0) {
	            int digit = num % 10;  
	            sum += digit;         
	            num /= 10;             
	        }

	        System.out.println("Sum of digits of " + original + " is: " + sum);

	        scanner.close();
	    }

}
