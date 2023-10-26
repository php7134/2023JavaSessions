package javaAssignmentsArrays;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class DeleteNumFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p[]= {1,4,5,2,3,22,31,2};
		
		int q[]= new int [p.length-1];
		
		int count=0;
		
	    for(int e:p)
	    {
	    	if (!(e ==22))
	    	{
	    		q[count]=e;
	    		count++;
	    	}
	    }
	    System.out.println(Arrays.toString(q));
	    
	    
	    System.out.println("----------------------");
	    
	    //copy one array elements to another array elements
	    
	    int a[]= {1,5,4,8,9};
	    int b[]= new int[a.length];
	    
	    int c=0;
	    for (int e:a)
	    {
	    	b[c]=e;
	    	System.out.println(e);
	    	c++;
	    }
	    
      System.out.println(Arrays.toString(b));
	}

}
