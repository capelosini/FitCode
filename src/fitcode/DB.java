/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitcode;
import java.sql.*;
import javax.swing.JOptionPane;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DB {
    
    Connection conn;
    String dbFileName="users.db";
    
    void connectDB(){
        try{
            this.conn=DriverManager.getConnection("jdbc:sqlite:"+this.dbFileName);
            String createTableSQL = "CREATE TABLE IF NOT EXISTS users (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, secondName TEXT, height FLOAT, weight FLOAT, email TEXT, password TEXT)";
            try (PreparedStatement createTableStmt = this.conn.prepareStatement(createTableSQL)) {
                createTableStmt.execute();
            }
        } catch( SQLException e ){
            this.conn=null;
            showError(e);
        }
    }
    
    Connection getConn(){
        return this.conn;
    }
    
    void showError(SQLException e){
        JOptionPane.showMessageDialog(null, "Problema com o Banco de Dados\n"+e);
    }
    
    void closeConn(){
        try{
            if(this.conn != null){
                this.conn.close();
            }
        } catch( SQLException e ){
            showError(e);
        }
    }
    
    ResultSet getUsers(){
        try{
            PreparedStatement selectStmt = this.conn.prepareStatement("SELECT * FROM users");
            return selectStmt.executeQuery();
        } catch( SQLException e ){
            showError(e);
            return null;
        }
    }
    
    void addUser(String name, String secondName, String email, float height, float weight, String password){
        try{
            String insertSQL = "INSERT INTO users (name, secondName, height, weight, email, password) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement insertStmt = this.conn.prepareStatement(insertSQL);
            insertStmt.setString(1, name);
            insertStmt.setString(2, secondName);
            insertStmt.setFloat(3, height);
            insertStmt.setFloat(4, weight);
            insertStmt.setString(5, email);
            insertStmt.setString(6, this.encryptString(password));
            insertStmt.executeUpdate();
        } catch( SQLException e ){
            showError(e);
        }
    }
    
    String encryptString(String input){
        try{
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodedHash = digest.digest(input.getBytes(StandardCharsets.UTF_8));
            StringBuilder hexString = new StringBuilder();
            for (byte b : encodedHash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch(NoSuchAlgorithmException e){
            return "";
        }
    }
    
    boolean checkUser(String email, String password){
        ResultSet users = this.getUsers();
        
        try{
            while(users.next()){
                if(users.getString("email").equals(email) && users.getString("password").equals(this.encryptString(password))){
                    return true;
                }
            }
        } catch (SQLException e){
            this.showError(e);
            return false;
        }
        return false;
    }
    
    User getUser(String email, String password){
        ResultSet users = this.getUsers();
        
        try{
            while(users.next()){
                if(users.getString("email").equals(email) && users.getString("password").equals(this.encryptString(password))){
                    User user = new User();
                    user.createUser(users.getString("name"), users.getString("secondName"), users.getString("email"), users.getString("password"), users.getFloat("height"), users.getFloat("weight"));
                    return user;
                }
            }
        } catch (SQLException e){
            this.showError(e);
            return null;
        }
        return null;
    }
    
}
