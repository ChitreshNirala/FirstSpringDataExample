package sort.test;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		/*
		 * int [] arr = {99,44,98,55,8,23,12}; int temp;
		 * 
		 * System.out.println("-------SORT--------"); for(int i=0;i<arr.length;i++) {
		 * 
		 * for(int j=i+1;j<arr.length;j++) {
		 * 
		 * if(arr[i]<arr[j]) { temp = arr[i]; arr[i]=arr[j]; arr[j]=temp;
		 * 
		 * 
		 * }
		 * 
		 * } } for (int i : arr) { System.out.println(i); }
		 * System.out.println("-------Reverse--------");
		 * 
		 * int [] arr1 = {1,2,3,4,5,6,7,8,9}; int temp1; int start=0; int
		 * end=arr1.length-1; while(start<end) { temp=arr1[start];
		 * arr1[start]=arr1[end]; arr1[end]=temp; start++; end--; }
		 * 
		 * for (int i : arr1) { System.out.println(i); }
		 * 
		 * System.out.println("-------fabonacci--------");
		 * 
		 * int max=10; int pre=0; int next=1;
		 * 
		 * for(int l=1;l<=max;++l) { System.out.print(pre+" "); int sum=pre + next; pre
		 * = next; next = sum;
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 */
		
	Vector v = new Vector();
	LinkedList ll= new  LinkedList<>();
	Enumeration e = v.elements();
	Iterator i = v.iterator();
	ListIterator li = v.listIterator();
	System.out.println(e.getClass().getName());
	System.out.println(i.getClass().getName());
	System.out.println(li.getClass().getName());
	}
}
