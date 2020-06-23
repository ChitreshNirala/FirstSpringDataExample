package test;

public class StackImpl implements IStack {
	
	protected Object[] stackArray;
    protected int tos;

	
	public StackImpl(Object[] stackArray, int tos) {
		
		this.stackArray = stackArray;
		this.tos = tos;
	}

	@Override
	public void push(Object obj) {
		
		
	}

	@Override
	public Object pop() {
		
		return null;
	}

	

	
}
