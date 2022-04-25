

public class JUnit {
	public static void main(String args[]) {
		JUnit j=new JUnit();
		j.isAgeValid(30);
	}
	public boolean isAgeValid(int age) {
		assert(age<150):"Age entered is: "+age;
		if(age>0) {
			return true;
		}
		else {
			return false;
		}
	}
}
