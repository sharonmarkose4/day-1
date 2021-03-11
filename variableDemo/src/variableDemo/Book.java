package variableDemo;

public class Book {
	int a=0;//instance variable
	
	void m() {
		int a=10;//local variable
		int b=20;
		System.out.println(this.a);
		if(a==10)
			b=20;//block level variable
	System.out.println(b);
	}
	
	public static void main(String[] args) {
		Book book=new Book();
		book.m();
	}
}

