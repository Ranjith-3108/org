package singleton;

public class Add {
	private static Add C=null;
	  Add() {
}
	public static Add add() {
	
	if(C==null)
	C=new Add();
	
	return C;
}public static void main(String[] args) {
	Add X = add();
	System.out.println(X);
}
	
	
	
	
	
	
	
}
