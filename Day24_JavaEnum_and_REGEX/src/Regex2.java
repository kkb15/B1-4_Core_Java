import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("I");
		Matcher m=p.matcher("I Love India and New Delhi is Capital of India");
		while(m.find()) {
			System.out.println("Pattern found from "+m.start()+ "to"+(m.end()-1));
		}

	}

}
