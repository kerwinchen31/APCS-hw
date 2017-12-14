//Kerwin Chen
//APCS1 pd1
//hw53 -- Solid Comparative Analysis
//2017-12-14

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
	ArrayList one = new ArrayList<Comparable>();
	one.add(1);
	one.add(2);
	one.add(3);
	/*
	one.add(3);
	one.add(2);
	one.add(1);
	*/
	/* BubbleSort 
best case: Array list is already in ascending order
worse case: Array list is in descending order */
	System.out.println(one);
	MySorts.bubbleSortV(one);
	System.out.println(one);
	/* SelectionSort
	   There is no best case nor worse case, since a swap is incoded to happen regardless */
	System.out.println(one);
	MySorts.bubbleSortV(one);
	System.out.println(one);
	/* insertionSort
Best Case: Array list is already in ascending order
worse case: Array list is in descending order */
	System.out.println(one);
	MySorts.bubbleSortV(one);
	System.out.println(one);
    }
}
