import java.util.ArrayList;

public class Lembda4 {

	public static void main(String[] args) {
		ArrayList<Integer>obj=new ArrayList<>();
		obj.add(34);
		obj.add(35);
		obj.add(63);
		System.out.println(obj);
		obj.forEach((n)->{
			System.out.println(n);
		});

	}

}
