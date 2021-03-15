
public class Employee extends Human {
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	Employee(String name, int id) {
		setName(name);
		this.id = id;
	}
	@Override
	public String toString() {
		return this.getName()+this.id;
	}
	void eats() {
//		super.eats();
		System.out.println("Employee eats");
	}
	
	
}
