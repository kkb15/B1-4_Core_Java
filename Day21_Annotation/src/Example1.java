class Animal{
	void eat() {
		System.out.println("eat Something");
	}
}
class Dog extends Animal{
	@Override
	void eat() {
		System.out.println("eat Dogfood");
	}
}
public class Example1 {

	public static void main(String[] args) {
		Animal a=new Dog();
		a.eat();

	}

}
