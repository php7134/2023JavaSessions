package javasessions;

import java.util.Arrays;

public class LoopsWithforEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for each loop
		int a[]=new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		
		for(int e : a)
		{
			System.out.println(e);
		}
		
       String emp[]=new String[5];
       
       emp[0]="pooja";
       emp[1]="ravi";
       emp[2]="Robin";
       emp[3]="Rob";
       emp[4]="in";
       
       for(String text:emp)
       {
    	   System.out.println(text);
    	   if(text.equals("Rob"))
    	   {
    		   System.out.println("he is a developer");
    		   break;
    		   
    	   }
       }
       
       Object employee[]=new Object[5]; //0-4
		
       employee[0]="Tom";
       employee[1]=30;
       employee[2]=23.33;
       employee[3]='m';
       employee[4]=true;
       
       
       for(Object e:employee)
       {
    	   System.out.println(e);
       }
       
       System.out.println("---------------");
       //
       int ar[]=new int[4];
       ar[0]=10;
       ar[1]=20;
       ar[2]=30;
       ar[3]=40;
       
       
       for (int i=ar.length-1;i>=0;i--)
       {
    	   System.out.println(ar[i]);
       }
       
       //
       int pr[]=new int[4];
       System.out.println(pr[0]);
       
       pr[0]=1000;
       System.out.println(pr[0]);
       
       System.out.println("----------------");
       //
       int test[]= {10,20,40,55,66,77,88};
       System.out.println(test.length);
       
       System.out.println(test[0]);
      // System.out.println(test[8]);//AIOB
       
       
       test [0]=400;
       System.out.println(test[0]);
       
       test [3]=99;
       System.out.println(test[3]);
       
       System.out.println(Arrays.toString(test));
       
       
       
       
       
	}

}
