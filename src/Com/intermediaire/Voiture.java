package Com.intermediaire;

public class Voiture {
	public String marque;
	public  double prix;
	
	public Voiture(){
		this.marque = marque;
		this.prix = prix;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public void afficher(){
		System.out.println("cette voiture est de marque " 
	+ this.marque + " et son prix est " + prix + " euro");
	}
	

}
