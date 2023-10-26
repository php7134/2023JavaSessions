package javasessions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListFeatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> ar=new ArrayList <Integer>(20);
		//VC =20, PC=0;
		//LF=10
		
		//vc=5, pc=0;
		//pc=5, LF=5/2=2
		
		ArrayList<Integer> numList=new ArrayList <Integer>();
		//vc=10,pc=0;
		numList.add(100);
		numList.add(200);
		numList.add(300);
		numList.add(400);
		System.out.println(numList.size());//4
		numList.remove(2);
		System.out.println(numList.size());
		System.out.println(numList.get(2));
		
		numList.remove(0);
		System.out.println(numList);
		
		//
		ArrayList<String> empList=new ArrayList<String>(Arrays.asList("Tom","Peter","Robin","Ravi"));
		
		System.out.println(empList.size());
		System.out.println(empList);
		
		empList.add("Lisa");
		System.out.println(empList.size());
		System.out.println(empList);
		
		
		empList.add(0,"Ankit");
		System.out.println(empList);
		
		
		//empList.add(8,"Vijay");
		//System.out.println(empList);
		
		//
		List<Integer> nums=Arrays.asList(1,2,3,4,5);
		System.out.println(nums.size());
		
		//
		List<String> PageList=Arrays.asList("LoginPage","HomePage","RegPage","CartPage");
		
		
		ArrayList<Integer> nList=new ArrayList <Integer>();
		//vc=10,pc=0;
		nList.add(100);
		nList.add(260);
		nList.add(10);
		nList.add(4000);
		nList.add(40);
		nList.add(5);
		
		Collections.sort(nList);
		System.out.println(nList);
		
		System.out.println("-----------");
		for(int i=nList.size()-1;i>=0;i--)
		{
			System.out.println(nList.get(i));
		}
		
		Collections.reverse(nList);
		System.out.println(nList);
		
		int test[]= {23,2,45,100,1,900};
		Arrays.sort(test);
		System.out.println(Arrays.toString(test));
		
		
		//
		ArrayList<String> myList=new ArrayList<String>(Collections.nCopies(10, "iphone"));
		System.out.println(myList.size());
		System.out.println(myList);
		
		
		
		
		
		
		
		
		
		
		
		
		

		
 		
		

	}

}
