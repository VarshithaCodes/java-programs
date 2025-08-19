package collections;

import java.util.Arrays;

public class arrayrev {
	public static void main(String[] args)
	{
	int [] array= {5,8,97,455,34,34,6,90};
	System.out.println("Array to string:"+Arrays.toString(array));
	int [] reversed=Arrays.copyOf(array, array.length);
	for (int i = 0; i < array.length; i++) {
        reversed[i] = array[array.length - 1 - i];
    }

    System.out.println("Reversed array: " + Arrays.toString(reversed));
    }

}
