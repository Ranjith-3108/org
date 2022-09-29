package org.encaps;

public class Emp {
	private int id;
	private String name;
	
	public Emp(int id, String name) {
		this.id = id;
		this.name=name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Emp e = new Emp(100,"Ranjith");
		System.out.println(e.getId());
		//e.getName();
	}	
}
