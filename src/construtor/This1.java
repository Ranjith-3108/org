package construtor;

 class This1{ 
	
	This1(){
		this(199);
		System.out.println("default");
	}This1(int id){
		System.out.println(id);
	}public static void main(String[] args) {
		This1 a =new This1();
	}
}
