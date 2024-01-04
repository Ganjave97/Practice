class Sample
{
	int i;
	int j;
	Sample(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
	void display()
	{
		System.out.println("i="+i+"  "+"j="+j);
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample e1=new Sample(10,20);
		e1.display();
		

	}

}
