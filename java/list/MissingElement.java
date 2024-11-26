package list;

import java.util.ArrayList;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		//- Declare an array {1, 2, 3, 4, 10, 6, 8}.
		List<Integer> Sno = new ArrayList <Integer>();
		Sno.add(1);
		Sno.add(2);
		Sno.add(3);
		Sno.add(4);
		Sno.add(10);
		Sno.add(6);
		Sno.add(8);
		
		//Arrange the collection in ascending order
		Sno.sort(null);
		
		//Inside the loop, check the current element + 1 is not equal to the next element
		for (int i = 0; i < Sno.size()-1; i++) {
		
			if (Sno.get(i)+1!=Sno.get(i+1)) {
				
				//Use the get() method to get an element from the list
				System.out.println("Missing numbers is "+(Sno.get(i)+1));
				
				//Print the numbers that are missing
			}
		}
		
		
		
	}

}
