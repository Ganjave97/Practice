import java.util.Scanner;

public class CheckNumber {
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=s.nextInt();
		if (n<0)
		{
			System.out.println("Number is Negative");
		}
		else
			if(n>0)
			{
				System.out.print("Number is Positive");
			}else
				System.out.println("Zero");
	}

}
