package Polymorphism;

public class Renault {
	String color;
	int speed;
	Renault(){
		System.out.println("Reanult car");
	}
	Renault(int a,String z){
		color=z;
		speed=a;
		System.out.println(color+","+speed);
	}
	

	public static void main(String[] args) {
		Renault r=new Renault();
		Renault s=new Renault(72,"Red");
		

	}

}
