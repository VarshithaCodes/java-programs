package collections;

import java.util.List;
import java.util.ArrayList;

public class List_ex {
	public static void main(String[] args)
	{
		List<String> elements = new ArrayList<>();
		elements.add("1");
		elements.add("23");
		elements.add("54");
		elements.add("2");
		for(String element : elements)
		{
			System.out.println(element);
		}
	}

}
