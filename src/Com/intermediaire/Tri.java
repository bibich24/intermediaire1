package Com.intermediaire;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tri {
	private static final int TAILLE = 10;
	public static int[] tab = new int[TAILLE];

	public void remplir() {
		
		Random alea = new Random();
		for (int i = 0; i < TAILLE; i++) {
			this.tab[i] = alea.nextInt(10);
		}

	}

	public static void trier() {
		int temp=0;
		for(int i =TAILLE-1;i>0;i--){
			for(int j =0;j<i;j++){
				if(tab[j]>tab[j+1]){
					temp = tab[j];
					tab[j] = tab[j + 1];
					tab[j + 1] = temp;
				}
			}
			//System.out.println(Arrays.toString(tab));
			
		}
		
	}
			
				

	public void affichage() {
		
		for (int i = 0; i < TAILLE; i++) {
			System.out.print(this.tab[i]);
			if (i != TAILLE - 1)
				;
			System.out.print(" ");
		}
	}
	

}