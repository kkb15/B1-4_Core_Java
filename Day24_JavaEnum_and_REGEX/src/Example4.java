interface Pizza{
	 void print();
}
enum size implements Pizza{
	small,medium,Large,Extralarge;
	public void print() {
		System.out.println("size is:"+this);
	}
}
public class Example4 {

	public static void main(String[] args) {
		size.Extralarge.print();

	}

}
