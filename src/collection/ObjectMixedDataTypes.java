package collection; //package//

import java.util.ArrayList;

public class ObjectMixedDataTypes { //class//
	
	public static void main(String[] args) {
		
		ArrayList<Object> Emp= new ArrayList<Object>();
		Emp.add("Peter");
		Emp.add(23);
		Emp.add('A');
		Emp.add("Bangalore");
		Emp.add(123443.90);
		Emp.add(2f);
		
		System.out.println(Emp.size());
		System.out.println(Emp);
		
		//For loop in Employee//
		  
		     System.out.println("For Loop in Employees");
		for (int i=0;i<Emp.size();i++) {
			System.out.println(Emp.get(i));
			
			// For each loop//
			System.out.println("For each Loop in Employees");
			for(Object ob : Emp) {
				System.out.println(ob);
			}
		}
		
		
	}

}
