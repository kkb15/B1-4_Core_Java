import java.util.ArrayDeque;
public class Dequeue {

	public static void main(String[] args) {
		ArrayDeque<String> d=new ArrayDeque<>();
		d.add("Kamal");
		d.addFirst("mr.");
		d.addLast("Bhatt");
		System.out.println(d);
		d.removeFirst();
		d.removeLast();
		System.out.println(d);
		System.out.println(d.peek());
		

	}

}
