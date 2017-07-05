package Com.intermediaire;


import java.util.Scanner;

public class Exo3Tableau {

	public static void main (String [] args)
	          {
	             Scanner s = new Scanner(System.in);
	                double som = 0; double pgNote = 0; double ppNote = 0; double moy = 0;
	               
	              
	               System.out.println("Entrez un nombre entier, taille du tableau : ");
	              int nombre = s.nextInt();
	              
	
	              double [] tab = new double[nombre];
	             
	
	             System.out.println("Saisissez les notes sur 20 des élèves ");
	           for( int i = 0; i < nombre; i++)
	             {
                 System.out.println("La note numéro " + (i+1) + " est : ");
	                  tab[i] = s.nextDouble();
	                  
	                  som = som + tab[i];
	                  moy = som/nombre;
	                  pgNote = Math.max(pgNote, tab[i]);
	                  ppNote = Math.min(ppNote, tab[i]);
	             }
	             
	             ppNote = tab[0];
	             for(int i = 0; i < nombre; i++)
	             {
	                  ppNote = Math.min(ppNote, tab[i]);
	            }
	             System.out.println("Somme des notes = " + som);
	             System.out.println("Moyenne des notes = " + moy);
	             System.out.println("Plus grande des notes = " + pgNote);
	             System.out.println("Plus petite des notes = " + ppNote);
	         }
}
