package week3.day1;

import java.util.Iterator;

public class Reverse {

	public static void main(String[] args) {
		String companyName = "TestLeaf";
				
				char [] rev = companyName.toCharArray();
		
		for (int i = rev.length-1; i >=0 ; i--) {
			System.out.print(rev[i]); 
		}
	}

}
