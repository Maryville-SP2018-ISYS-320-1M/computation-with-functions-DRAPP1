/*
ISYS 320
	Name(s):Dave Rapp
	Date: 3-26-18
*/

/*
 What were the errors you found?
 You have to move the print line down otherwise it will not print the computed values
 
 
 */

import java.util.Scanner;

public class P4_FixTempConverter {
	public static void main(String[] args) {
		
		Scanner input = new Scanner ( System.in );
		double tempf = 98.6;
		double tempc = 0.0;
		ftoc(tempf, tempc);
		
	}

	// converts Fahrenheit temperatures to Celsius
	public static void ftoc(double tempf, double tempc) {
	      tempc = (tempf - 32) * 5 / 9;
	      System.out.println("Body temp in C is: " + tempc);
    }
}
