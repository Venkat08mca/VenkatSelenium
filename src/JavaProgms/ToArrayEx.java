package JavaProgms;

import java.util.ArrayList;

public class ToArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

	      
	      arrlist.add(20);
	      arrlist.add(40);
	      arrlist.add(10);
	      arrlist.add(15);
	      arrlist.add(25);
	      arrlist.add(50);
	      
	      // let us print all the elements available in list
	      for (Integer number : arrlist) {
	         System.out.println("Number = " + number);
	      }  
	      
	     Object[] ob = arrlist.toArray();

	      System.out.println("Printing elements from first to last:"); 
	      for (Object value : ob) {
	         System.out.println("Number = " + value);
	      }
	   }

	}


