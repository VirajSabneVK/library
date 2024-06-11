/*
Entery = Student in id No;
list of book;
Choice Book ;
Done Massage ;
recipt;
*/

import java.util.Scanner;
class Csmss 
{
	public static void main(String [] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your Id");
	int x = sc.nextInt();
	
	if(x < 50){
		System.out.println("Welcome to CSMSS Lab");
		System.out.println("Choice Book : ");
		System.out.println("Shree","Vilas","Mangesh","Rajesh","Radhe","Rushi");
		
		int no = sc.nextInt();
		String sub [] = {"Shree","Vilas","Mangesh","Rajesh","Radhe","Rushi"};
		String name [] =  new String[6];
		
		for(int i =0+1; i < 2;i++)
		{
			sub[i] = sc.nextLine();
		}
		
		for(int i =0; i < 2; i++)
		{
			System.out.println(sub[i]);
		}
		System.out.println("Thankyou");
	}
	}
}

