import java.util.*;
public class QuickSort{
    
    public static void quicksort(int[] a){
		
		int L = 0;
		int R = a.length;
		int wall = partition(a , L , R);
		System.out.println(Arrays.toString(a));
			//unable to fidgure out how to get the thing to work recirsively
	}

    public static int partition(int[] a, int L, int P){
	
	if ( (P-L) < 1){
		return -1;
	}
	else{
	int wall = 0;

	int R = P - 1;
	
	Random butt = new Random();
	int partPlace = butt.nextInt(R);
	
	int part = a[partPlace];
	System.out.println(part);
	int temp = a[R];
	a[R] = part;
	a[partPlace] = temp;

    
	for(int i = L; i< R; i++){
	    if(a[i] < part){
		int temp2 = a[wall];
		a[wall] = a[i];
		a[i] = temp2;
		wall++;
	    }

	}

	int temp3 = a[wall];
	a[wall] = part;
    	a[R] = temp3;

	System.out.println(Arrays.toString(a));
	System.out.println(wall);
	
	return wall;
	}
	
    }

    public static void main(String[] args){
	int[] butt = {6, 13, 2,7, 17, 56, 1, 73,2, 74,8};
	quicksort(butt);
    }
}