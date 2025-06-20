package list;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		
		//Declare an array
		List <Integer> array1=new ArrayList <Integer>();
	   array1.add(3);
	   array1.add(2);
		array1.add(11);
		array1.add(4);
		array1.add(6);
		array1.add(7);
		
		//Declare another array
		List <Integer>array2=new ArrayList <Integer>();
		array2.add(1);
		array2.add(2);
		array2.add(8);
		array2.add(4);
		array2.add(9);
		array2.add(7);
		
		//Iterate the values through the length of the list
		
		for (int i = 0; i < array1.size(); i++) {
			for (int j = 0; j <array2.size(); j++) {
				
				//Use an appropriate conditional statement to compare the values
				
			if (array1.get(i).equals(array2.get(j))) {
				System.out.print("Intersction number is:");
				System.out.println(array1.get(i));
			}
			}
			
			
		}
		
		


		
		
		
	}

}
