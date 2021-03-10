package assignment1;

public class Customer {
	private String name;
	private Byte age;
	void placeOrder() {
		System.out.println("Customer places order");
		}
	public String getName() {
		return name;
	}
	Customer(String name){
		this.name=name;
	}
	public void setName(String name) {
		if (name==null || name.trim().equals("")) {
			throw new IllegalArgumentException("name is mandatory");
		}
		this.name = name;
	}
	public Byte getAge() {
		return age;
	}
	public void setAge(Byte age) {
		this.age = age;
	}
}
