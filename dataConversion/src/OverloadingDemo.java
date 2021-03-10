
public class OverloadingDemo {
	public static void main(String[] args) {
	Student1 s1=new Student1();
	s1.study();
	s1.study(1);
	}

}
class Student1{
	void study(int duration,String subject) {
		System.out.println("study for"+duration+" hours"+subject);
	}
	void study(int duration) {
		System.out.println("study for"+duration+" hours");
	}
	void study() {
		System.out.println("study...");
	}
}