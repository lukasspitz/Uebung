
public class Listen {
private int inhalt;
private Listen next;

public Listen (int inhalt){
this.inhalt = inhalt;}

public void add (Listen neu){
if(next==null){next=neu;}
else{ next.add(neu);
}
}
public String toString(){
	if(next==null)
	{	
		return ""+inhalt;
	}
else { return ""+inhalt+" "+next.toString();

}
}
}