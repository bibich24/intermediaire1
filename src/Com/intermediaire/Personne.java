package Com.intermediaire;

public class Personne {

	private String nom;
	private int age;
	private String prenom;
	
	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public static final int NBREOREILLE = 2;
	
	
	public static int nbreTotal = 0;
	
	public Personne(String nom,String prenom){
		this.nom = nom;
		nbreTotal++;
	}
	public String full_name(){
		return (nom + " " + prenom);
		
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 15){
			throw new IllegalArgumentException("L'AGE DOIT ETRE SUPERIEURE A 15 ANS");
		}
			else
			{ this.age = age;}
			
		}
		
	

	public static int getNbreTotal(){
		return nbreTotal;
	}
}
