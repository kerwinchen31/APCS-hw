/***************************
 * interface ListInt
 * Declares methods that will be implemented by any
 *  class wishing to adhere to this specification.
 * This interface specifies behaviors of a list of ints.
 ***************************/
// Kerwin Chen
// APCS1 pd1
// HW45 -- In America, The driver sits on the Left
// 2017-12-4
public interface List
{
  // Return number of elements in the list
  int size();

  // Append an object to the end. Return true.
  boolean add( java.lang.Object x );

  // Retrieve the object at index
  java.lang.Object get( int index );

  // Overwrite the object at index
  java.lang.Object set( int index, java.lang.Object x );

}//end interface List
