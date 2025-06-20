package string;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		
		String text = "We learn Java basics as part of java sessions in java week1";
		
		
		//Initialize a variable ‘count’ to keep track of the number of duplicate words found
		int count=0;
		
		//Split the text into an array of words using space as the delimiter
		String learn[] = text.split(" ");
		
		//Create two nested for loops to compare each word with every other word in the String array.
		for (int i = 0; i < learn.length; i++) {
			for (int j = i+1; j < learn.length; j++) {
				
				//If a duplicate word is found, it is replaced with an empty string and the count is incremented.
				if (learn[i].equalsIgnoreCase(learn[j])) { 
					 learn[j]=" ";
					count++;
				}
			}
			
		}
		
		
		//After comparing all words, if the count is greater than 1
		if (count>0) {
			System.out.println("Count of duplicate numbers = "+count);
			System.out.print("modified words array : ");
			
			//use another for loop to print the modified String array
			for (int i = 0; i < learn.length; i++) {
				System.out.print(learn[i]+" ");
			}
			
			} else {
			 System.out.println("No duplicate words found.");
	            System.out.println("Original text: " + text);
		}
		
		
		
		
		
		
	}

}
