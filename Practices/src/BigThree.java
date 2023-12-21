import java.util.Scanner;

public class BigThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		System.out.println("enter 3 the no");
		int n1=s.nextInt();
		int n2= s.nextInt();
		int n3 =s.nextInt();
		if (n1>n2 && n1>n3)
		{
			System.out.println("Big"+n1);
		}else
			if(n2>n3) {
				System.out.println("Big"+n2);
			}else
				System.out.println("Big"+n3);
					
			

	}

}
