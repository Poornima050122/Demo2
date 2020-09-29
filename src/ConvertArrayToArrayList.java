import java.util.*;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String family[]= {"Siva","Poornima","Sai","Thea"};
		
	/*	//Converting Array to ArrayList
		
		//1)Using  => Array.asList(}
		
		List ConvertedArray=Arrays.asList(family);
		System.out.println(ConvertedArray);
		
		//Above Method will not support if new value added to the arraylist
		
		//Method 2
		List<String>ConvertedArray1=new ArrayList<String>(Arrays.asList(family));
		System.out.println(ConvertedArray1);
		ConvertedArray1.add("Dhamodharan");
		ConvertedArray1.add("Thulasi");
		
		System.out.println(ConvertedArray1);*/

		
		//Method3
		//Using Collections.Add(ArrayListName,ArrayName)
		
/*		List<String> ConvertedArray2 = new ArrayList<String>();
		Collections.addAll(ConvertedArray2, family);
		System.out.println(ConvertedArray2);
		Collections.addAll(ConvertedArray2, null);//This is not possible it ill give null pointer exception
		System.out.println(ConvertedArray2);*/
		
		
		//Method 4 
		//Using Manual Method like add
		List<String> ConvertedArray3 = new ArrayList<String>();
		
		for(String newfamily:family)
		{
			ConvertedArray3.add(newfamily);
		
		}
		
		System.out.println(ConvertedArray3);
	}

}
