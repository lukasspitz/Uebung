
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	int[] unsortiert ={ 4, 1, 8, -3, 5, 7, 58, 6 ,5432, 6, 3, 987, 2, 1, -4, 66, 1337, 3497, 1674,432,433,8,7,341,243,909,101,1011};
     int[] sortiert = selectionsort (unsortiert);
	}

	
	
	
	
     public static int[] selectionsort (int[] sortieren){
     int inc= 0;
     for (int i=0; i< sortieren.length  -1;i++) {
     for (int j= i+1; j< sortieren.length; j++){
     if (sortieren[i] > sortieren[j]){
     int temp = sortieren[i];
    	 sortieren[i] = sortieren[j];
    	 sortieren[j]= temp;
    	 inc++;
    	 ausgabe(sortieren, inc);
    	
     }
     }
    	 
     }
     
     return sortieren;}

     private static void ausgabe (int[]sortieren, int inc){
     System.out.println (inc+". Sortierung");
     for(int i=0; i<sortieren.length; i++){
     System.out.print(sortieren[i]+", ");
     }
     System.out.print("");
     }
     }
     
