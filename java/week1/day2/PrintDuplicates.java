package week1.day2;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
	int [] num = {2,5,7,7,5,9,2,3};
	System.out.println(num[num.length-1]);
	Arrays.sort(num);
	
	for (int i = 0; i < num.length; i++) {
		System.out.print(num[i]);
	}
	for (int i = 0; i < num.length-1; i++) {
		//if(num[i]==num[i+1])
		for (int j =i+1; j<num.length-1 ; j++) {
			if (num[i]==num[j]) {
				System.out.println(" duplicate num: "+num[i]);
			}
		}
	
	}
	}

}
