import java.util.Arrays;
import java.util.List;



public class Example2 {

	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(23,42,55,32,23);
		values.stream().filter(i->i<35).forEach(i->System.out.println(i));
		values.stream().distinct().forEach(i->System.out.println(i));
		values.stream().limit(4).forEach(i->System.out.println(i));

	}

}
