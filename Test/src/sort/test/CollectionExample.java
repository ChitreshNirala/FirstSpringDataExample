package sort.test;

import java.util.Comparator;
import java.util.TreeSet;

public class CollectionExample {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		
		System.out.println(t);
	}

}

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		Integer i1 = (Integer) o1;
		Integer i2 = (Integer) o2;
		//return i1.compareTo(i2);
		//return -i1.compareTo(i2);
		//return i2.compareTo(i1);
		return +1;
	}
	
	
} 