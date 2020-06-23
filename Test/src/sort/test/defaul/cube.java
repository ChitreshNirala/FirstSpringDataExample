package sort.test.defaul;

public interface cube {
	default void cal(int x) {
		System.out.println("cube" + (x*x*x));
	}

}
