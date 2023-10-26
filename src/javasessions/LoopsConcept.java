package javasessions;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 to 10 
		// While Loop
		
		int i=1;
		while (i<=10)
		{
			System.out.println(i);
			i++;
			//i=i+1;
			//++i;
			
		}
	
		int k=1;
		while (true)
		{
			System.out.println("Welcome to taj hotel");
			
			if (k==5)
			{
				break;
			}
			k++;
		}
		
		//for loop:
		//1 to 10:
		//for (Initialization,condition,Increment/Decrement)
		for(int j=1; j<=10;j++)
		{
			System.out.println(j);
		}
		// OR
		int j=1;
		for (;j<=10; )
		{
			System.out.println(j);
			j++;
		}
		System.out.println("------------------------");
		//a to z with ASCII value
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.println(ch + "=" +(byte)ch);
		}
		// OR
		/*
		for (;;)
		{
			System.out.println("Welcome to loops");
		}
		*/
		// OR
		
		
		for(double d=1.1;d<=5.0;d++)
		{
			System.out.println(d);
		}
		
		//
		for(int w=1; w<=100; w++)
		{
			if (w % 2 == 0)
			{
				System.out.println(w);
			}
		}
		
		// use cases of while loop:
		//when number of iteration are not fixed  - while loop
		//total links on web page
		//webtable pagination 1 2 3 4 ...next
		//webelement is loading on the page
		//page load timeout
		//calender: 
		//build is running: 10, 1 hr, 2 hr
		
		
		//use cases of for loop:
		//when number of iterations are fixed --- for loop
		//month/days drop down --->1 to 12
		//category options
		//Array, ArrayList
		//excel file  --test data  --rows =1 to rowSize()
		//country drop down ---> 1 to 230 ----> if name Brazil -->break
		//Read data : JSON/XML
		//read data from DB: SQL  --rows/columns
		
		
		//do-while loop:
		int e =1;
		
		do
		{
			System.out.println(e);
			e++;
		}
		while(e>=10);
		
		// Use cases for do while loop
		
		// web table pagination: check if element is already present in the table 
		// go and check the element first and then start the while loop
		// Calendar:
		
		
		//4. for each
		//5. streams
		
		
		
	}

}
