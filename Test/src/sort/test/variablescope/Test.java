package sort.test.variablescope;

public class Test {

	public static void main(String[] args) {
		int x=90;
		changeit(x);
		System.out.println(x);
		
	}

	private static void changeit(int x) {
		x=100;
		System.out.println(x);
		
	}

}
