package Com.intermediaire;

public class Test {


	public static void main(String[] args) {
		Personne p1 = new Personne("edwige","gaelle");
		try{
			p1.setAge(10);
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
			//e.printStackTrace();
			
		}
		
		System.out.println("je ne vais pas apparaitre");
	}

}