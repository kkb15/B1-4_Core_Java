import java.util.ArrayList;
import java.util.LinkedList;
public class Example5 {
	public static void main(String args[]) {
		LinkedList<Integer> obj=new LinkedList<>();
		obj.add(20);
		obj.add(45);
		obj.add(25);
		obj.add(63);
		System.out.println(obj);
		
		LinkedList obj1=new LinkedList<>();
		obj1.add("shiv");
		obj1.add("kamal");
		obj1.addAll(2,obj1);
		
		System.out.println(obj1);
		
		
	}

}
