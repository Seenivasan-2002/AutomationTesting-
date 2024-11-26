package string;

public class OddIndexToUppercase {
	

	public static void main(String[] args) {
		String test = "changeme";
		
		//Convert the given String to a character array.
		char[]odd=test.toCharArray();
		//Implement a loop to iterate through each character of the String (from end to start).
		for (int i = 0; i < odd.length; i++) {
			
			//Find the odd index within the loop
			if(i%2==1) {
				
				//Inside the loop, change the character to uppercase only if the index is odd

				System.out.print(Character.toUpperCase(odd[i]));
				
			}else {
				System.out.print(odd[i]);

			}
		}
		
		
		
	}

}
