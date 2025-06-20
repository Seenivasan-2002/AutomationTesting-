package assignment.week1;

import java.util.Arrays;
import java.util.Iterator;

public class FindIntersion {

	public static void main(String[] args) {
		int []array1 = {3,2,11,4,6,7};
		int []array2 = {1,2,8,4,9,7};
	Arrays.sort(array1);
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if(array1[i]==array2[j]) {
					System.out.println("Intersection number is " + array1[i]);
					break;
				}
				
			}
		}

	}

}
