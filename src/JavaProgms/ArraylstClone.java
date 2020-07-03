package JavaProgms;

import java.util.ArrayList;

public class ArraylstClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> al5 = new ArrayList<Integer>();
		 al5.add(3);
		 al5.add(4);
		 al5.add(5);
		 al5.add(6);
		 
         System.out.println(al5);
         
         ArrayList<Integer> al6 = (ArrayList<Integer>) al5.clone();
         
         System.out.println(al6);
         
	}

}
