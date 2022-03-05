package com.crud;
import java.sql.*;
import java.util.*;
import com.content.*;
import com.dbconnector.*;
public class EnclosureContentManager {
	public int insert(Enclosure e) throws ClassNotFoundException, SQLException {
		int result=-1;
		// get connection
		DBManager dbM = new DBManager();
		Connection con= dbM.getConnection();
		// Prepare Statement
		String sql="INSERT INTO `gowildwildlife`.`enclosure`\r\n"
				+ "(`Type`,\r\n"
				+ "`Location`)\r\n"
				+ "VALUES\r\n"
				+ "(?,?);";
		PreparedStatement pstmt= con.prepareStatement(sql);
		pstmt.setString(1,e.getType());
		pstmt.setString(2,e.getLocation());
		result = pstmt.executeUpdate();
		con.close();
		return result;
	}
	public ArrayList<Enclosure>selectAll() throws ClassNotFoundException, SQLException{
		ArrayList<Enclosure> enclosures = new ArrayList<Enclosure>();
		Enclosure e;
		DBManager dbM = new DBManager();
		Connection con= dbM.getConnection();
		String sql="SELECT `enclosure`.`enclosure_id`,\r\n"
				+ "    `enclosure`.`Type`,\r\n"
				+ "    `enclosure`.`Location`\r\n"
				+ "FROM `gowildwildlife`.`enclosure`";
		PreparedStatement pstmt=con.prepareStatement(sql);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			e=new Enclosure(rs.getInt("enclosure_id"),
							rs.getString("Type"),
							rs.getString("Location"));
			enclosures.add(e);

		}
		con.close();
		return enclosures;
	}
	public Enclosure getById(int id) throws ClassNotFoundException, SQLException {
		Enclosure content =null;
		DBManager dbM=new DBManager();
	Connection con=dbM.getConnection();
	String sql ="SELECT `enclosure`.`enclosure_id`,\r\n"
			+ "    `enclosure`.`Type`,\r\n"
			+ "    `enclosure`.`Location`\r\n"
			+ "FROM `gowildwildlife`.`enclosure` where `enclosure`.`enclosure_id`=?";
	PreparedStatement pstmt =con.prepareStatement(sql);
	pstmt.setInt(1, id);
	ResultSet rs = pstmt.executeQuery();
	//populate the array list from the record of the table_html
	while (rs.next()) {
		 content = new Enclosure(rs.getInt("enclosure_id"),
								 rs.getString("Type"),
								 rs.getString("Location"));
	}
	con.close();
	return content;
	}
	public int update(Enclosure e) throws ClassNotFoundException, SQLException{
		
		int result=-1;
		
		//1. get connection
		DBManager dbM=new DBManager();
		Connection conn=dbM.getConnection();
		
		//2.prepare statement
		
		String sql = "UPDATE `gowildwildlife`.`enclosure`\r\n"
				+ "SET\r\n"
				+ "`Type` = ?,\r\n"
				+ "`Location` = ?\r\n"
				+ "WHERE `enclosure_id` =?";


		PreparedStatement pstmt=conn.prepareStatement(sql);
		
		// first and second parameters inserted 1. course name and course text
		
		pstmt.setInt(3, e.getEnclosureId());
		pstmt.setString(1, e.getType());
		pstmt.setString(2, e.getLocation());
		
		
		
		//3.execute statement
		
		result = pstmt.executeUpdate();
		
		return result;
		
	}
	public int delete (int id) throws SQLException, ClassNotFoundException {
	    int rowsDeleted = -1;
	    String sql ;
		//1. get Connection
		DBManager dbM = new DBManager();
		Connection con = dbM.getConnection();
		
		//2. prepare the statement 
	    sql = "DELETE FROM `gowildwildlife`.`enclosure`\r\n"
	    		+ "WHERE `enclosure_id` =?";
	    PreparedStatement pstmt = con.prepareStatement(sql);
	    //First parameter is the course id of the course entity
	    pstmt.setInt(1, id);

	    rowsDeleted = pstmt.executeUpdate();
	    return rowsDeleted;
	}
}
