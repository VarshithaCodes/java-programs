package collections;

import java.util.Arrays;

public class array_op {
	public static void main(String[] args)
	{
		int [] array1= {1,2,7,6,5,8,9,4,5};
		int [] array2= {3,6,7,1,76,89};
		int[] array3=new int[5];
		Arrays.fill(array3,7);
		System.out.println("constsnt array:"+Arrays.toString(array3));
		Arrays.sort(array1);
		System.out.println("sorted array is "+Arrays.toString(array1));
		System.out.println("second largest:"+array1[array1.length-2]);
		array1=Arrays.copyOf(array1,10);
		System.out.println("array1 is"+Arrays.toString(array1));
		if(Arrays.equals(array1,array2))
		{
			System.out.println("array equals");
		}
		else
		{
			System.out.println("not equals");
		}
		//binary search
		int key=6;
		int index=Arrays.binarySearch(array2, key);
		if(index>=0)
		{
			System.out.println("found at index:"+index);
		}
		else
		{
			System.out.println("not found");
		}
		//reverse array elements
		int [] array= {1,2,3,4,5,6,7,8,9};
		int [] rev=Arrays.copyOf(array, array.length);
		for(int i=0;i<rev.length/2;i++)
		{
			int temp=rev[i];
			rev[i]=rev[rev.length-1-i];
			rev[rev.length-1-i]=temp;
		}
		System.out.println("original string:"+Arrays.toString(array));
		System.out.println("reversed string:"+Arrays.toString(rev));
		
	}

}
