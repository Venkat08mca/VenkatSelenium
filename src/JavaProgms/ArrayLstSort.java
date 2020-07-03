package JavaProgms;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLstSort {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
	      fruits.add("Orange");
	      fruits.add("Apple");
	      fruits.add("Banana");
	      fruits.add("Pineapple");
	   
	      System.out.println(fruits);
	      
	      Collections.sort(fruits);
	      System.out.println("Printing in asecending order");
	     for (Object str : fruits) 
	         System.out.println(str);
	     System.out.println("Printing in descending order");
	      Collections.reverse(fruits);
	      for (Object str : fruits) 
		         System.out.println(str);
		     
	   }
	

	}


