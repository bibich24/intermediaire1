package Com.intermediaire;

public class Interrupteur {
	private boolean position;
	private Lampe lampe;
	
	public Interrupteur(Lampe lampe){
		this.lampe = lampe;
		this.position = lampe.estAllumee();
		
	}
	public String getPosition(){
		if(position == true){
			return "on";
		}else{
			return "off";
		}
			
	}
	public void changerPosiion(){
		lampe.modifierEtat();
		position = lampe.estAllumee();
	}

}
