package JavaProgms;

import java.util.ArrayList;

public class ArraylstMethods {
	public static void main(String args[]) {
		
		ArrayList<Object> alst = new ArrayList<Object>();
		
		alst.add(1);
		alst.add(2);
		alst.add("Venkat");
		alst.add("Vasudha");
		alst.add(3,"Darshu");
		
		// get and set
		System.out.println(alst.get(1));
		alst.set(1,3);
		System.out.println(alst.get(1));
		
		System.out.println(alst);
		// remove
		alst.remove(2);
		
		System.out.println(alst);
		
		
		
		
	}

}
