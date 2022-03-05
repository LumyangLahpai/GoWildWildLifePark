package com.dbconnector;
import java.sql.*;
import com.content.*;
import com.crud.*;
public class DBManagerTest {
public static void main(String[] args) {
	//create object of DBManager Class
	DBManager dbM = new DBManager();
	try {
		dbM.getConnection();
		System.out.print("Connection successfully");
		//Dave 1998-01-01 
		Keeper keeper= new Keeper(null,null,null,null,null);
		keeper.setName("Dave");
		keeper.setDateofbirth("98-1-1");
		keeper.setEmail("dave1211@gmail.com");
		keeper.setPhone("09470022116");
		keeper.setRank("Senior");
		KeeperContentManager kcm= new KeeperContentManager();
		int rowInserted= kcm.insert(keeper);
		if(rowInserted==1) {
			System.out.println("Successfully Inserted");
		}
	}
	catch(ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
}
}
