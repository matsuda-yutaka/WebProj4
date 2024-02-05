package com.diworksdev.webproj4.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	/**
	 * JDBC　ドラーバー名
	 */
	private static String driverName = "com.mysql.jdbc.Driver";
	/**
	 * データベース接続　URL
	 */
	private static String url = "jdbc:mysql://localhost/testdb?enabledTLSProtocols=TLSv1.2";
	/**
	 * データベース接続ユーザー名
	 */
	private static String user = "root";
	/**
	 * データベース接続パスワード
	 */
	private static String password = "root";
	
	public Connection getConnecion() {
		Connection con = null;
		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(url,user,password);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}