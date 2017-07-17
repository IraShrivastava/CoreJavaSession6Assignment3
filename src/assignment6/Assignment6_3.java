package assignment6;	//package declaration
import java.util.Scanner;
public class Assignment6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c, first, last, middle, n, search, array[];		//integer variable declaration
		Scanner in = new Scanner(System.in);	//scanner to take input from user
	    System.out.println("Enter size of array");
	    n = in.nextInt(); 	//input the size of array
	    array = new int[n];	//initialize size of array
	    System.out.println("Enter " + n + " integers");
	    for (c = 0; c < n; c++)
	      array[c] = in.nextInt();	//inputting elements into array in ascending order
	    System.out.println("Enter value to find");
	    search = in.nextInt();	//input the elements to search in array
	    first  = 0;
	    last   = n - 1;
	    while( first <= last )
	    {
	    	middle = (first + last)/2;
	    	if ( array[middle] < search )
	        first = middle + 1;    
	    	else if ( array[middle] == search )		//to search if array element is equal to searched element 
	    	{
	    		System.out.println(search + " found at location " + (middle + 1) + ".");
	    		break;
	    	}
	    	else
	    	{
	    		last = middle - 1;
	    	}
	    }
	    if ( first > last )
	      System.out.println(search + " is not present in the list.\n");
	}
}