//Kerwin Chen
//APCS1 pd1
//HW46 -- Al<B> Sorted!
//2017-12-4
import java.util.ArrayList;
import java.util.Arrays;

public class ALTester{
    static int[] a = new int[23];
    public static void popArray(int[] b){
	int length = b.length;
	for (int x = 0; x<length; x++){
	    b[x] = (int)(23*Math.random());
	}
    }
    public static boolean sorted(int[] b){
	int length = b.length;
	boolean ans = true;
	for (int x = 0;x<length-1;x++){
	    if (!(b[x]>=b[x+1]))
		ans = false;
	}
	return ans;
    }
    public static void main(String[] args){
	popArray(a);
	System.out.println(Arrays.toString(a));
	System.out.println(sorted(a));
    }
}
