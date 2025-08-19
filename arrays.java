package collections;

import java.util.Arrays;

public class arrays {
	public static void main(String[] args)
	{
		int [] arr1= {94,322,6,2,78,4};
		int [] arr2= {5,1,65,4,23,25};
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("arr1["+i+"]="+arr1[i]);
		}
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println("arr2["+i+"]="+arr2[i]);
		}
		System.out.println("array1 to string:"+Arrays.toString(arr1));
		System.out.println("array2 to string:"+Arrays.toString(arr2));
	}

}
