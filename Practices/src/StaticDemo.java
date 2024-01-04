class MyClass
{
	int m;//instance or non static variable
	static int n;
	void xxx() {
		m=10;
		n=20;
	}
	static void yyy()
	{
		//m=12;//its not static
		n=23;
	}
	void display() {
		System.out.println("m="+m+" n="+n);
	}
	
}
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass m=new MyClass();
		m.xxx();
		m.display();
		m.yyy();
		m.display();
		

	}

}
