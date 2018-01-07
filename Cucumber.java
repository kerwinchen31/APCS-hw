public abstract class Cucumber{
    private String name;
    private int nutrition, ripeDuration;
    private int value;
    
    public Cucumber(){ //java automatically initializes all instance variables to our desired values
    }
    
    public abstract void grow()
    {
	ripeDuration -= 1;
	value += nutrition;
    }
    public abstract void plant(){
	
    public abstract int getNutrition()
    {
	return nutrition;
    }
    public abstract int getRipeDuration()
    {
	return RipeDuration;
    }
    public abstract int getValue()
    {
	return value;
    }
    public abstract String toString()
    {
	return name + getRipeDuration();
    }
}
    
