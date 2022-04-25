import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class Example1 {

	public static void main(String[] args) {
		//Integer[] arr=new Integer[] {23,42,55,32};
		//Stream<Integer>obj=Arrays.stream(arr);
		List<Integer> value=Arrays.asList(23,42,55,32);
		List<Integer>var=value.stream().map(i->i).collect(Collectors.toList());
		System.out.println(var);

	}

}
