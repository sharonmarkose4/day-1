
public class School {
public static void main(String[] args) {
	
	printPattern();

}

private static void printPattern() {
	// TODO Auto-generated method stub
	for(int j=0;j<5;j++) {
		for(int k=0;k<j+1;k++) {
		System.out.print("*");
	}
	System.out.println("");
	
}
}


void practice()
//teacher.setAge((byte)30);
{int i=0;
while(i<10) {
	Teacher teacher=new Teacher("Shyam"+i);
	i++;
}
}

void studentDiscussion() {
	System.out.println("Hello");
	Student student=new Student("Ram");
	student.setAge((byte)10);
	//student.setName("         ");avoid
	//student.name = "Ram";//avoid
	System.out.println("Name ="+student.getName());
	System.out.println("Age ="+student.getAge());
	student.study();
}
}
