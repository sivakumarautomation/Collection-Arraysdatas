package collection; //package//

import java.util.ArrayList;

public class GenericDatatype { //class//
	
	public static void main(String[] args) { //Main//
		
		//Generic Specific Data Types in arrayList//
		//1.Integer//
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		
		a1.add(11);
		a1.add(12);
		a1.add(13);
		a1.add(15);
		a1.add(17);
		
		System.out.println("This is********* Integer");
		System.out.println(a1.size());
		System.out.println(a1.get(3));
		System.out.println(a1);
		
		//For Loop//
		
		System.out.println("For Loop in Integer DataTypes");
		
		for (int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		
		//For each//
		
		System.out.println("For Each Loop in Integer");
		
		for(Integer i : a1) {
			System.out.println(i);
			
			}
		
		
		//2.Double//
		
		ArrayList<Double> a2 = new ArrayList<Double>();
		a2.add(1234.56);
		a2.add(112.99);
		a2.add(1902.77);
		a2.add(1290.90);
		
		System.out.println("This is********* Double");
		System.out.println(a2.size());
		System.out.println(a2.get(3));
		System.out.println(a2);
		
		//For loop//
		
		System.out.println("Double Loop");
		
		for (int i=0;i<a2.size();i++) {
			System.out.println(a2.get(i));
		}
		
		//For Each//
		
		System.out.println("For each Loop in double");
		
		for (double d : a2) {
			System.out.println(d);
		}
		//3.float//
		ArrayList<Float> a3 = new ArrayList<Float>();
		
		a3.add(1f);
		a3.add(22.7f);
		a3.add(0.8f);
		a3.add(1.8f);
		
		System.out.println("This is********* Float");
		System.out.println(a3.size());
		System.out.println(a3.get(0));
		System.out.println(a3);
		
		System.out.println("Float in For Loop");
		
		for (int i=0;i<a3.size();i++) {
			System.out.println(a3.get(i));
		}
		
		System.out.println("For each loop");
		
		for (float f : a3) {
			System.out.println(f);
		}
		
		//4.character//
		
		ArrayList<Character> a4 = new ArrayList<Character>();
		
		a4.add('a');
		a4.add('g');
		a4.add('f');
		a4.add('h');
		a4.add('k');
		
		System.out.println("This is********* Character");
		System.out.println(a4.size());
		System.out.println(a4.get(4));
		System.out.println(a4);
		
		System.out.println("Loop in Character");
		
		for (int i=0;i<a4.size();i++) {
			System.out.println(a4.get(i));
		}
		
		System.out.println("For each loop in Character");
		
		for (char c : a4) {
			System.out.println(c);
		}
		
		//5.String//
		
		ArrayList<String> a5 = new ArrayList<String>();
		a5.add("Chrome");
		a5.add("IE");
		a5.add("Safari");
		a5.add("Safari");
		a5.add("Opera");
		
		System.out.println("This is********* String");
		System.out.println(a5.size());
		System.out.println(a5.get(3));
		System.out.println(a5);
		
		//For loop// integer//obj.size//
		//print(get(i)//
		
		System.out.println("For Loop");
		
		for (int i=0;i<a5.size();i++) {
			System.out.println(a5.get(i));
		}
		
		//for each loop //
		//data type variable any name : object//
		
		System.out.println("For each loop");
		
		for (String sg : a5) {
			System.out.println(sg);
		}
		
				
	}
	
}
