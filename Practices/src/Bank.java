import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amt,bal,ch;
		System.out.println("Enter the for created amount in your account");
		Scanner s = new Scanner(System.in);
		bal=s.nextInt();
		do
		{
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Display balance");
			System.out.println("4.Exit");
			System.out.println("Enter your choice");
			ch=s.nextInt();
			switch(ch) {
			case 1: System.out.println("Enter Amount to Deposit");
			amt=s.nextInt();
			bal=amt+bal;
			//System.out.println(bal);
			break;
			
			case 2: System.out.println("Enter amount to withdraw");
			amt=s.nextInt();
			if(amt>bal)
			
				
				System.out.println("Insufficient balance");			
			else 
				bal=bal-amt;
				//System.out.println(bal);
			
				break;
			
			case 3: System.out.println(bal);break;
			
			case 4: System.out.println("Thanks for banking");break;
			default: System.out.println("Invalid Choice");
			}
		}
		while(ch!=4);
		{
		System.out.println("");
		}

	}

}
