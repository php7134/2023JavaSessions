package javaAssignmentsArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> studentNames = new ArrayList<String>();

		   studentNames.add("Varun");
           studentNames.add("Reena");
           studentNames.add("Naveen");
           studentNames.add("Robin");
           studentNames.add("Peter");
           
           System.out.println(studentNames);
           
           for(int i=studentNames.size()-1;i>=0;i--)
           {
        	   System.out.println(studentNames.get(i));
           }
           
           Collections.reverse(studentNames);
           System.out.println(studentNames);
           
           // to print elements of an arraylist using position of elements
           
           System.out.println(studentNames.get(0));
           System.out.println(studentNames.get(2));
           
           // trim the virtual capacity of an array list the current list size.
           
           studentNames.trimToSize();
           
           //portion of the arraylist
           
           System.out.println(studentNames.subList(2, studentNames.size()));
           
           // to empty an arraylist
           
           studentNames.clear();
           System.out.println(studentNames);
           
           
	}

}
