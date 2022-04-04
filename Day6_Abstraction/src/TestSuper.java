class Player{
	Player(){
		System.out.println("Player are");
	}
}
class Team extends Player{
	Team(){
		super();
		System.out.println("Team is");
		
	}
}
class TestSuper{
	public static void main(String args[]) {
		Team t=new Team();
	}
}