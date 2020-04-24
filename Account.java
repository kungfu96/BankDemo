import java.util.Random;
import java.util.Scanner;

public class Account {
	String acc_name, acc_addr;
	long acc_mobile;
	long acc_num;
	Account ac;

	public long getAcc_num() {
	
		return acc_num;
	}

	public void setAcc_num() {
		long num = new Random().nextLong();
		// acc_num = num;
		this.acc_num = num;
	}

	public void createAccount() {
		Customer c = new Customer();
		Account a1= new Account();
	 c.setName();
	 a1.acc_name=c.getName();
	 c.setAddress();
		a1.acc_addr = c.getAddress();
		
		c.setMobile();
		a1.acc_mobile = c.getMobile();
		a1.setAcc_num();
		acc_num = a1.getAcc_num();
		DbConnections.insertData(a1.acc_name,  a1.acc_addr,a1.acc_num, a1.acc_mobile);
		
	//a1.show();
	}


	public void showByName() {
	
	}
	
	
//void delete((//Account ))
	public void show() {
		int ch;
		char choice;
		System.out.println("1.All Accounts");
		System.out.println("2.Search By Name");

		System.out.println("Enter Your Choice");
		ch=new Scanner(System.in).nextInt();
		do {
			switch(ch) {
			case 1:

				System.out.println("NAME      ADDRESS        ACC_NUMBER                 MOBILE");
				DbConnections.insertData();
				break;
			case 2:
				DbConnections.insertDataByName();
				break;
				default:
					System.out.println("PLease Enter Valid Chioce");
			}
	System.out.println("Do you want to continue(Y/N");
	choice=new Scanner(System.in).next().charAt(0);
		}
		while(choice=='y'||choice=='Y');
	}

	public void setAcc_mobile(long acc_mobile) {
		
		this.acc_mobile = acc_mobile;
	}

}
