
public class FinalKeyword {
	public static void main(String[] args) {
		Parent child=new Child();
		//Child child=new Child();
		child.m1();
		
	}

}
class Parent{
	final String name="sharon";
//	 final void m1() {
//		System.out.println("Parent");
//	}
	  void m1() {
		System.out.println("Parent");
		}
	 void m2() {
		 
	 }
	 
}
class Child extends Parent{
	
	void m1() {
		System.out.println("Child");
	}
	//@override
	void m2() {
		 
	 }
	 
	
}