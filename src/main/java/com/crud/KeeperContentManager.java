package com.crud;
import com.content.*;
import com.dbconnector.*;
import java.sql.*;
import java.util.ArrayList;
public class KeeperContentManager {
	public int insert(Keeper k) throws ClassNotFoundException, SQLException {
		int result = -1;
		// 1.get connection
		DBManager dbM = new DBManager();
		Connection conn= dbM.getConnection();
		// 2.Prepare Statement
		String sql = "INSERT INTO `gowildwildlife`.`keepers`\r\n"
				+ "(`Name`,\r\n"
				+ "`date_of_birth`,\r\n"
				+ "`email`,\r\n"
				+ "`phone`,\r\n"
				+ "`rank`)\r\n"
				+ "VALUES\r\n"
				+ "(?,?,?,?,?)";
		PreparedStatement pstmt= conn.prepareStatement(sql);
		pstmt.setString(1, k.getName());
		pstmt.setString(2, k.getDateofbirth());
		pstmt.setString(3, k.getEmail());
		pstmt.setString(4, k.getPhone());
		pstmt.setString(5, k.getRank());
		result = pstmt.executeUpdate();
		conn.close();
		return result;
	}
	public ArrayList<Keeper>selectAll() throws ClassNotFoundException, SQLException{
		ArrayList<Keeper> keeper = new ArrayList<Keeper>();
		Keeper k;
		DBManager dbM = new DBManager();
		Connection con= dbM.getConnection();
		String sql="SELECT `keepers`.`Keepers_ID`,\r\n"
				+ "    `keepers`.`Name`,\r\n"
				+ "    `keepers`.`date_of_birth`,\r\n"
				+ "    `keepers`.`email`,\r\n"
				+ "    `keepers`.`phone`,\r\n"
				+ "    `keepers`.`rank`\r\n"
				+ "FROM `gowildwildlife`.`keepers`";
		PreparedStatement pstmt=con.prepareStatement(sql);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			k=new Keeper(rs.getInt("Keepers_ID"),
							rs.getString("Name"),
							rs.getString("date_of_birth"),
							rs.getString("email"),
							rs.getString("phone"),
							rs.getString("rank"));
			keeper.add(k);
		}
		con.close();
		return keeper;
	}
	public Keeper getById(int id) throws ClassNotFoundException, SQLException {
		Keeper content =null;
		DBManager dbM=new DBManager();
	Connection con=dbM.getConnection();
	String sql ="SELECT `keepers`.`Keepers_ID`,`keepers`.`Name`,`keepers`.`date_of_birth`,`keepers`.`email`,`keepers`.`phone`,`keepers`.`rank`"
			+ "FROM `gowildwildlife`.`keepers`WHERE `keepers`.`Keepers_ID` = ?;";
	PreparedStatement pstmt =con.prepareStatement(sql);
	pstmt.setInt(1, id);
	ResultSet rs = pstmt.executeQuery();
	//populate the array list from the record of the table_html
	while(rs.next()) {
		content=new Keeper(rs.getInt("Keepers_ID"),
						rs.getString("Name"),
						rs.getString("date_of_birth"),
						rs.getString("email"),
						rs.getString("phone"),
						rs.getString("rank"));
	}
	con.close();
	return content;
	}
public int update(Keeper k) throws ClassNotFoundException, SQLException{
		
		int result=-1;
		
		//1. get connection
		DBManager dbM=new DBManager();
		Connection conn=dbM.getConnection();
		
		//2.prepare statement
		
		String sql = "UPDATE `gowildwildlife`.`keepers`\r\n"
				+ "SET\r\n"
				+ "`Name` = ?,\r\n"
				+ "`date_of_birth` = ?,\r\n"
				+ "`email` = ?,\r\n"
				+ "`phone` = ?,\r\n"
				+ "`rank` = ?\r\n"
				+ "WHERE `Keepers_ID` = ?;";


		PreparedStatement pstmt=conn.prepareStatement(sql);
		
		// first and second parameters inserted 1. course name and course text
		
		pstmt.setInt(6, k.getKeeperId());
		pstmt.setString(1, k.getName());
		pstmt.setString(2, k.getDateofbirth());
		pstmt.setString(3, k.getEmail());
		pstmt.setString(4, k.getPhone());
		pstmt.setString(5, k.getRank());
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
	    sql = "DELETE FROM `gowildwildlife`.`keepers`\r\n"
	    		+ "WHERE `Keepers_ID` = ?";
	    PreparedStatement pstmt = con.prepareStatement(sql);
	    //First parameter is the course id of the course entity
	    pstmt.setInt(1, id);

	    rowsDeleted = pstmt.executeUpdate();
	    return rowsDeleted;
	}
}
