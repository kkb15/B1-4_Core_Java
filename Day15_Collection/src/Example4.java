import java.util.ArrayList;
public class Example4 {

	public static void main(String[] args) {
		ArrayList<Integer> obj=new ArrayList<>(2);
		obj.add(20);
		obj.add(45);
		obj.add(25);
		obj.add(63);
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.indexOf(25));
		System.out.println(obj.lastIndexOf(45));
		System.out.println(obj.get(1));
		System.out.println(obj.set(2,98));
		System.out.println(obj);
		System.out.println(obj.contains(25));
		System.out.println(obj.isEmpty());
		

	}

}
