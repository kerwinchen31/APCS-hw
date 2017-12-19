import java.util.ArrayList;

public class SortTester
{
    public static ArrayList populate( int size, int lo, int hi ) {
	ArrayList<Integer> retAL = new ArrayList<Integer>();
	while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
	}
	return retAL;
    }
    //randomly rearrange elements of an ArrayList
    public static void shuffle( ArrayList al ) {
	int randomIndex;
	for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
	    randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
	    al.set( i, al.set( randomIndex, al.get(i) ) );
	}
    }
    public static void main(String[] args){
	ArrayList one = populate(10, 1, 1000);
	ArrayList two = populate(10, 1, 1000);
	ArrayList three = populate(10, 1, 1000);
	System.out.println("Bubble Sort");
	System.out.println(one);
	MySorts.bubbleSortV(one);
	System.out.println(one);

	System.out.println("Selection Sort");
	System.out.println(two);
	MySorts.selectionSortV(two);
	System.out.println(two);

	System.out.println("Insertion Sort");
	System.out.println(three);
	MySorts.insertionSortV(three);
	System.out.println(three);
    }
}
