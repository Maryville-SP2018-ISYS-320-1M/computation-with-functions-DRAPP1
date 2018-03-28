/*
    ISYS 320
	Name(s): Dave Rapp
	Date: 3-26-18
*/

/*
 1. Your output prediction (do yourself a favor and go step by step through the code, recording the value of each variable at each method call):
  I honestly have no idea what this program is going to do. My wild guess is that it will print the results of the computations based on the code
  
 */

/*
 3. Were you correct? Explain if you were not (what did you learn?)
 Yes I was although I was very generic in my prediction. Still having trouble with this though.
 
 
 */
public class P1_MysteryReturn {
	public static void main(String[] args) {
        int x = 1, y = 2, z = 3;
        z = mystery( x, z, y);
        System.out.println( x + " " + y + " " + z);
        x = mystery( z, z, x);
        System.out.println( x + " " + y + " " + z);
        y = mystery( y, y, z);
        System.out.println( x + " " + y + " " + z);

    }
    
    public static int mystery( int z, int x, int y) {
        z--;
        x = 2 * y + z;
        y = x - 2;
        System.out.println(y + " " + z );
        return x;
    }

}
