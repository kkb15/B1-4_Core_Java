import java.util.*;
public class Vector3_addall {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add(23);
		a.add("Zeb");
		a.add(24);
		Vector v=new Vector();
		v.addAll(a);
		System.out.println(v);
	}

}
