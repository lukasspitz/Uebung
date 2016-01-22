import java.util.ArrayList;
import java.util.ListIterator;
public class ListeAusgeben {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Integer> liste = new ArrayList<Integer>();
	for (int i=10;i<1001;i=i+10){
    liste.add (i);}
    
	// *ListIterator<Integer> li =
	//*		 liste.listIterator();
		//*	while(li.hasNext()) {
		//*	System.out.println(li.next());
		//*	} 
    
			for(int ausgabe : liste)
			{
			System.out.println(ausgabe);
			} 
	}

}
