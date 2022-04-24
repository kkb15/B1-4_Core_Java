import java.util.*;
public class Example {
	public static void main(String args[]) {
		ArrayList<String>l=new ArrayList<String>();
		l.add("Hi");
		l.add("Bye");
		//list.add(34);
		String s=l.get(1);
		System.out.println("element is:"+s);
		
		Iterator<String>i=l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
