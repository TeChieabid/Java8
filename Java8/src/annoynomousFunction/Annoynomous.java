package annoynomousFunction;

interface Calculator {
	abstract void sum();
	//	abstract void sum1(); An Interface that contains exactly one abstract method is known as functional interface
}

public class Annoynomous {

//	@Override
//	public void sum() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void sum1() {
//		// TODO Auto-generated method stub
//		
//	}  methods are need to be implemented using interface to avoid to implementing all methods we can use annoynomous method 
	
	public static void  main(String args[]) {
Calculator calculator=()->{System.out.println("welcome");};
 
calculator.sum();
	
}
}
