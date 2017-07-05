package Com.intermediaire;

import java.util.Scanner;

public class PremierProjet{
	
	private String nom;
	private int age;

public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
	
		this.nom = nom;
	}



public PremierProjet(String nom, int age){
	
	this.age = age;
	
 }


public void setAge(int age){
	Scanner clavier = new Scanner(System.in);
	
	System.out.println("quel est ton age= ");
	int annee = clavier.nextInt();
	
	if(annee <20){
		System.out.println("tu es encore adolescant");
	}
	else{
		System.out.println("tu as deja " + annee + "!" +"bravo t'es deja majeur!");
	}
	
}



public int getAge() {
	
	return age;
}
}
