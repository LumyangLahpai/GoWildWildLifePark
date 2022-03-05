package com.crud;
import java.sql.*;
import com.content.*;
import com.dbconnector.*;
public class DietContentManager {
	public int insert(Diet d) throws ClassNotFoundException, SQLException {
		int result=-1;
		// get connection
		DBManager dbM = new DBManager();
		Connection con= dbM.getConnection();
		// Prepare Statement
		String sql="INSERT INTO `gowildwildlife`.`diet`\r\n"
				+ "(`Diet_type`,\r\n"
				+ "`numberoffeed`)\r\n"
				+ "VALUES\r\n"
				+ "(?,?)";
		PreparedStatement pstmt= con.prepareStatement(sql);
		pstmt.setString(1,d.getDietType());
		pstmt.setInt(2,d.getNumberoffeed());
		result = pstmt.executeUpdate();
		con.close();
		return result;
	}
}