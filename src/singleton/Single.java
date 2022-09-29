package singleton;

public class Single {
    private static  Single sub=null;
      private Single() {	
	}
   public static  Single add() {
	   if(sub==null)
	   sub=new Single();
	return sub;   
   }
	public static void main(String[] args) {
		Single X = add();
		System.out.println(X);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
