package JavaProgms;

import java.util.ArrayList;

public class RemoveAllExmple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> rmval1 = new ArrayList<Integer>();
        rmval1.add(1);
        rmval1.add(2);
        rmval1.add(3);
        rmval1.add(4);
        rmval1.add(5);
       // rmval1.remove(2);
        System.out.println("Numbers in List1: "+rmval1);
        System.out.println("getting index of 5  "+rmval1.indexOf(5));
        //contains()
        System.out.println(rmval1.contains(3));
        System.out.println(rmval1.contains(6));
        
        ArrayList<Integer> rmval2 = new ArrayList<Integer>();
        rmval2.add(6);
        rmval2.add(7);
        rmval2.add(3);
        rmval2.add(4);
        rmval2.add(5);
        System.out.println("Numbers in List2: "+rmval2);
        //ADD ALL
        rmval1.addAll(rmval2);
        System.out.println("Numbers in List1 after add all: "+rmval1);
        System.out.println("Numbers in List2 after add all: "+rmval2);
       // Remove ALL 
        rmval1.removeAll(rmval2);
        System.out.println("Numbers in List1 after remove all: "+rmval1);
        System.out.println("Numbers in List2 after remove all: "+rmval2);
        
        
        
	}

}
