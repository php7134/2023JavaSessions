package javasessions;

import java.util.Arrays;

public class ArraysConcept {
	public static void main(String [] args) {
		
		
		//Limitations of array
		//Size is fixed.
		
		//1. with new keyword
		
		int a[]=new int[4];
		a[0]= 10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		System.out.println(a[0]);
		System.out.println(a[3]);
		//System.out.println(a[4]); //ArrayIndexOutofbondException
		//System.out.println(a[-1]); //ArrayIndexOutofbondException
		
		int len=a.length;
		System.out.println(len);
		
		int hi=len-1;
		System.out.println(hi);
		
		int li=0;
		System.out.println(li);
		
		
		
		// to print all the values from the array : use for loop
		System.out.println("----------------");
		for(int i=0; i<4; i++)
		{
			System.out.println(a[i]);// 10 20 30 40
		}
		
		//without using for loop:
		System.out.println(a); //[I@24d46ca6
		System.out.println(Arrays.toString(a));
		
		double d[]= new double[2];
		d[0]=12.33;
		d[1]=34.44;
		
		System.out.println(d[0]+d[1]);
		
		//String array
		String emp[] =new String[3];		
		emp[0]="Pooja";
		emp[1]="Ravi";
		emp[2]="Robin";
		
		System.out.println("Total employee:" + emp.length);
		System.out.println(Arrays.toString(emp));
		
		for(int k=0;k<emp.length;k++)
		{
			System.out.println(emp [k]);
			if(emp[k].equals("Ravi"))
			{
				System.out.println("Ravi Salary is: " +1000);
				break;
			}
		}
		
		
	}

}
