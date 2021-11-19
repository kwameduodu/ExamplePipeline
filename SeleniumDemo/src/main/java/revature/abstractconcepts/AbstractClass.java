package revature.abstractconcepts;

public abstract class AbstractClass {
	
	public abstract void behavior();

	
	public void nonAbstractBehavior() {
		System.out.println("You are not required to even have abstract methods on abstract classes");
	} 
	
	
	
	
}



class ChildClass extends AbstractClass implements AbstractInterface{

	@Override
	public void behavior() {
	System.out.println("behavior function");
		
	}

	@Override
	public void concreteBehavior() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}