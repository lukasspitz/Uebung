
public class Collatz 
       {

	public static void main(String[] args) 
	   {
			coll(15);
	
	   }
	public static void coll(int number)
	   {
		if(number<0)
	   {
			System.out.println("Die Zahl muss gr��er als 0 sein!");
	   }
		
		if(number%2 == 0 && number != 1)
	   {
			System.out.print(number+" ");
			
			coll(number/2);
	    }else if(number%2 != 0 && number != 1)
	    {
			System.out.print(number+" ");
			
			coll(3*number+1);
		}else{
			System.out.print(1);
		}
		
	
	
	    }
    		
    	
        }

