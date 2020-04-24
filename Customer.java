import java.util.Scanner;

public class Customer {

	String name,address;
	long mobile;
	Scanner sc= new Scanner(System.in);
		public String getName() {
		return name;
	}
	public void setName() {
		System.out.println("Enter NAme");
		String name=sc.next();
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress() {
		System.out.println("Enter Address");
		String addr=sc.next();
	
		this.address = addr;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile() {
		System.out.println("Enter Mobile");
		long mobi=sc.nextLong();
	
		this.mobile = mobi;
	}
	
	
}
