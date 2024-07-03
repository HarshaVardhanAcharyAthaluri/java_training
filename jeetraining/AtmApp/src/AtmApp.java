import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtmApp {

	public static void main(String[] args) {
		try {
			// Register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/perfecient_training", "root",
					"admin");

			Scanner sc = new Scanner(System.in);
			System.out.println("==== Choose An Option ====");
			System.out.println("1) Existing User");
			System.out.println("2) New User");
			Integer usropt = sc.nextInt();

			switch (usropt) {
			case 1: {
				System.out.println("Enter Card Number");
				Integer carnumber = sc.nextInt();
				System.out.println("Enter Pin");
				Integer pin = sc.nextInt();
				String sql = "select * from userdetals where cardnum=? AND pin = ?";
				PreparedStatement ptstmt = con.prepareStatement(sql);
				ptstmt.setInt(1, carnumber);
				ptstmt.setInt(2, pin);
				ResultSet rs = ptstmt.executeQuery();
				if (rs.next()) {
					System.out.println("== Welcome Mr/Mrs " + rs.getString("username") + " === ");
					System.out.println("Choose Option");
					System.out.println("1) Balance Enquery");
					System.out.println("2) Deposit");
					System.out.println("3) Withdraw");
					Integer opt = sc.nextInt();
					switch (opt) {
					case 1: {
						String balance = "select balance from userdetals where cardnum=?";
						PreparedStatement ptstmt1 = con.prepareStatement(balance);
						ptstmt1.setInt(1, carnumber);
						ResultSet balancers = ptstmt1.executeQuery();
						if (balancers.next()) {
							System.out.println("Available Balance:: " + rs.getInt("balance"));
						}
						break;
					}
					case 2: {
						System.out.println("Insert Amount");
						Integer deposit = sc.nextInt();
						String depositbalance = "update userdetals set balance = ? where cardnum=?";
						PreparedStatement depositptstmt = con.prepareStatement(depositbalance);
						depositptstmt.setInt(1, deposit);
						depositptstmt.setInt(2, carnumber);
						depositptstmt.execute();
						
						String depositbalancsql = "select balance from userdetals where cardnum=?";
						PreparedStatement depositbalancsqlbalancersqlstmt = con.prepareStatement(depositbalancsql);
						depositbalancsqlbalancersqlstmt.setInt(1,deposit);
						ResultSet depositbalancsqlrs = depositbalancsqlbalancersqlstmt.executeQuery();
						
						if (depositbalancsqlrs.next()) {
							System.out.println("Available Balance:: " + depositbalancsqlrs.getInt("balance"));
						}
						break;
					}
					case 3: {
						System.out.println("Insert Amount to Withdraw");
						Integer withdraw = sc.nextInt();
						String balancersql = "select balance from userdetals where cardnum=?";
						PreparedStatement balancersqlstmt = con.prepareStatement(balancersql);
						balancersqlstmt.setInt(1, carnumber);
						ResultSet balancers = balancersqlstmt.executeQuery();
						if (balancers.next()) {
							int exitingBalance = rs.getInt("balance");
							if (exitingBalance >= withdraw) {
								int finalBalance = exitingBalance - withdraw;
								String balance = "update userdetals set balance = ? where cardnum=?";
								PreparedStatement withdrastmt = con.prepareStatement(balance);
								withdrastmt.setInt(1, finalBalance);
								withdrastmt.setInt(2, carnumber);
								 withdrastmt.execute();
								 
								String balancesql = "select balance from userdetals where cardnum=?";
								PreparedStatement withdrastmtbalance = con.prepareStatement(balancesql);
								withdrastmtbalance.setInt(1, carnumber);
								ResultSet withdrablanace = withdrastmtbalance.executeQuery();
								if (withdrablanace.next()) {
									System.out.println("Available Balance:: " + withdrablanace.getInt("balance"));
								}
							}else {
								System.out.println("insuffecient Balance :: "+ exitingBalance);
							}
						}
						break;
					}
					}

				}
				break;
			}
			
			case 2:{
				System.out.println("Enter Cardnumber");
				Integer card = sc.nextInt();
				System.out.println("Set pin");
				Integer pin = sc.nextInt();
				System.out.println("UserNMe");
				String username = sc.next();
				System.out.println("Balance");
				Integer balance = sc.nextInt();
				
				String newuser = "insert into userdetals values (?,?,?,?)";
				
				PreparedStatement newuserstmt = con.prepareStatement(newuser);
				newuserstmt.setInt(1, card);
				newuserstmt.setString(2, username);
				newuserstmt.setInt(3, pin);
				newuserstmt.setInt(4, balance);
				newuserstmt.execute();
					System.out.println("Congrats User Created success");
				
				break;
			}
			}

			con.close();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
