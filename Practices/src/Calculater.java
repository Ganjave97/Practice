import java.util.Scanner;

public class Calculater {

		public static void main(String[] args) {
		    Scanner s=new Scanner(System.in);
		    int result=0,ch;
		    do 
		    {
		    System.out.println("Enter the Number");
		    int n1=s.nextInt();
		    int n2=s.nextInt();
		    System.out.println("Enter Your choice");
		    System.out.println("1.Add");
		    System.out.println("2.Subtract");
		    System.out.println("3.multiply");
		    System.out.println("4.Divide");
		    ch=s.nextInt();
		    
		    switch(ch)
		    {
		      case 1:result=n1+n2;
		      break;
		      case 2:result=n1-n2;
		      break;
		      case 3:result=n1*n2;
		      break;
		      case 4:result=n1/n2;
		      break;
		      default: System.out.println("Enter invalid choice");break;//comes out of progress
		    }
		    System.out.println("Result = "+result);
		    } while(ch!=0 );  	
		    	
			
		}
	}

