enum Bike{
		Pulser,R15,Rx100,Bullet,Activa
	}
public class Example3 {
public static void main(String[] args) {
		Bike c=Bike.Activa;
		switch(c) {
		case Pulser:
			System.out.println("Pulser Bike");
			break;
		case R15:
			System.out.println("R15 Bike");
			break;
		case Bullet:
			System.out.println("Royal Enfield Bike");
			break;
		case Rx100:
			System.out.println("Rx100 Bike");
			break;
			default:
				System.out.println("Not bike");
				break;
		
		}

	}

}
