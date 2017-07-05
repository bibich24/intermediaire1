package Com.intermediaire;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;



public class MyList {

	
	public static void main(String[] args) {
		List<String> chaine = new ArrayList<String>();
		ListIterator<String> it = chaine.listIterator();
		
		chaine.add("un");
		chaine.add("deux");
		chaine.add("trois");
		chaine.add("quatre");
		
		chaine.add(1,"avat deux");
		chaine.set(3, "oui");
		
//		for(int i = 0; i< chaine.size();i++){
//			System.out.println(chaine.get(i));
//		}
//		
		while(it.hasNext()){
			String element = it.next();
			it.add(element + "et demi");
		}
		for (String string : chaine) {
			System.out.println(string);
			
		}
	}

}
