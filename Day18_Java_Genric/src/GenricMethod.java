
public class GenricMethod {
	public static<E>void print(E[]elements)
	{
		for(E itr:elements) {
			System.out.println(itr);
		}
		
	}

	public static void main(String[] args) {
		Integer[] arr= {11,31,35};
		Character[] arr1= {'a','e','d'};
		print(arr);
		print(arr1);

	}

}
