
public class Institute {
	public static void main(String[] args) {
		StudentAbstract student1=new CollegeStudent();
		student1.study();
		student1.admit();
		StudentAbstract student2=new HighSchoolStudent();
		student2.study();
		student2.admit();	
		}
}
