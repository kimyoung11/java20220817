package ch10.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.SQLException;

import javax.sql.DataSource;

public class C03exception {
	
	static DataSource db = null;
	
	public static void main(String[] args) throws SQLException{
		method1();
	
	}
	
	public static void method1() throws SQLException{
		method2();
	}
	public static void method2() throws SQLException{
		method3();
	}
	public static void method3() throws SQLException{
		db.getConnection();
	}
	
}
