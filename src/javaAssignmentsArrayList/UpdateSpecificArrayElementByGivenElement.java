package javaAssignmentsArrayList;

import java.util.ArrayList;

public class UpdateSpecificArrayElementByGivenElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> ar = new ArrayList<Object>();
		
		ar.add("Tom");
		ar.add(28.50);
		ar.add(28);
		ar.add("test@gmail.com");
		
		System.out.println(ar);
		
		ar.set(3, "948799995");
		
		System.out.println(ar);
		
		ar.remove(3);
		System.out.println(ar);
		
		
		
		
		
		

	}

}
