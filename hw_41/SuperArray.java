//Kerwin Chen
//APCS1 pd1
//HW41 -- Array of Steel
//2017-11-28
public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor - initializes 10-item array
  public SuperArray()
  {
      _data = new int[5];
      _size = 5;
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
      String ans = "[";
      for(int x = 0; x < _size; x++){
	  ans += _data[x];
	  ans += ", ";
      }
      ans = ans.substring(0,ans.length()-2);
      ans += "]";
      return ans;
  }


  //double capacity of SuperArray
  private void expand()
  {
      int[] expanded  = new int[_data.length * 2];
      for(int x = 0;x<_data.length;x++){
	  expanded[x] = _data[x];
      }
      _data = expanded;
      _size = _data.length;
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
      return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
      int oldVal = _data[index];
      _data[index] = newVal;
      return oldVal;
  }


  //main method for testing
  public static void main( String[] args )
  {
 
      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );

      for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
      }

      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);

      for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      }

  }//end main()


}//end class
