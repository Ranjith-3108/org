package construtor;

public class SingleMain {

	public static void main(String[] args) {
		Singleton X = Singleton.getInstance();
		Singleton Y = Singleton . getInstance();
System.out.println(X.hashCode());
System.out.println(Y.hashCode());
if(X==Y) {
System.out.println("Valid");

}

	}

}
