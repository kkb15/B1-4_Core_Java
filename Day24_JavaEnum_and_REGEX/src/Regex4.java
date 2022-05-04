
import java.util.Scanner;

public class Regex4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="I Love Mumbai \r\nSoujan\r\nHrithik";
		String[] res=str.split("\\r?\\n");
        for(String i:res) {
        	System.out.println(i);
        }
        sc.close();
	}

}
