/**
* <h1>HashMapDemo</h1>
* This program shows the functionality how we can show only values contained
* in a HashMap
* @author  Vikas
* @version 1.0
* @since   2017-05-30 
*/
package assignment9.session3;

import java.util.*;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		//creating Employee objects
		Employee emp1 = new Employee(5894, "Rohit");
		Employee emp2 = new Employee(5946, "Vinay");
		Employee emp3 = new Employee(5673, "Akshay");
		Employee emp4 = new Employee(5723, "Ankur");
		//creating hashMap which will hold empCode as key and empName as value
		HashMap<Integer,String> hashMap1 = new HashMap<Integer,String>();
		//adding elements into the  HashMap
		hashMap1.put(emp1.empCode, emp1.empName);
		hashMap1.put(emp2.empCode, emp2.empName);
		hashMap1.put(emp3.empCode, emp3.empName);
		hashMap1.put(emp4.empCode, emp4.empName);
		//this set will contain entry objects of the HashMap
		Set<Entry<Integer, String>> s1 = hashMap1.entrySet();
		//iterating through the Entry Set
		Iterator<Entry<Integer, String>> itr = s1.iterator();
		while(itr.hasNext()){
			//getting the next element of Entry Set
			Entry<Integer, String> m1 = itr.next();
			//printing only values contained in the Entry Set
			System.out.println(m1.getValue());
		}
	}

}

//these Employee objects will be added into the HashMap
class Employee{
	int empCode;
	String empName;
	public Employee(int empCode, String empName) {
		super();
		this.empCode = empCode;
		this.empName = empName;
	}
	
}
