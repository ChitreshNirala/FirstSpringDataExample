package sort.test.defaul;

public interface square {
	
	default void cal(int x) {
		System.out.println("square" + (x*x));
	}

}
