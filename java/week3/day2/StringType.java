package week3.day2;

public class StringType {

	public static void main(String[] args) {
		
		String value="String methods";
			//1.split()  o/p Sring mehods
			
			String[] split = value.split("t");
			
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]);
		}
	 
			System.out.println();
			
			//2.replace()  's' 'S'
		
		String replace = value.replace('s', 'S');
		System.out.println(replace);
		
			//3.substring() (3,9)
		
		String substring = value.substring(3, 9);
		System.out.println(substring);
	}

}
