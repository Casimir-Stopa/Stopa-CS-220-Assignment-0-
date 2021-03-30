import java.util.*; 

public class AllPeople { 
	
	
	HashSet<InfectedPeople> set = new HashSet<InfectedPeople>();;  
	
	
	//Adds new infected people to the list of all infected people. I suppose this would a POJO.
	public void add(InfectedPeople p) {
		set.add(p);
	}
	
	//POJO size checker
	public int size() {
		return set.size();
	}


}
