	package com.db;
	import java.sql.*;
	import java.util.Scanner;
	
	public class ConnectToDB {
	
		public static void main(String[] args) {
			
			Connection c = null;
			try {
				// you must specify the type of connection to database
				// define this connection
				Class.forName("org.sqlite.JDBC");
				// initialize this connection
				c = DriverManager.getConnection("jdbc:sqlite:info.db");
				
				System.out.println("Successfully connected");
				
				System.out.println("Select Process:\n1- Insert\n2- Select\n3- Deleten\n4- Update");
				Scanner scanner = new Scanner(System.in);
				Statement statement = c.createStatement();
				int selection = scanner.nextInt();
				switch (selection) {
				case 1:
					Scanner usernameIn = new Scanner (System.in);
					Scanner passwordIn = new Scanner(System.in);
					System.out.println("Enter username: ");
					String username = usernameIn.next();
					System.out.println("Enter password: ");
					String password = passwordIn.next();
					
					// insert data
					String SQL_ENTRIES =  "INSERT INTO admins ( user_name , password ) VALUES (' " + username + " ' , ' " + password + " ' )";
					// execute the above statement in the database
					
					statement.executeUpdate(SQL_ENTRIES);
					
					c.commit();
					statement.close();
					c.close();
					
					System.out.println("Record is added");
					break;
				case 2:
					// Read or select data from database
			
					String sqlRead = "SELECT * FROM admins";
					
					ResultSet resultSet = statement.executeQuery(sqlRead);
					System.out.println("id\t\tusername\t\tpassword\n");
					while ( resultSet.next()) {
						int id = resultSet.getInt("id");					
						String userName = resultSet.getString("user_name");
						String passWord = resultSet.getString("password");
						System.out.println( id + "\t\t" + userName + "\t\t\t" + passWord);
						
					}
					resultSet.close();
					statement.close();
					c.close();
					
					break;
				case 3:
					Scanner idIn = new Scanner (System.in);
					System.out.println("Enter ID:");
					int id = idIn.nextInt();
					String sqlDeleted = "DELETE FROM admins WHERE id=" + id;
					statement.executeUpdate(sqlDeleted);
					c.commit(); // add // delete/ update
					statement.close();
					c.close();		
					System.out.println("Record is deleted");
					break;
				case 4:
					
					// update password
					Scanner idUpdate = new Scanner (System.in);
					Scanner passwordUpdate = new Scanner(System.in);
					System.out.println("Enter ID: ");
					int iD = idUpdate.nextInt();
					System.out.println("Enter new password: ");
					String passWord = passwordUpdate.next();
					String sqlPassword = "UPDATE admins SET password = '" + passWord + "'" + "where id=" + iD;
					statement.executeUpdate(sqlPassword);
					c.commit();
					statement.close();
					c.close();
					break;
					}
			
				}catch( Exception ex) {
				System.out.println("No Connection");
				System.exit(0);
			}
			}
	}