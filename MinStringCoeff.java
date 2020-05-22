
/* This program was created by Jimit Patel on 21-May-2020.
 * Aim - To find co-effecient of the string consisting of only 0’s and 1’s
 * and then compute its minimum co-effecient.
 */
import java.util.Scanner;

class MinStringCoeff {

	public static void main(String[] args) {

		byte i=0,a=0,b=0,counta,countb;

		/* 
		 * Following are some input test cases and their expected outputs.
		 *
		 * i/p- (1 0 0 0 1 1 1 0 1 0 1 1 1 0 0 1) o/p = 7,7 
		 * byte s[] = {1,0,0,0,1,1,1,0,1,0,1,1,1,0,0,1};
		 * 
		 * i/p- (1 0 0 0 1 1 1 0 1 0 1 1 0 0 0 1) o/p = 6,8 
		 * byte s[] = {1,0,0,0,1,1,1,0,1,0,1,1,0,0,0,1};
		 * 
		 * i/p- (0 1 1 1 0 0 0 1 0 1 0 0 1 1 1 0) o/p = 8,6 
		 * byte s[] = {0,1,1,1,0,0,0,1,0,1,0,0,1,1,1,0};
		 * 
		 * i/p- (1 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1) o/p = 0,14
		 * byte s[] = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
		 */
		byte s[] = new byte[16];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any sixteen bit binary string to find number of ones(1s) between zeros(0s) and zeros(0s) between ones(1s). ");
		for(byte j=0; j<16; j++)
		{
			s[j] = sc.nextByte();
		}
		while(i<s.length-2)
		{
			counta=0;countb=0;
			if(s[i] == 0)
			{
				i++;
				while(s[i] != 0)
				{
					counta++; i++;
				}
				a+=counta; i--;
			}
			else
			{
				i++;
				while(s[i] != 1)
				{
					countb++; i++;
				}
				b+=countb; i--;
			}
		}
		System.out.println("Number of ones(1s) between zeros(0s) are: "+a);
		System.out.println("Number of zeros(0s) between ones(1s) are: "+b);
	}

}