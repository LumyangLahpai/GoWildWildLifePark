package com.crud;
import java.sql.*;
import com.content.*;
import com.dbconnector.*;
public class SpeciesContentManager {
	public int insert(Species s) throws ClassNotFoundException, SQLException {
		int result = -1;
		// 1.get connection
		DBManager dbM = new DBManager();
		Connection con= dbM.getConnection();
		// 2.Prepare Statement
		String sql = "INSERT INTO `gowildwildlife`.`species`\r\n"
				+ "(`Species_type`,\r\n"
				+ "`Species_Group`,\r\n"
				+ "`Conversation_status`,\r\n"
				+ "`Life_Style`)\r\n"
				+ "VALUES\r\n"
				+ "(?,?,?,?);";
		PreparedStatement pstmt= con.prepareStatement(sql);
		pstmt.setString(1,s.getSpeciesType());
		pstmt.setString(2,s.getSpeciesGroup());
		pstmt.setString(3,s.getConversationStatus());
		pstmt.setString(4,s.getLifeStyle());
		result = pstmt.executeUpdate();
		con.close();
		return result;
	}
}
