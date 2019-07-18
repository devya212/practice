package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import serialization.Customer;

public class ListDemo {

	public static void printListItems(List<String> lst)
	{
		
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> arrList=new ArrayList<>(); 
		printListItems(arrList);
		
		
		
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "Name1");
		map.put(2, "Name2");
		System.out.println(map);
		/*Customer c1=new Customer(2,"bbb");
		Customer c2=new Customer(3,"ddd");
		Set set=new HashSet();
		set.add("Hello");
		set.add("Bye");
		set.add("Hello");
		set.add("Bye");
		set.add(c1);
		set.add(null);
		set.add(c2);		
		System.out.println(set);*/
		
		/*Customer c1=new Customer(2,"bbb");
		List<String> list=new ArrayList<>();
		list.add("Hello");
		list.add("Bye");
		list.add("Bye");
		list.add(100);
		list.add(new Customer(1,"aa"));
		list.add(c1);		
		System.out.println(list);
		//list.add(3,"OK");
		String v1=list.get(2);
		//list.remove(2);
		//list.remove("Bye");
		System.out.println(v1);
		//System.out.println(list);
		
		//1.
		for(String str: list)
		{
			System.out.println(str);
		}
		
		System.out.println("************");
		//2. For Loop
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("***********");
		//3. 
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			String str=itr.next();
			System.out.println(str);
		}
		
		
	*/	

	}

}
