package dataConversion;
class Student extends Human{
	public Student(String name) {
		// TODO Auto-generated constructor stub
		this.setName(name);
	}
	private String name;
	
void eats() {
	//super.eats();
	System.out.println("Student eats");
}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	
}