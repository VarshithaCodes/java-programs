package collections;

public class expression {
	public static void main(String[] args)
	{
		int [][] element= {
				{6,5},
				{7,2},
				{11,4},
				{3,8}
				};
		for(int i=0;i<element.length;i++)
		{
			int a=element[i][0];
			int b=element[i][1];
			int result=(a*b)+3;
			System.out.println(a+","+b+"="+result);
		}
	}
}	
