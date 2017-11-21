//Kerwin Chen
//APCS1 pd1
//Hw37 -- Be More Rational
//2017-11-21
public class Rational
{
    //   Instance variables for the numerator and denominator
    private int _numerator;
    private int _denominator;


    // Default constructor (no parameters)
    // creates a new Rational with the value of 0/1
    public Rational()
    {
	_numerator = 0;
	_denominator = 1;
    }


    // Constructor
    // takes 2 parameters, one for the numerator, one for the denominator
    // if an invalid denominator is attempted, should print a message and set the number to 0/1
    public Rational( int n, int d )
    {
	this();
	if ( d != 0 ) {
	    _numerator = n;
	    _denominator = d;
	}
	else {
	    System.out.println( "Invalid number. " +
				"Denominator set to 1." );
	}
    }


    // toString
    // returns a string representation of the rational number (formatting of your choice)
    public String toString()
    {
	return _numerator + " / " + _denominator;
    }


    // floatValue
    // returns floating point approximation of the number
    // uses the most precise floating point primitive
    public double floatValue()
    {
	return (double)_numerator / _denominator;
    }


    // multiply
    // takes 1 Rational object as a parameter and multiplies it by this Rational object
    // does not return any value
    // should modify this object and leave the parameter alone (see below for example)
    // need not reduce the fraction
    public void multiply( Rational r )
    {
	_numerator   = this._numerator   * r._numerator;
	_denominator = this._denominator * r._denominator;
    }


    // divide
    // works the same as multiply, except the operation is division
    public void divide( Rational r )
    {
	if ( r._numerator != 0 ) {
	    _numerator   = _numerator   * r._denominator;
	    _denominator = _denominator * r._numerator;
	}
	else {
	    System.out.println( "Div by 0 error. Values unchanged." );
	}
    }
    //method that finds the max of two numbers
    public static int max(int a, int b){
	if ((a-b)<0){
	    return b;
	}else{
	    return a;
	}
    }
    //method that finds the min of two numbers
    public static int min(int a, int b){
	if ((a-b)<0){
	    return a;
	}else{
	    return b;
	}
    }
    //method that finds the gcd of two numbers
    public static int gcd(int a, int b){
	int large = max(a,b);
	int small = min(a,b);
	if (small == 0){
	    return large;
	}else{
	    return gcd(large-small, small);
	}
    }
    //method that adds a rational number to this raitonal number
    public void add( Rational r){
	_numerator = (this._numerator*r._denominator) + (r._numerator*this._denominator);
	_denominator = this._denominator * r._denominator;
    }
    //mehod that subtracts a rational number from this rational number
    public void subtract( Rational r){
	_numerator = (this._numerator*r._denominator) - (r._numerator*this._denominator);
	_denominator = this._denominator * r._denominator;
    }
    //simplifices a rational number
    public void reduce(){
	int factor = gcd(this._numerator,this._denominator);
	_numerator = this._numerator / factor;
	_denominator = this._denominator / factor;
    }
    //compares two rational number and their values
    public int compareTo(Rational r){
	double  a = this.floatValue();
	double  b = r.floatValue();
	if (a == b){
	    return 0;
	}else if(a > b){
	    return 1;
	}else{
	    return -1;
	}
    }

    //main method for testing
    public static void main(String[] args)
    {
	Rational r = new Rational( 3, 7 );
	Rational s = new Rational();
	Rational t = new Rational( 8, 5 );

	Rational u = new Rational( 1, 2 );
	Rational v = new Rational( 2, 3 );
	Rational w = new Rational( 8, 12 );
	r.add(t);
	System.out.println(r);
	r.subtract(t);
	System.out.println(r);

	System.out.print(t.compareTo(u));

    }
}//end class
