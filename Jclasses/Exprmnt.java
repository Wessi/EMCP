import java.util.*;

public class Exprmnt{
	public Exprmnt(){
		Vector<String> parts = new Vector<String>();
		parts.add("Tesfaye");
		parts.add("Bitweded");
		parts.add("Yosef");
		
		Iterator itr = parts.listIterator();
		while(itr.hasNext()){
		    	System.out.println(itr.next());
		}
	}
	public static void main(String []args){
	    System.out.println("Participants:");
		new Exprmnt();
	}
}
