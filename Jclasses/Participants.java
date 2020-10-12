import java.util.*;

public class Participants{
	public Participants(){
		Vector<String> parts = new Vector<String>();
		parts.add("Tesfaye");
		parts.add("Bitweded");
		parts.add("Yosef");
		Iterator itr = parts.listIterator();
		while(itr.hasNext()){
		    	System.out.println(itr.next());
		}
		// you can also use ArrayList to add participants
		ArrayList ar = new Arraylist();
	}
	public static void main(String []args){
		System.out.println("Participants:");
		new Participants();
	}
}

