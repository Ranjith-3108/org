package construtor;

public class Prac {
	
	public Prac() {
		System.out.println("default");
	}public Prac(int id,String lastname){
		System.out.println(id);
	}public Prac(String name){
		System.out.println(name);
	}public static void main(String[] args) {
		Prac p=new Prac();
		Prac p1 =new Prac(100,"Paaa");
		Prac p2= new Prac("Ranjith");
	}
	
	// cant use static keyword in constructor....
	//overloading concept in constructor...
	//class & method name should be same... 
	
	
	
	
	

}
