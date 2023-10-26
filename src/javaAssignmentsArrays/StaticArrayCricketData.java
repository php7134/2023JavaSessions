package javaAssignmentsArrays;

import java.util.Arrays;

public class StaticArrayCricketData {
	
	String name;
	int age;
	String teamName;
	String dob;
	String gender;
	double strikerate;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Object playersInfo []= new Object[7];
		
       Object player1Info[]=new Object[6]; 
		
       player1Info[0]="Tom";
       player1Info[1]=30;
       player1Info[2]="Austerila";
       player1Info[3]="14/09/1998";
       player1Info[4]="Male";
       player1Info[5]=101.25;
		
		System.out.println(Arrays.toString(player1Info));
		
	 Object player2Info[]=new Object[6]; //0-4
		
	       player2Info[0]="Sam";
	       player2Info[1]=32;
	       player2Info[2]="New Zeland";
	       player2Info[3]="14/03/1998";
	       player2Info[4]="Male";
	       player2Info[5]=103.50;
			
			System.out.println(Arrays.toString(player2Info));
		

	}

}
