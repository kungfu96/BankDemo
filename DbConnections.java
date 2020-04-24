import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DbConnections {

	// create metho for creating copnnection with db
	public static void insertData(String name, String addr, long acc, long mobile) {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "style", "style");
			PreparedStatement ps = con.prepareStatement("insert into Bank values(?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, addr);
			ps.setLong(3, acc);
			ps.setLong(4, mobile);
			boolean success = ps.execute();
		/*	if (success)
				System.out.println("Succeded");
			else
				System.out.println("failed");
*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// connect

	public static void insertData() {

		try {
			String str[]= new String[2];
					String num []= new String[2];
			String name = null, addr = null;
			long acc = 0, mobile = 0;
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "style", "style");
			PreparedStatement ps = con.prepareStatement("select * from Bank");
			// boolean success=ps.execute();
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.print("    "+rs.getString("NAME"));
				System.out.print("    "+rs.getString("ADDRESS"));
				System.out.print("    "+rs.getString("ACCOUNT"));
				System.out.println("    "+rs.getString("MOBILE"));
				System.out.println("====================================");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// connect

	public static void insertDataByName() {

		try {
			String name;
			System.out.println("Enter name to search");
			name=new Scanner(System.in).next();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "style", "style");
			PreparedStatement ps = con.prepareStatement("select * from Bank where name=?");
			ps.setString(1, name);
			// boolean success=ps.execute();
			ResultSet rs = ps.executeQuery();
			System.out.println("NAME      ADDRESS        ACC_NUMBER                 MOBILE");
			
			while (rs.next()) {
				System.out.print("    "+rs.getString("NAME"));
				System.out.print("    "+rs.getString("ADDRESS"));
				System.out.print("    "+rs.getString("ACCOUNT"));
				System.out.println("    "+rs.getString("MOBILE"));
				System.out.println("====================================");

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//insertDataByNAme
	
	
	
	public static void deleteAccount() {

		try {
			String name;
			System.out.println("Enter name to delete An Account");
			name=new Scanner(System.in).next();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "style", "style");
			PreparedStatement ps = con.prepareStatement("delete from bank where name=?");
			ps.setString(1, name);
			// boolean success=ps.execute();
			int row=ps.executeUpdate();
//			ResultSet rs = ps.executeQuery();
			System.out.println(row+"Accounts Deleted by Name"+name);
			
			} catch (Exception e) {
			e.printStackTrace();
		}
	}//insertDataByNAme


}//class
