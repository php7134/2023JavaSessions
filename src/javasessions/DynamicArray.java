package javasessions;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ArayList -- default class
		
		ArrayList ar= new ArrayList();
		System.out.println(ar.size());
		ar.add(100); //0
		ar.add(200); //1
		ar.add(300); //2
		ar.add(400); //3
		ar.add(500); //4
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(0));
		System.out.println(ar.get(4));
		//System.out.println(ar.get(5)); //Index out of bound exception
		//System.out.println(ar.get(-1)); //IOBExp
		
		ar.add(600);
		System.out.println(ar.get(5));
		
		ar.add(12.33);
		ar.add(true);
		ar.add('m');
		ar.add("testing");
		
		System.out.println(ar.size());
		
		//generics in arraylist:
		ArrayList<Integer> marksList=new ArrayList<Integer> ();// vc=10
		marksList.add(100);
		marksList.add(200);
		
		System.out.println(marksList.size());
		
		ArrayList<Double> bmiList=new ArrayList<Double> ();
		bmiList.add(12.33);
		bmiList.add(100.0);
		
		ArrayList<String> browserList=new ArrayList<String> ();
		browserList.add("chrome");
		browserList.add("Edge");
		
		System.out.println(browserList.size());
		
		System.out.println(browserList.get(1));
		
		System.out.println(browserList);
		
		//to print all the values from array list
		System.out.println("---------------");
		for(int i=0; i<browserList.size();i++)
		{
			System.out.println(browserList.get(i));
			if(browserList.get(i).equals("chrome"))
			{
				System.out.println("Google");
				break;
			}
		}
		System.out.println("---------------");
		//for each
		for(String e:browserList)
		{
			System.out.println(e);
		}
		
		//
		System.out.println("---------------");
		ArrayList<Object> empinfoList=new ArrayList<Object>(); //VC=10. PC=0;
		
		empinfoList.add("Riya");
		empinfoList.add("Sina");
		empinfoList.add(30);
		empinfoList.add(45.55);
		empinfoList.add("Pune");
		empinfoList.add('f');
		empinfoList.add(true);
		
		System.out.println(empinfoList.size());
		
		System.out.println(empinfoList);
		
		System.out.println("---------------");
		
		for(Object e:empinfoList)
		{
			System.out.println(e);
			
		}
		
		System.out.println("---------------");
		
		//
		ArrayList<Integer> numbers=new ArrayList<Integer> ();
		numbers.add(100);
		numbers.add(200);
		numbers.add(3000);
		numbers.add(100);
		
		System.out.println(numbers);
		
		for(Integer e:numbers) {
			System.out.println(e);
			if(e==200) {
				
			}
		}
		// LF - Load Factor --> pc/2 --> size ()/2
		// vc=10, pc=0;
		// pc=10, vc=0, lastindex=0-9
		
		
		// Use cases for ArrayList
		// uber: carsList
		// Amazon: productList
		// usersList
		// total number of links -- linksList
		// total number of images -- imagesList
		
		
		
		
	}

}
