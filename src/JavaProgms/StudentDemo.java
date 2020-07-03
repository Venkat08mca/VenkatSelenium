package JavaProgms;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al= new ArrayList<Student>();
		
        al.add(new Student("Chaitanya", 26));
        al.add(new Student("Ajeet", 25));
        al.add(new Student("Steve", 55));
        al.add(new Student("Mary", 18));
        al.add(new Student("Dawn", 22));
     //   Iterator itr = al.iterator();
        
     // while(itr.hasNext()) {
     //   	System.out.println(itr.next());
        	
        for (Student tmp: al){
            System.out.println(tmp);
        }
   }

	}


