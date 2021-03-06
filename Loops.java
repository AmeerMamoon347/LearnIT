package com.itbulls.learnit.ameermamoon;

public class Loops {

	public static void main(String[] args) {
		  System.out.println("Changes in repository"); 
		System.out.println("while loop: ");
		int i = 0;
		while(i<5) {
			System.out.println(i++);
		} System.out.println('\n');
		
		//For infinite loop 
		// while(true)
		
		System.out.println("do-while loop: ");
		int i2 = 0;
		do 
		{ System.out.println(i2++);
		
		} while(i2<5);
		
		System.out.println("for loop: ");
		for ( int i3 = 0; i3<10; i3++)
		{ System.out.println(i3);
		}
//		for(;;)  //Infinite for loop
//		{ 
//		  }
		
		for(int k = 0, j = 10; k<j; k++,j-- )
		{  System.out.println("k ="+k+ "j="+j);
		  }
		
		
		System.out.println("For each loop: ");
	    
	     int Arr[] = { 1,2,3};
	     int sum = 0;
	     for (int num : Arr)
	     {  sum+= num;
	        System.out.println(num);
	     } System.out.println("Sum = "+sum);
	     
			
	         
	
	}
}
