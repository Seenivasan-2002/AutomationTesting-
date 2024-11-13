package assignment;
//class for assignment
public class FindPalindrome {

	public static void main(String[] args) {
		//declared 2 variables input (121) and output for store the reversed number 
		int input = 121;
		int remain =0;
		//for loop starts with input variable,til i is greater than 0,i divided by 10 in each iteration
		for (int i = input ; i>0; i=i/10) {
			//operator to calculate remaining
			remain=(remain*10+i%10);
			//run as loop 1- remain=(0*10+121%10)=(0+1)=1
			//loop 2 - remain=(1*10+12%10)=(10+2)=12
			//loop3- remain=(12*10+1%10)=(120+1)=121 , break;-->remain saved as 121
		}

		System.out.println(remain);
		int output =  remain;
		//use if to compare the input and output
		if(input==output) {
			System.out.println(input+" is a palindrome number");}
		else {System.out.println(input+" is not a palindrome number");}
	}
}