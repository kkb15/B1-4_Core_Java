import java.util.regex.Pattern;

public class splitmethod {

	public static void main(String[] args) {
		String str="I1Love3Mumbai";
		String delimiter="\\d";
		Pattern p=Pattern.compile(delimiter,Pattern.CASE_INSENSITIVE);
        String[] res=p.split(str);
        for(String i:res) {
        	System.out.println(i);
        }
	}

}
