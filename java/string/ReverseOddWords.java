package string;


public class ReverseOddWords {

	public static void main(String[] args) {
		
	   String model = "I am a software tester";
	   
	   
	  
		//Split the words and have it in an array
	   String test1[] = model.split(" ");
		//- Traverse through each word using loop 
		for (int i = 0; i < test1.length; i++) {
			
			//- Find the odd index within the loop
			if (i%2==1) {
			
				//- Convert the String array into a character array 
				char[] revw=test1[i].toCharArray();
				
				//- Print the even position words using another loop

				for (int j = revw.length-1; j >=0; j--) {
					System.out.print( revw[j]);
					
				}
				System.out.print(" ");
			}else {
				System.out.print(test1[i]+" ");
			}
					
		}
		
	}

}
