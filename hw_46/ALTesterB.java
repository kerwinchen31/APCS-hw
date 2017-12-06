import java.util.ArrayList;

public class ALTesterB{

    public static String check (ArrayList<Comparable> foo){
	String sortedStatus = "sorted!";
	for( int i = 0; i < foo.size()-1; i++ ){

	    if ( foo.get(i).compareTo(foo.get(i+1)) > 0 )

		sortedStatus = "not sorted!";
	}
	return sortedStatus;
    }

    public static void main( String [] args ){
	ArrayList<Comparable> foo = new ArrayList<Comparable>();
	//populates foo
	for (int i = 0; i < 23; i++){
	    foo.add((int)(Math.random()*100)); // for random
	}
	//prints foo
	System.out.println("array:");
	System.out.println(foo);
	//checks if foo is sorted
	System.out.println(check(foo));
    }//end main

}
