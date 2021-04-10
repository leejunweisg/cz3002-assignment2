package model;

import java.sql.*;

public class User {

    public static boolean authenticate(String username, String password) {
        Connection conn = null;
        boolean result = false;

        try{
            // open connection
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment2?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC", "testuser", "password123!");   // For MySQL only

            // set up sql statement
            PreparedStatement prep_stmt = conn.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");
            prep_stmt.setString(1, username);
            prep_stmt.setString(2, password);

            // execute and receive result
            ResultSet rs = prep_stmt.executeQuery();
            result = rs.next();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }finally{
            // close connection
            try{
                conn.close();
            }catch(Exception e){}
        }

        // return result
        return result;
    }

}
