
public class Example5 {
	enum Day{
		Sunday, Monday,Tuesday, Wenesday,Thursday, Friday, Saturday
	}

	public static void main(String[] args) {
		Day d=Day.Friday;
		printdisplay(d);
	}
		public static void printdisplay(Day d) {
			if(d==Day.Friday) {
				System.out.println("Same");
			}
			else {
				System.out.println("NOt Same");
			}
		}
		

	}


