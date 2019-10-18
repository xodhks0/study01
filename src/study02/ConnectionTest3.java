package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionTest3 {
	// 변하지 않을거라 가정을 깔고 간 상태이기 때문에 static final을 사용한다.
	public static final String URL;
	public static final String ID;
	public static final String PWD;
	public static final String DRIVER_NAME;

	static { // static 영역
		URL = "jdbc:oracle:thin:@localhost:1521:xe";
		ID = "BDI";
		PWD = "12345678";
		DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
		try {// 더 이상 검증하지 않을거라 따로 뺀다.
			Class.forName(DRIVER_NAME);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Connection con = null;
		try {
			con = DriverManager.getConnection(URL, ID, PWD);
			String sql = "select * from USER_INFO ";

			Scanner scan = new Scanner(System.in);
			System.out.println("검색할 아이디를 입력해주세요 :");
			String id = "'%" + scan.nextLine() + "%'";
			sql += "where id like" + id + " ";

			// PreparedStatement ps = con.prepareStatement(sql);

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getString("id"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
