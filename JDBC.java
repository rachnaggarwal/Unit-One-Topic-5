package Demo;
// import packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBC {
	public static void main(String[] args) throws Exception{
		//load and 	Register the driver
		String url="jdbc:mysql://localhost:3306/rachna";
		String uname="rachna";
		String pass= "root";
		String query= "Select * from Student";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			String userData = rs.getInt(1)+":"+rs.getString(2);
			System.out.println(userData);
		}
		st.close();
		con.close();
	}
}

