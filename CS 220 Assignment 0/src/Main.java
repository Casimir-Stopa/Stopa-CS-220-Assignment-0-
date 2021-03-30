//This program implements design problem 1
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		
		//collects the list of all infected people
		AllPeople a = new AllPeople(); 

		
		// Some infected people represented with their ID numbers
		InfectedPeople p1 = new InfectedPeople("123");
		InfectedPeople p2 = new InfectedPeople("456");
		InfectedPeople p3 = new InfectedPeople("789");
	    
		System.out.println(a.size()); //checks that no one is in the list, as it should be
		
		a.add(p3);
		System.out.println(a.size()); //checks that people can be added
		
		a.add(p2);
		System.out.println(a.size()); //checks that multiple people can be added
		
		a.add(p3);
		System.out.println(a.size()); //checks that the same person can't be added twice
		
		a.add(p1);
		System.out.println(a.size()); //checks that people can still be added after an attempt at a double add


		

	}

}
