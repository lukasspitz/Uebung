
public class FibonacciFolge {
    
    public static void main(String[] args){

     
}
	public static long fibonacci (long x) {
    if  (x<=0) {return 0;}
	else if (x==1||x==2) {return 1;}
	else{return(fibonacci(x-2)+fibonacci(x-1));}
}} 