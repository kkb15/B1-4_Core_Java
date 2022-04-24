import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class Cruddb {

	public static void main(String[] args) {
	
		String dbURL="jdbc:mysql://127.0.0.1:3306/sample";
		String dbUserName="root";
		String dbPassword="root";
		
		try {
			Connection c=DriverManager.getConnection(dbURL,dbUserName,dbPassword);
			String sql = "INSERT INTO Employee (User_ID,Name,password,Email) VALUES (?, ?, ?, ?)";
			try
			{
				Connection con=DriverManager.getConnection(dbURL,dbUserName,dbPassword);
				String Sql = "select * from Employee";
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(Sql);
				
				while(rs.next())
				{
					int id=rs.getInt(1);
					String name=rs.getString(2);
					String pass=rs.getString(3);
					String email=rs.getString("email");
					String res="User: %d: %s - %s - %s";
					System.out.println(String.format(res,id, name, pass, email));
				}
				c.close();		
			/*PreparedStatement p=c.prepareStatement(sql);
								p.setString(1, "242");
								p.setString(2, "Soujan Poojari");
								p.setString(3, "Pass@123");
								p.setString(4, "s@gmail.com");
								int row = p.executeUpdate();
			if(row>0) {
				System.out.println("Inserted successfully");
				c.close();
				*/
			}
		}
			catch(SQLException e) {
				e.printStackTrace();
			}
		}

	}

