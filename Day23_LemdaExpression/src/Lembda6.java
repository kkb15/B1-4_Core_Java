interface D{
	int mal(int x,int y);
}
public class Lembda6 {

	public static void main(String[] args) {
		D obj=(x,y)->(x*y);
		System.out.println(obj.mal(20,30));
	}

}
