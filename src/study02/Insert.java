package study02; //시험에 나옴

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {

		Connection con = null;
		try {
			con = DriverManager.getConnection(ConnectionTest3.URL, ConnectionTest3.ID, ConnectionTest3.PWD);
			String sql = "insert into user_info(id, pwd, name, age, etc )";
			Scanner scan = new Scanner(System.in);
			System.out.println("당신의 정보를 \",\" 기준으로 입력해주세요.");
			String info = scan.nextLine();
			String[] infos = info.split(",");
			sql += "values(";
			for(int i =0; i<infos.length;i++) {
				sql += "'" + infos[i] + "'"+ ","; 
			}
			sql = sql.substring(0,sql.length()-1);
			sql += ")";
			
			Statement stmt = con.createStatement();
			int result = stmt.executeUpdate(sql); //
			System.out.println("인서트된 갯수 :" + result);
	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
