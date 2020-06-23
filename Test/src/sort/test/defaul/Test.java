package sort.test.defaul;

public class Test implements square, cube {

	public void cal(int x) {
		System.out.println("cal from test" +x);
		
		cube.super.cal(x);
	}
	
}
