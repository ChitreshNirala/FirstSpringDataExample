package sort.test.def;

@FunctionalInterface
interface Av{
	/* we can declare more than one abstract functin in FunctionalInterface
	 * but fuction should be from java.lang.object class 
	 * we can define only m1() function in implementation class
	 * */
	public abstract void m1();
	//public abstract void m2();
	public abstract String toString();
	public abstract int hashCode();
	
	
}

class A implements Av{

	
	public void m1() {
		System.out.println("m1 from A class");		
	}
	
	
}
public class abst {
	public static void main(String[] args) {
		
	}

}
