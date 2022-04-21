
import java.util.Vector;
public class Vector4_setelement {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("india");
		v.add("london");
		v.add(34);
		v.setElementAt(1,3);
		System.out.println(v);
	}

}
