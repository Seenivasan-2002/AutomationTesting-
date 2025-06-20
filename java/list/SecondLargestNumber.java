package list;

import java.util.ArrayList;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {

		//Declare an array
		List <Integer> Ranks = new ArrayList<Integer>();
		Ranks.add(3);
		Ranks.add(2);
		Ranks.add(11);
		Ranks.add(4);
		Ranks.add(6);
		Ranks.add(7);
		
		//Arrange the collection in ascending order
		Ranks.sort(null);
		
		//Use the get method to print the second largest number
		System.out.println("Second largest number in the array :"+ Ranks.get(Ranks.size()-2));
		
		//Rank.size in normal num , so we minus one num and also we need second largest number so we minus one more, for last before num
	}

}
