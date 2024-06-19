package collectionDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArraylistDemo1 {

	public static void main(String[] args){
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		Collections.sort(al);
		System.out.println(al);
		System.out.println(al);
	System.out.println("Size is:" +al.size());
	System.out.println("Index of 30 is:" +al.indexOf(30));
	al.remove(1);
	System.out.println(al);
	al.add(1,null);
	System.out.println(al);
	System.out.println("Size is:" +al.size());
	al.removeAll(al);
	System.out.println(al);
	
	
	}

}
