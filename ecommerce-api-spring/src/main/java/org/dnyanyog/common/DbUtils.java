package org.dnyanyog.common;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtils {
	private static Connection connection;
	private static Statement statement;

	static {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ecommerse", "root", "sakshi@2004");

			statement = connection.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static ResultSet executeSelectQuery(String query) throws SQLException {
		ResultSet result = statement.executeQuery(query);
		return result;
	}

	public static boolean executeQuery(String query) throws SQLException {
		return statement.execute(query);
	}

	public static int executeUpdateQuery(String query) throws SQLException {
		return statement.executeUpdate(query);

	}

}
