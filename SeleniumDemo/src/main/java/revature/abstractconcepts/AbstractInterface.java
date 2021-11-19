package revature.abstractconcepts;

public interface AbstractInterface {

	//Methods on interfaces are "public abstract" by default
	void concreteBehavior();
	
	/**
	 * You can have methods with implementations on interfaces if you use the "default" or "static" keyword
	 */
	default void defaultBehavior() {
		System.out.println();
	}
	
	static void morDefaultBehavior() {
		
	}
	
}

class AbstractInterfaceImpl implements AbstractInterface {

	@Override
	public void concreteBehavior() {
		// TODO Auto-generated method stub
		
	}
	
}