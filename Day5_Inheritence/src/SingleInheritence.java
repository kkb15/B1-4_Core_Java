 class Superclass {
	void print() {
		System.out.println("Hi my name is Kamal");
	}
 

class Subclass extends Superclass{
	void display() {
		System.out.println("Inheritence");
	}
}
	
class SingleInheritence{

public  void main(String[] args) {
		Subclass s=new Subclass();
		s.print();
		s.display();
}
	}
 }
