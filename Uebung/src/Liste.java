
public class Liste {

	private Listen kopf; 
	
	public Liste (int wert){
	kopf=new Listen(wert);
}
	public void add (int wert){
	kopf.add (new Listen(wert));
	}
	public String toString(){
		return kopf.toString();
	}
}
