import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Regex5 {

	    static String regex="Nagpur";
		static String str="I love Nagpur"+" Nagpur famous for Oranges";
		static String replace="Amaravati";
		public static void main(String[] args) {
			try {
				Pattern p=Pattern.compile(regex);
				Matcher m=p.matcher(str);
				
				str=m.replaceAll(replace);
				System.out.println(str);
			}
			catch(PatternSyntaxException e) {
				System.out.println("Pattern Syntax Exception"+e.getDescription());
				System.out.println("INdex"+e.getIndex());
				System.out.println("Message"+e.getMessage());
				
			}

	}

}
