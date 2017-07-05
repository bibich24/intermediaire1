package Com.intermediaire;

public class LampeTest {

	
	public static void main(String[] args) {
		Lampe lampe = new Lampe(false);
		Interrupteur interrupteur = new Interrupteur(lampe);
		System.out.println(lampe.estAllumee());
		System.out.println(interrupteur.getPosition());
		
		interrupteur.changerPosiion();
		System.out.println(lampe.estAllumee());
		System.out.println(interrupteur.getPosition());
		
		interrupteur.changerPosiion();
		System.out.println(lampe.estAllumee());
		System.out.println(interrupteur.getPosition());
	}
	

}
