package string;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		//Define two input strings.
		String text1 = "stops";
		String text2 = "potss";
		
		//Check if the lengths of the two strings are equal
		if (text1.length()==text2.length()) {
			//If equal, continue
			
			//Convert both the strings to character arrays
			char [] txt1= text1.toCharArray();
			char [] txt2= text2.toCharArray();
			
			//- Sort both the character arrays
			Arrays.sort(txt1);
			Arrays.sort(txt2);
			
			//- Check if the sorted arrays are equal
			if (Arrays.equals(txt1, txt2)) {
				System.out.println("The given strings are Anagram.");
			}else {
				System.out.println("The given strings are not an Anagram");
			}
			
		}else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
