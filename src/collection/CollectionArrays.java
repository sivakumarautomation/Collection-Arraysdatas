package collection;

import java.util.ArrayList;

public class CollectionArrays {

	public static void main(String[] args) {
	
		//ArrayList--->Class//
		ArrayList al = new ArrayList();
		
		al.add(22);
		al.add(33);
		al.add("arrays");
		al.add('a');
		al.add(11);
		
		System.out.println(al.size());
		System.out.println(al);
		System.out.println(al.get(4));
		System.out.println("Index is:"+al.get(2)+","+al.get(1));
		
		
	}

}
