package collections;

public class selectionsort {
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
			int min=i;
			for(int j=i+1;j<array.length;j++)
			{
				if(array[j]<array[min]) 
				{
				min=j;
				}
			}
			int temp=array[min];
			array[min]=array[i];
			array[i]=temp;
		}
		System.out.println("array after sorting:");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
	}

}
