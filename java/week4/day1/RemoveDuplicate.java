package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
      String myname="SEENIVASAN";
      char[] my = myname.toCharArray();
      
      Set<Character>fullname = new LinkedHashSet<Character>();
      
      for (Character character : my) {
		fullname.add(character);
		
	}
      System.out.println(fullname);
      for (Character name : fullname) {
		System.out.print(name);
	}
	}

}
