package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.protocol.Resultset;

import bean.User;

public class UserImp implements UserDao {

	@Override
	public List<User> all() {
		Connection conn = null;
		List<User> resultList = new ArrayList<User>();
		try {
//ket noi database
			conn = DatabaseConnection.getConnection();
//tao statement
			Statement stmt = conn.createStatement();
//ResulSet Lấy kq trả về
			ResultSet result = stmt.executeQuery("SELECT * FROM user;");
			while (result.next()) {
				String name = result.getString("userName");
				String pass = result.getString("password");
				resultList.add(new User(name, pass));
			}
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return resultList;
	}

	@Override
	public int insert(User user) {
		// TODO Auto-generated method stub
		Connection conn = null;
		int row = 0;
		try {
			String sqluser = "INSERT INTO user (email, pass) VALUES (?, ?)";
			String sqldetail = "INSERT INTO userdetail (email,firstname, lastname) VALUES (? , ? , ?)";
			conn = DatabaseConnection.getConnection();
			PreparedStatement preStatement1 = conn.prepareStatement(sqluser);
			preStatement1.setString(1, user.getEmail());
			preStatement1.setString(2, user.getPassword());
			row += preStatement1.executeUpdate();
			PreparedStatement preStatement2 = conn.prepareStatement(sqldetail);
			preStatement2.setString(1, user.getEmail());
			preStatement2.setString(2, user.getFirstname());
			preStatement2.setString(3, user.getLastname());
			row += preStatement2.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return row ;
	}

	@Override
	public int update(User user) {
		return 0;
		// TODO Auto-generated method stub

	}

	@Override
	public int delete(User user) {
		return 0;
		// TODO Auto-generated method stub

	}

	@Override
	public User findById(User user) {
		Connection conn = null;
		User userTemp = null;
		try {
			conn = DatabaseConnection.getConnection();
			String sql = "SELECT * FROM user us JOIN userdetail usd on us.email=usd.email WHERE us.email= ? AND us.pass= ?;";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getEmail());
			pstmt.setString(2, user.getPassword());
			ResultSet result = pstmt.executeQuery();

			if (result.next()) {
				String email = result.getString("email");
				String pass = result.getString("pass");
				String firstName = result.getString("firstname");
				String lastName = result.getString("lastname");
				userTemp = new User(firstName, lastName, email, pass);
			}
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return userTemp;
	}
}
