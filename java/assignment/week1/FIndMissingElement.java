package assignment.week1;

import java.util.Arrays;

public class FIndMissingElement {

	public static void main(String[] args) {
		int [] arr = {1,4,3,2,8,6,7};
		Arrays.sort(arr);
		for (int i = arr[0]; i < arr.length; i++) {
			if (arr[i]!=i+1) {
				System.out.println("Missing num is " + (i+1));
				break;
			}
			
		}
	}

}
