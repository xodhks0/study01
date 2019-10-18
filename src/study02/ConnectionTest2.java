package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConnectionTest2 {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "BDI";
		String pwd = "12345678";
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,id,pwd);
			Statement stmt = con.createStatement();
			String sql = "select * from USER_INFO";
			ResultSet rs = stmt.executeQuery(sql);
			List<Map<String,String>> userList = new ArrayList<Map<String,String>>();
			while(rs.next()) {
				System.out.println(rs.getString("id"));
				Map<String,String> userMap = new HashMap<String,String>();
				userMap.put("id",rs.getString("id"));
				userMap.put("pwd",rs.getString("pwd"));
				userMap.put("name",rs.getString("name"));
				userMap.put("age",rs.getString("age"));
				userMap.put("etc",rs.getString("etc"));
				userList.add(userMap);
			}
			System.out.println(userList);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}// 순서대로 입력하고 출력할 때 가장 빠른게 List라서 ArrayList를 많이쓴다.
		// 순서 상관없을 때는 map을 사용한다.
		finally { // 성공했던 실패했던 반드시 실행해야 할 때 finally를 사용한다.
			if(con!=null) {
				try {
					con.close(); //연결끊을 때 자동으로 커밋이 된다 (오라클만의 고유기능)
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
			}
		}
	}
}
