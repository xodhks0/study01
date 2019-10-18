package study02; //시험에 나옴

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteTest {

	public static void main(String[] args) {

		Connection con = null;
		try {
			con = DriverManager.getConnection(ConnectionTest3.URL, ConnectionTest3.ID, ConnectionTest3.PWD);
			String sql = "delete from user_info where ";
			Scanner scan = new Scanner(System.in);
			System.out.println("삭제하고 싶은 항목을 알려주세요(id,pwd,name,age,etc)");
			String str1 = scan.nextLine();
			System.out.println(str1=="id");
			if (str1 == "id") {
				Scanner scan2 = new Scanner(System.in);
				System.out.println("몇살까지 삭제?");
				String info = str1;

				String info2 = scan2.nextLine();
				sql += info + "<" + info2;
			}
			else {
				System.out.println("오류?");
			}

			// Statement stmt = con.createStatement();
			// ResultSet rs = stmt.executeQuery(sql);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
