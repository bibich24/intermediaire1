package Com.intermediaire;

import java.util.Scanner;

public class TriTest {

	public static void main(String[] args) {
		Tri  tab = new Tri();
		String reponse;

		Scanner input = new Scanner(System.in);
		tab.remplir();
		tab.affichage();
		System.out.println("\nVoulez-vous trier ce tableau ? [oui] / [non]");
	reponse = input.nextLine();
	if (reponse.compareTo("oui") == 0) {
			tab.trier();
			tab.affichage();
		}
	}
}
