/***
 * class Matrix -- models a square matrix
 *
 * BACKGROUND:
 * A matrix is a rectangular array.
 * Its dimensions are numRows x numColumns.
 * Each element is indexed as (row,column): 
 *  eg,
 *   for 2 x 3 matrix M:
 *        -       -
 *   M =  | a b c |
 *        | d e f |
 *        -       -
 *   ... d is at position (2,1) or M[2,1] 
 *
 * TASK:
 * Implement methods below, categorize runtime of each. 
 * Test in main method.
 ***/
//Kerwin Chen
//APCS1 pd1
//hw57 -- How Deep Does the Rabbit Hole Go?
//2017-12-20

public class Matrix 
{
  //constant for default matrix size
  private final static int DEFAULT_SIZE = 2;

  private Object[][] matrix;

    //default constructor intializes a DEFAULT_SIZE*DEFAULT_SIZE matrix
    public Matrix( ) 
    {
	matrix = new Object[DEFAULT_SIZE][DEFAULT_SIZE];
    }


  //constructor intializes an a*a matrix
  public Matrix( int a ) 
  {
      matrix = new Object[a+1][a+1];
  }


  //return size of this matrix, where size is 1 dimension
  private int size() 
  {
      int ans = 0;
      for(Object x:matrix)
	  ans++;
      return ans;
  }


  //return the item at the specified row & column   
  private Object get( int r, int c ) 
  {
      return matrix[r-1][c-1];
  }


  //return true if this matrix is empty, false otherwise
  private boolean isEmpty() 
  {
      boolean ans = true;
      for (int x = 1; x< this.size();x++){
	  for (int y = 1; y < this.size();y++){
	      if (get(x,y)!= null)
		  ans = false;
	  }
      }
      return ans;
  }


  //overwrite item at specified row and column with newVal
  //return old value
  private Object set( int r, int c, Object newVal ) 
  {
      Object oldVal = matrix[r-1][c-1];
      matrix[r-1][c-1] = newVal;
      return oldVal;
  }


  //return String representation of this matrix
  // (make it look like a matrix)
  public String toString() 
  {
      String ans = "";
      for(int x = 1; x<this.size(); x++){
	  for(int y = 1;y <this.size(); y++){
	      ans += get(x,y);
	      ans += " ";
	  }
	  ans += "\n";
      }
      return ans;
  }


  //override inherited equals method
  //criteria for equality: matrices have identical dimensions,
  // and identical values in each slot
  public boolean equals( Object rightSide ) 
  {
      if (!(rightSide instanceof Matrix) || this.size() != ((Matrix) rightSide).size())
	  return false;
      for (int x = 1; x < this.size(); x++){
	  for (int y = 1; y < this.size(); y++){
	      if (this.get(x,y) != ((Matrix) rightSide).get(x,y))
		  return false;
	  }
      }
      return true;
  }


  //swap two columns of this matrix 
  //(1,1) is top left corner of matrix
  //row values increase going down
  //column value increase L-to-R
  public void swapColumns( int c1, int c2  ) 
  {
      int a = size();
      while (a != 0){
	  this.set(a,c1,this.set(a,c2, c1));
	  a--;
      }
  }


  //swap two rows of this matrix 
  //(1,1) is top left corner of matrix
  //row values increase going down
  //column value increase L-to-R
    public void swapRows( int r1, int r2  ) 
    {
	//still buggy
	int a = size();
	while (a != 0){
	    this.set(r2, (int) this.set(r1, a,get(r2,a)),r1);
	    a--;
	} 
    }


  //main method for testing
  public static void main( String[] args ) 
  {
      Matrix foo = new Matrix(3);
      foo.set(1, 1, 1);
      foo.set(2, 1, 2);
      foo.set(3, 1, 3);
      foo.set(1, 2, 4);
      foo.set(1, 3, 5);
      foo.set(2, 2, 6);
      foo.set(2, 3, 7);
      foo.set(3, 2, 8);
      foo.set(3, 3, 9);
      System.out.println(foo);
      foo.swapRows(1,3);
      System.out.println(foo);
  }

}//end class Matrix
