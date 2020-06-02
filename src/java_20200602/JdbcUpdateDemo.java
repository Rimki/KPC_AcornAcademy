package java_20200602;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface JdbcUpdateDemo {
	public static void main(String[] args) {

		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kpc", "kpc12", "kpc1234");

			StringBuffer sql = new StringBuffer();
			sql.append("update member set name = ?,addr =? where num =?");
			pstmt = con.prepareStatement(sql.toString());

			int index = 0;
			pstmt.setString(++index, "성영한1");
			pstmt.setString(++index, "서울1");
			pstmt.setInt(++index, 1);
			
			
			pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
