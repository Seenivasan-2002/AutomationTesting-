package list;

import java.util.ArrayList;

import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		//Declare a String array and add the values as {HCL, Wipro, Aspire Systems, CTS}
		List <String> MNC = new ArrayList <String>();
		
		//Add the collection to a list
		MNC.add("HCL");
		MNC.add("Wipro");
		MNC.add("Aspire Systems");
		MNC.add("CTS");
		
		//Arrange the collection in ascending order
		MNC.sort(null);
		
		//Use reverse loop to iterate the collection
	 for (int i =MNC.size()-1; i >=0 ; i--) {
		System.out.print(MNC.get(i)+",");
	}	
	}

}
