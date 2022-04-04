abstract class Animal{
	abstract void eat();
}
class Herbivores extends Animal{
	void eat() {
		System.out.println("I am Vegiterian");
	}
}
class Carnivores extends Herbivores{
	void jung() {
		System.out.println("I am Non-Vegiterian");
	}
}
public class Abstraction {

	public static void main(String[] args) {
      Carnivores c=new Carnivores();
      c.eat();
      c.jung();
      Herbivores h=new Herbivores();
      h.eat();
      


	}

}
