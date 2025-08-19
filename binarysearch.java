package collections;

import java.util.Arrays;

public class binarysearch {
	public static void main(String[] args)
	{
		int [] arr1 = {7,98,46,2,5,98,90,23,1,45,5,4,3};
		int [] arr2 = {3,5,6,7,8};
		System.out.println("arr2 to string:"+Arrays.toString(arr2));
		 Arrays.sort(arr1);
	     System.out.println("Sorted arr1: " + Arrays.toString(arr1));
		int key=1;
		int result = Arrays.binarySearch(arr1,key);
		if(result<0)
		{
			System.out.println("element not found");
		}
		else
		{
			System.out.println("elemeny found at:"+result);
		}
	}

}
