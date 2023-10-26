package javaAssignmentsArrayList;

import java.util.ArrayList;

public class SearchAnElementinArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> ar=new ArrayList<Object>();

		ar.add("Tom");
		ar.add(28.50);
		ar.add(28);
		ar.add("test@gmail.com");
		
		for(int i=0;i<ar.size();i++)
		{
			if((ar.get(i)).equals("test@gmail.com"))
			{
				break;
			}
			System.out.println(ar.get(i));
			
		}

	}

}
