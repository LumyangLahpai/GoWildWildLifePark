package com.crud;
import java.sql.*;
import java.util.ArrayList;
import com.content.*;
import com.dbconnector.*;
public class AnimalContentManager {
	public int insert(Animal a) throws ClassNotFoundException, SQLException {
		int result=-1;
		// get connection
		DBManager dbM = new DBManager();
		Connection con= dbM.getConnection();
		// Prepare Statement
		String sql="INSERT INTO `gowildwildlife`.`animal`\r\n"
				+ "(`Animal_Name`,\r\n"
				+ "`Gender`,\r\n"
				+ "`Year`,\r\n"
				+ "`enclosures _ID`,\r\n"
				+ "`Species_ID`,\r\n"
				+ "`Diet _ID`,\r\n"
				+ "`Keeper_ID`)\r\n"
				+ "VALUES\r\n"
				+ "(?,?,?,?,?,?,?)";
		PreparedStatement pstmt= con.prepareStatement(sql);
		pstmt.setString(1,a.getAnimal_Name());
		pstmt.setString(2,a.getGender());
		pstmt.setInt(3,a.getYear());
		pstmt.setInt(4,a.getEnclosures_ID());
		pstmt.setInt(5,a.getSpecies_ID());
		pstmt.setInt(6,a.getDiet_ID());
		pstmt.setInt(7,a.getKeeper_ID());
		result = pstmt.executeUpdate();
		con.close();
		return result;
	}
	public ArrayList<Animal> selectAllGroupByName() throws ClassNotFoundException, SQLException{
		ArrayList<Animal> animal = new ArrayList<Animal>();
		Animal a;
		DBManager dbM = new DBManager();
		Connection con= dbM.getConnection();
		String sql="select animal.Animal_ID,animal.Animal_Name,animal.Gender,animal.Year,animal.Keeper_ID,keepers.Name\r\n"
				+ "from animal left join keepers on animal.Keeper_ID=keepers.Keepers_ID;";
		PreparedStatement pstmt=con.prepareStatement(sql);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			a=new Animal(rs.getInt("Animal_ID"),
							rs.getString("Animal_Name"),
							rs.getString("Gender"),
							rs.getInt("Year"),
							rs.getInt("Keeper_ID"),
							rs.getString("Name"));
			animal.add(a);

		}
		con.close();
		return animal;
	}
	public ArrayList<Animal> selectAnimalandKeeperCount() throws ClassNotFoundException, SQLException{
		ArrayList<Animal> animal = new ArrayList<Animal>();
		@SuppressWarnings("unused")
		Animal a;
		DBManager dbM = new DBManager();
		Connection con= dbM.getConnection();
		String sql="select keepers.Name, count(animal.Animal_ID) as TotalAnimal "
				+ "from animal left join keepers on animal.Keeper_ID=keepers.Keepers_ID group by Keepers_ID;";
		PreparedStatement pstmt=con.prepareStatement(sql);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			a=new Animal(rs.getString("Name"),
							rs.getInt("TotalAnimal"));
			animal.add(a);
		} 
		con.close();
		return animal;
	}
	public ArrayList<Animal> selectAll() throws ClassNotFoundException, SQLException{
		ArrayList<Animal> animallist = new ArrayList<Animal>();
		Animal a;
		DBManager dbM = new DBManager();
		Connection con= dbM.getConnection();
		String sql="SELECT `animal`.`Animal_ID`,\r\n"
				+ "    `animal`.`Animal_Name`,\r\n"
				+ "    `animal`.`Gender`,\r\n"
				+ "    `animal`.`Year`,\r\n"
				+ "    `animal`.`enclosures _ID`,\r\n"
				+ "    `animal`.`Species_ID`,\r\n"
				+ "    `animal`.`Diet _ID`,\r\n"
				+ "    `animal`.`Keeper_ID`\r\n"
				+ "FROM `gowildwildlife`.`animal`;";
		PreparedStatement pstmt=con.prepareStatement(sql);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			a=new Animal(rs.getInt("Animal_ID"),
						 rs.getString("Animal_Name"),
						 rs.getString("Gender"),
						 rs.getInt("Year"),
						 rs.getInt("enclosures _ID"),
						 rs.getInt("Species_ID"),
						 rs.getInt("Diet _ID"),
						 rs.getInt("Keeper_ID"));
			animallist.add(a);

		}
		con.close();
		return animallist;
	}
	
}
