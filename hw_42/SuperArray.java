// Team Aha! (Kerwin Chen, Selina Zou)
// APCS1 pd1
// HW42:_Array of Grade 316
// 2017-11-29 (Happy birthday to Boss Zou!)

/***************************
 * class SuperArray version 2.0
 * (SKELETON)
 * Wrapper class for array. Facilitates resizing,
 * resizing
 * expansion
 * read/write capability on elements
 * adding an element to end of arrayx
 * adding an element at specified index
 * removing an element at specified index
 ***************************/

public class SuperArray
{

    private int[] _data;  //underlying container
    private int _size;    //number of elements in this SuperArray


    //default constructor - initializes 10-item array
    public SuperArray()
    {
	_data = new int[10];
	_size = 0;
    }


    //output SuperArray in [a,b,c] format
    //I don't know how to track which indexes are meaningful
    //and which aren't, if they're sandwiched
    //so I reverted to _data.length instead of _size in this toString
    //since my add method allows skipping of meaningless slots
    public String toString()
    {
	String foo = "[";
	for( int i = 0; i < _data.length; i++ ) {
       	    foo += _data[i] + ",";
	}
	
	//shave off trailing comma
	foo = foo.substring( 0, foo.length()-1 );
	foo += "]";
	return foo;
    }

    //increase capacity of SuperArray by designated amt
    //takes input
    private void expand(int slotsAdded)
    {
	int[] temp = new int[ _data.length + slotsAdded ];
	for( int i = 0; i < _data.length; i++ )
	    temp[i] = _data[i];
	_data = temp;
    }

    //adds an item after the last item
    //assuming this adds a slot right after the current rightmost one
    public void add( int newVal )
    {
        expand(1);
	_data[_data.length - 1] = newVal;
    
	_size++;//inc _size by 1
    }


    //inserts an item at index
    //shifts elements right to make space
    public void add( int index, int newVal )
    {
	//makes sure SuperArray has capacity to store at index
	if(index >= _data.length)
	    expand(index - _data.length + 1);
	else
	    expand(1);
	
	for(int x = _data.length - 1; x > index; x--)
	    _data[x] = _data[x-1];

	//stores val at index
       _data[index] = newVal;
	
	_size++;//inc _size by 1
    }


    //removes the item at index
    //shifts elements left to fill in newly-empted slot
    public void remove( int index )
    {
	for(int x = index; x < _data.length - 1; x++){
	    _data[x] = _data[x+1];
	}
	
	_size--;//dec _size by 1
    }


    //main method for testing
    public static void main( String[] args )
    {
	  SuperArray mayfield = new SuperArray();
	  System.out.println("Printing empty SuperArray mayfield...");
	  System.out.println(mayfield);

	  mayfield.add(5);
	  mayfield.add(4);
	  mayfield.add(3);
	  mayfield.add(2);
	  mayfield.add(1);

	  System.out.println("Printing populated SuperArray mayfield...");
	  System.out.println(mayfield);

	  mayfield.remove(3);
	  System.out.println("Printing SuperArray mayfield post-remove...");
	  System.out.println(mayfield);
	  mayfield.remove(3);
	  System.out.println("Printing SuperArray mayfield post-remove...");
	  System.out.println(mayfield);
	  
	  mayfield.add(3,99);
	  System.out.println("Printing SuperArray mayfield post-insert...");
	  System.out.println(mayfield);
	  mayfield.add(2,88);
	  System.out.println("Printing SuperArray mayfield post-insert...");
	  System.out.println(mayfield);
	  mayfield.add(1,77);
	  System.out.println("Printing SuperArray mayfield post-insert...");
	  System.out.println(mayfield);

    }//end main()


}//end class
