package Com.intermediaire;

import java.util.Random;
import java.util.Scanner;


public  class MonTri {
	public static final int taille = 5;
	 static int tab[] = new int[5];
	

	public static void charger(){
		Random rand = new Random();
		for(int i = 0; i < taille;i++){
		tab[i] = rand.nextInt(10);
		
		}
	}

	public static void classer(){
		int temp;
		for(int i=taille-1;i >  0;i--){
			for(int j = 0;j<i;j++){
				if(tab[j] > tab[j + 1]){
					temp = tab[j];
					tab[j] = tab[j+1];
					tab[j+1] = temp;
							
					
				}
			}
		}
		
	}
	

	public static void afficher(int tab[]){
		
		for(int i = 0;i<taille;i++){
			System.out.print(tab[i]);
			if(i !=taille-1)
			System.out.println("-");
			
		}
		
	}

	public static void main(String[] args) {
		MonTri t = new MonTri();
		String reponse;
		 Scanner s = new Scanner(System.in);
		charger();
		afficher(tab);
		System.out.println("\nVoulez-vous trier ce tableau ? [oui] / [non]");
		reponse = s.nextLine();
		if (reponse.compareTo("oui") == 0) {
			classer();
		 	afficher(tab);	
			}
		 
		
		 
	}

}
