/********************************
 * class OrderedArrayList
 * wrapper class for ArrayList.
 * Imposes the restriction that stored items 
 * must remain sorted in ascending order
 ********************************/

//Kerwin Chen
//APCS! pd1
//HW47 -- ascending
//2017-12-5

//ArrayList's implementation is in the java.util package
import java.util.ArrayList;

public class OrderedArrayList
{
    // instance of class ArrayList, holding objects of type Comparable 
    // (ie, instances of a class that implements interface Comparable)
    private ArrayList<Comparable> _data;


    // default constructor initializes instance variable _data
    public OrderedArrayList()
    {
	_data = new ArrayList<Comparable>();
    }


    public String toString()
    {
	String ans = "[ ";
	for(Comparable x: _data){
	    ans += x;
	    ans += ", ";
	}
	return ans + "]";
    }


    public Comparable remove( int index )
    {	
	Comparable a = _data.get(index);
	for(int x = index;x<_data.size();x++){
	    _data.add(x,_data.get(index+1));
	}
	return a; //placeholder 
    }

    public int size(){
	return _data.size();
    }
    
    public Comparable get( int index )
    { 
	return _data.get(index); //placeholder  
    }

    public void add(Comparable newVal)
    {
	int q = 0;
	int w = _data.size();
	if (_data.size() == 0){
	    _data.add(newVal);
	}else{
	    while(q != w && newVal.compareTo(_data.get(q))>0){
		q++;
	    }
	}
	_data.add(q,newVal);	    	    
    }

    // main method solely for testing purposes
    public static void main( String[] args )
    {

	OrderedArrayList Franz = new OrderedArrayList();

	// testing linear search
	for( int i = 0; i < 15; i++ )
	    Franz.add( (int)( 50 * Math.random() ) );
	System.out.println( Franz );

	//check for sorted-ness
	//if msg does not appear, list was sorted
	for( int i=0; i<Franz.size()-1; i++ ) {
	    System.out.println("at i: " + Franz.get(i) );
	    if ( Franz.get(i).compareTo(Franz.get(i+1)) > 0 ) {
		System.out.println( " *** NOT sorted *** " );
		break;
	    }
	}

    }//end main()

}//end class OrderedArrayList
