import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		char choice;
		Account acc=new Account();
		String user = "", password = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("---------Welcome To APNA BANK--------------");
		System.out.println("********************************************");
		System.out.println("please Login First");
		System.out.println("Enter Username ");
		user = sc.next();
		System.out.println("Enter PAssword ");
		password = sc.next();
		if (user.equals("raja") && password.equals("rani")) {
			Account a1;
			do {
				System.out.println("Enter Option You Want to Perform");
				System.out.println("1.CREATE NEW ACCOUNT");
				System.out.println("2.DELETE ACCOUNT");
				System.out.println("3.UPDATE raDETAILS");
				System.out.println("4.VIEW DETAILS");
				System.out.println("5.EXIT");
				int ch = 0;
				ch = sc.nextInt();
				switch (ch) {

				case 1:
					 a1 = new Account();
						a1.createAccount();
						//a2 = a1;
						break;
				case 2:
					DbConnections.deleteAccount();
					 	break;
					case 4:
					acc.show();
					break;
				case 5:

					System.out.println("You are Exiting");
					System.exit(0);
					break;

				default:
					System.out.println("Invalid Choice ...please Enter Valid Choice");
					break;
				}// switch
				System.out.println("Do you want to continue (Y/N) ?");
				choice = sc.next().charAt(0);
			} while (choice == 'y' || choice == 'Y');
		} else {
			System.out.println("Enter Valid Username and Password");

		} // else

	}// main
}// class

// TODO Auto-generated method stub
/*
 * Customer c = new Customer(); c.setName("Rajesh"); c.setAddress("pune");
 * c.setAcc_num(1234567890); c.setMobile(992145785); Account a = new Account();
 * int value = a.createAccount(c); if (value == 1) { a.show(); } else {
 * System.out.println("Error ....ACcount not created"); } //
 * System.out.println(cc);
 * 
 * } }
 */