///////////////Julius brown
package notes;

import java.util.Scanner;

public class lab5 { //defines name of the program
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
	System.out.println("How much money would you like to spend on chocolate from the vending machine?");
//prompting users input
	 int dollars = input.nextInt();

	 if (dollars <= 0) {
         System.out.println("Error: Invalid amount. Exiting the program!");
         input.close();
         return; // Exit the program
     }
	 
	 
	 
	 int chocolateBars = dollars; // initial chocolate bars bought
	 int coupons = dollars;// each bar giving one coupon
	 //redeems coupons 
	 while (coupons >=6) {
	    int extraBars = coupons / 6;
	 chocolateBars += extraBars;
	 coupons = coupons % 6 + extraBars;
	 
	 
	 //final output 
	 System.out.println("you can buy " + chocolateBars + " chocolate bars and will have " + coupons + " coupons left");
	 
 } System.out.println("1 dollar = 1 chocolate bar = 1 coupon");
 System.out.println("6 coupons = 1 chocolate bar and 1 coupon");

input.close();


}
}