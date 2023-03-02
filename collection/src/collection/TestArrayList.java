package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestArrayList {
	public static void main(String []args) {
		/*ArrayList list=new ArrayList();// we can put arraylist any data type. if you want put specific data type, use generic sign <> with data type you want. eg, ArrayList<String> list=new ArrayList(); 
		                               // but int,double,boolean is primitive data type that is why, cannot put small datatype name, can only put datatype name using in Wrapper class eg, ArrayList<Integer> list=new ArrayList();
		//int [] a=new int[3];
		list.add(1);
		list.add("hello");
		list.add(false);
		System.out.println(list);*/
		
		
		ArrayList<Integer> list=new ArrayList();// we can put arraylist any data type. if you want put specific data type, use generic sign <> with data type you want. eg, ArrayList<String> list=new ArrayList(); 
        // but int,double,boolean is primitive data type that is why, cannot put small datatype name, can only put datatype name using in Wrapper class eg, ArrayList<Integer> list=new ArrayList();
		//int [] a=new int[3];
		list.add(1);
		list.add(4);
		list.add(3);
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		
		for(int i:list) {//foreach
			System.out.println(i);
		}
		
		//when you use collection, it is more good to use Iterator than using for , foreach loop
		Iterator ir=list.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
		
	}
}
