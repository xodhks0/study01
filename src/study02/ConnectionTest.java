package study02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 포트번호
		String id = "bdi"; // 이름
		String pwd = "a1a2a3a4a5";  // 비밀번호 

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // Class 라는 class가 따로 존재한다.oracle을 사용할거라고 알려주는거
			Connection con = DriverManager.getConnection(url, id, pwd); // 접속부
			String sql = "select * from user_info"; // sql문
			Statement stmt = con.createStatement(); // 칠판(쿼리편집기)를 나타내는 부분 
			ResultSet rs = stmt.executeQuery(sql); //statement에 실행해라 query를 이란 뜻 rs란 변수가 모든 정보를 가지고 있다.
			while(rs.next()) { // 메모리가 다찰때까지
				System.out.println(rs.getString("etc"));
			}
		} catch (ClassNotFoundException | SQLException e) { // 철자를 틀리진 않았지만 예외처리를 강요하기 때문에 반드시 try catch문을 사용해줘야 한다.
			e.printStackTrace();
		} // 예외처리와 전화거는 방법
	}
}
