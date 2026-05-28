package rohit;

import java.util.Scanner;

public class atm {
	public static void main(String[]args) {
		int pin;
		int bal=10000;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your pin...");
		pin=sc.nextInt();
		if(1234==pin) {
			System.out.println("welcome to the HDFC bank");
			System.out.println("1.Balanace");
			System.out.println("2. Deposite");
			System.out.println("3.Withdraw");
			System.out.println("Enter your choice.");
			int num=sc.nextInt();
			switch(num)
			{
			case 1:
				System.out.println("you balanace is "+bal);
			case 2:
				int dep;
				System.out.println("enter the balance for deposite");
				dep=sc.nextInt();
				int sum=dep+bal;
				System.out.println("Deposite banalance is "+dep);
				System.out.println("Total balanace is "+sum);
				bal=sum;
				break;
			case 3:
				System.out.println("Enter the amount for withdraw.");
				int wi=sc.nextInt();
				if(wi<=bal) {
					int sub=bal-wi;
					System.out.println("successful");
					System.out.println("withdraw balance is "+wi);
					System.out.println("total balance is "+sub);
					
				}
				else
				{
					System.out.println("insufficient Balance");
				}
			}
		}
		else
		{
			System.out.println("wrong your pin");
		}
	}

}
