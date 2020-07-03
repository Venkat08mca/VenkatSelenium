package JavaProgms;

import java.util.LinkedList;

public class LinkedlstLooping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l = new LinkedList<Integer>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		//for loop
		System.out.println("using for loop");
		for(int n=0; n<l.size();n++)
			System.out.println(l.get(n));
		//advanced for loop
		System.out.println("using for advanced loop");
		for(Integer i:l) 
		
			System.out.println(i);
		
		//while loop
		System.out.println("using for while loop");
		int n=0;
		while(n<l.size())
		{
			System.out.println(l.get(n));
			n++;

	}

	}
}
