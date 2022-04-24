import java.util.PriorityQueue;
import java.util.Queue;
public class Queue2 {

	public static void main(String[] args) {
	Queue<Integer> q=new PriorityQueue<Integer>();
	q.add(34);
	q.add(35);
	q.add(43);
	q.add(56);
	q.add(64);
	System.out.println(q);
	
	//Peek
	System.out.println("element in top is:"+q.peek());
	
	//Remove top
	System.out.println("Element removed is:"+q.poll());
	System.out.println(q);
	
	//Remove top
	System.out.println("Remove element is:"+q.remove());
	System.out.println(q);
	
	//Sort
	System.out.println("Head of Element:"+q.element());
	System.out.println(q);

	}

}
