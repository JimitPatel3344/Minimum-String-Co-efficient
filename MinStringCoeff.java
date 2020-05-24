
/* This program was created by Jimit Patel on 21-May-2020.
 * Aim - To find co-efficient of the string consisting of only 0’s and 1’s
 * and then compute its minimum co-efficient.
 */

package appletExample;

import java.util.Scanner;

class MinStringCoeff {

	public static void main(String[] args) 
	{

		byte i=0,a=0,b=0,counta,countb;
		
	// To take dynamic input from user.

		  byte s[] = new byte[16];
		  Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter any sixteen bit binary string to find number of ones(1s) between 		 zeros(0s) and zeros(0s) between ones(1s). "); 
     	  	for(byte j=0; j<16; j++)
		  {
			  s[j] = sc.nextByte(); 
		  }
		 
	   /*
	   	*	For static input 
		*	byte s[]  = {0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1};
		*/
     	  
			while(i<s.length-2)
			{
			 // re-setting count variables to zero after each counting.
				counta=0;countb=0; 
				
			/* The following if statement checks and counts number of
			 * ones(1s) between pair of zeros(0s). 
			 */
			    if(s[i] == 0 && s[i+1] != 0)
			    {
				    i++;
				    while(s[i] != 0)
				    {
					    if(i == s.length-1)
					    {
						    counta = 0;
						    break;
					    }
					    counta++; i++;
				    }
				    a+=counta; i--;
			     }
			    
     	   /*  The following else if statement checks and counts number of
			* ones(1s) between pair of zeros(0s). 
			*/
			     else if(s[i] == 1 && s[i+1] != 1)
			     {
				     i++;
				     while(s[i] != 1)
				     {  
					     if( i == s.length-1)
					     {
						     countb = 0;
						     break;
					     }
					     countb++; i++;
				     }
				     b+=countb; i--;
			     }
			    
		    /* 
		     * The following else statement simply increments the array
		     * index when their is/are continuous ones or zeros either
		     * at starting or at ending of the array.
		     * For example- 1 1 1  0 0 0 1 1 0 1 1 or 0 0 0 0 1 1 0 0 1 1 .  
		     */
   			     else
			     {
				     i++;
			     }
			    
		     } // main while loop over.
			
 //	 Output statements 
			
	  System.out.println("Number of ones(1s) between pair of zeros(0s) are: "+a);
   	  System.out.println("Number of zeros(0s) between pair of ones(1s) are: "+b);

   	  sc.close();
	}

}

/*  
		 * Following are some sample input test cases and their expected outputs.
		 *
		 * i/p- (1 1 0 1 0 0 1 0 0) o/p = 2,3  
		 * byte s[] = {1,1,0,1,0,0,1,0,0};
		 * 
		 * i/p- (1 0 0 0 1 1 1 0 1 0 1 1 1 0 0 1) o/p = 7,7 
		 * byte s[] = {1,0,0,0,1,1,1,0,1,0,1,1,1,0,0,1};
		 * 
		 * i/p- (1 0 0 0 1 1 1 0 1 0 1 1 0 0 1 1) o/p = 6,7 
		 * byte s[] = {1,0,0,0,1,1,1,0,1,0,1,1,0,0,1,1};
		 * 
		 * i/p- (0 1 1 1 0 0 0 1 0 1 0 0 1 1 1 1) o/p = 5,6 
		 * byte s[] = {0,1,1,1,0,0,0,1,0,1,0,0,1,1,1,1};
		 * 
		 * i/p- (1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1) o/p = 0,14
		 * byte s[] = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
		 * 
		 * i/p- (1 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1) o/p = 0,12
		 * byte s[] = {1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1};
		 * 
		 * i/p- (0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 1) o/p = 0,0
		 * byte s[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1};
		 * 
		 * i/p- (1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0) o/p = 0,0
		 * byte s[] = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		 * 
		 * i/p- (0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1) o/p = 0,0 
		 * byte s[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
*/