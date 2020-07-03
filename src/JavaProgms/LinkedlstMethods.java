package JavaProgms;

import java.util.LinkedList;

public class LinkedlstMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> lm = new LinkedList<Integer>();
		lm.add(1);
		lm.add(2);
		lm.add(3);
		lm.add(4);
		System.out.println(lm);
		lm.addFirst(5);
		lm.addLast(6);
		lm.push(4);
		lm.removeFirst();
		System.out.println(lm);

	}

}
