package test;

public class SafeStackImpl extends StackImpl implements ISafeStack {

	public SafeStackImpl(Object[] stackArray, int tos) {
		super(stackArray, tos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isEmpty() {
		boolean flag;
		if(tos<0)
			flag= true;
		else
			flag=false;
		return flag;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false;
	}

}
