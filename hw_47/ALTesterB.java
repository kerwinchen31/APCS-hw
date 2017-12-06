//Kerwin Chen
//APCS! pd1
//HW47 -- ascending
//2017-12-5
import java.util.ArrayList;

public class ALTesterB{

    public static void popA(ArrayList<Comparable> a){
	a.add((int)(Math.random()*100));
	for (int i = 1; i < 23; i++){
	    int q = (int) (Math.random()*100);
	    while (q<(int)a.get(i-1)){
		q = (int) (Math.random()*100);
	    }
	    a.add(i,q);
	}
    }
    public static void popB(ArrayList<Comparable> a){
	a.add((int)(Math.random()*100));
	for(int i = 1; i < 23; i++){
	    int q = (int) a.get(i-1);
	    a.add(i,1+ q + (int)(Math.random()*10));
	}
    }
    
    public static void main( String [] args ){
	ArrayList<Comparable> foo = new ArrayList<Comparable>();
	ArrayList<Comparable> moo = new ArrayList<Comparable>();
	//populates foo
	popA(foo);
	popB(moo);
	System.out.println(foo);
	System.out.println(moo);
	//checks if foo is sorted
    }//end main

}
