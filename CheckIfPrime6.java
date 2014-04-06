//Written by Nader K
//Date: 02/01/2012
//purpose: This program prompts the user to input a positive integer,
//			it then outputs a message indicating whether the number is a prime number or not.



import java.util.*;

import javax.swing.JOptionPane;

public class CheckIfPrime6
{

	
  	public static void main(String[] args)
    {
  			int num =0;
 		 	String numString;
						
			numString = JOptionPane.showInputDialog("Enter a positive number:");// Prompt the user to enter a positive integer.
			
			num = Integer.parseInt(numString);
  					
			
			while(num<1) // keep prompting for a positive integer.
			{
				numString = JOptionPane.showInputDialog(null,"Number entered is not positive."+"\n"+"Enter a positive number:", JOptionPane.WARNING_MESSAGE);// Prompt the user to enter a positive integer.
			
			num = Integer.parseInt(numString);
			}
			if(num ==1)// check to see if the number is one.
			
			JOptionPane.showMessageDialog(null,"Number is not prime!", "Prime Number Analysis", JOptionPane.PLAIN_MESSAGE);	// the number 1 is not prime.	
			else if(num==2)// 2 is the only even number that is prime,
			JOptionPane.showMessageDialog(null,"Number is prime!", "Prime Number Analysis", JOptionPane.PLAIN_MESSAGE);//so if expression is true, the number is 2 and is prime.

			else if (num%2==0)// check to see if the number is even, and rule out even numbers.
			JOptionPane.showMessageDialog(null,"Number is not prime!", "Prime Number Analysis", JOptionPane.PLAIN_MESSAGE);// all even numbers (other than 2) are NOT prime.
			
			else
			{
			boolean isPrime = true;
			int sqrt = (int)Math.pow(num, 0.5);	// find the square root of the number.
			for(int i=3; i<=sqrt; i+=2) // 
							
				if(num%i==0) // check if the number is divisible by any odd integer less than or equal to its square root.
				{
					isPrime = false;
					
					break;
				
				}
				if (isPrime)
					{
						JOptionPane.showMessageDialog(null,"Number is prime!", "Prime Number Analysis", JOptionPane.PLAIN_MESSAGE);//if number is not divisible by odd integer, then it is prime.
					}				
				else	JOptionPane.showMessageDialog(null,"Number is not prime!", "Prime Number Analysis", JOptionPane.PLAIN_MESSAGE);//if number is divisible by any odd integer less than
																			//or equal to the square root of the number, then it is not PRIME!
			
			}//end else
			
			
			System.exit(0);
			
	 }//end main


}//end class