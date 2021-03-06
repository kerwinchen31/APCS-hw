//Kerwin Chen
//APCS1 pd1
//HW38 -- Put It Together
//2017-11-22
/*
Essentailly, what I did was I created a 2d array, wrote a method to populate it,
wrote a method that printed out the elements in a concise way, and also wrote
a method that allows the user to give an input on which two elements to swap.
I made this perpetuate to infinity so the user can keep on swapping, but they
can easily exit using the keyboard shortcut C-c
*/
/*
for version 2, I made horizontal vs vertical changes more understandble to the user.
I did this by previding clear explanations on exactly what to do.
I tried using the color thing someone posted on the quaf but the colors wouldn't render
in the command line thing so I left it out.
*/
import cs1.Keyboard;

public class Swapper{
    static String[][] box = new String[4][5];
    static final String LETTERS = "qwertyuiopasdfghjklzxcvbnm";

    //fills the array with "unique 3 character Strings
    public static void fill(){
	for(int x = 0;x != box.length;x++){
	    for(int y = 0;y != box[x].length;y++){
		int q = (int)(Math.random()*LETTERS.length()-1);
		int r = (int)(Math.random()*LETTERS.length()-1);
		int s = (int)(Math.random()*LETTERS.length()-1);
		String tempq = LETTERS.substring(q,q+1);
		String tempr = LETTERS.substring(r,r+1);
		String temps = LETTERS.substring(s,s+1);
		box[x][y] = tempq + tempr + temps;
	    }
	}
    }
    //prints the array in a pretty format
    public static String print(String[][] x){
	String ans = "";
	for(String[] q:x){
	    for (String v:q){
		ans += v;
		ans += " ";
	    }
	    ans += "\n";
	}
	return ans;
    }
    //swaps two Strigns in the array;
    public static void swap(int fr, int fc, int sr, int sc){
	String temp = box[fr-1][fc-1];
	box[fr-1][fc-1] = box[sr-1][sc-1];
	box[sr-1][sc-1] = temp;
    }
    public static void main(String[] args){
	fill();
	int n = 0;
	System.out.println(print(box));
	//perpetuates swapping
	while (n == 0){
	    System.out.println("Press Ctrl+C to exit anytime");
	    System.out.println("Pick 2 elements to swap. Let's call them A and B");
	    System.out.println("Rows are horizontal, from top to bottom starting with 1");
	    System.out.println("What is the row# of A?"); 
	    int fr = Keyboard.readInt();
	    System.out.println("Columns are vertical; from left to right starting with 1");
	    System.out.println("What is the column# of A?"); 
	    int fc = Keyboard.readInt();
	    System.out.println("What is the row# of B?"); 
	    int sr = Keyboard.readInt();
	    System.out.println("What is the column# of B?"); 
	    int sc = Keyboard.readInt();
	    swap(fr,fc,sr,sc);
	    System.out.println("\nNew Array: \n");
	    System.out.println(print(box));
	}
    }
}
