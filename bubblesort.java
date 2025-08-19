package collections;

public class bubblesort {
	public static void main(String[] args)
	{
		int [] array= {8,34,1,23,67,6,7,98,56};
		System.out.println("array before sorting:");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=0;j<array.length-1-i;j++)
			{
				if(array[j]>array[j+1]) 
				{
				int temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
				}
			}
		}
		System.out.println("array after sorting:");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		} 
	}

}
