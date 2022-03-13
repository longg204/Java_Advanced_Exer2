/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan4;

import Theory_JavaAdv.Exer_Login.*;
import Theory_JavaAdv.ConnectSQL;
import java.sql.*;

/**
 *
 * @author xtir0
 */
public class User_Controller {

    ConnectSQL conn = new ConnectSQL();

    public User_Controller() {
        conn.Connect("LAPTOP-PEE7982J\\SQLEXPRESS", 1466, "sa", "1", "thuchanhjava");
    }

    public ResultSet getById(String users) {
        String query = "select * from User where users='" + users + "'";
        return conn.getData(query);
    }

    public ResultSet getUsers(String users, String password) {
        String query = "select * from login where users ='" + users + "' and password = '" + password + "'";
//        '"+username+"'
        return conn.getData(query);
    }
    
    public ResultSet getUser(String users) {
        String query = "select * from login where users ='" + users + "'";
//        '"+username+"'
        return conn.getData(query);
    }

    public void insertUser(String users, String password) {
        String query = "insert into login(users, password) values('" + users + "', '" + password + "')";
        conn.excute(query);
    }
    
    public int countRowUser(String users, String password) {
        ResultSet rs = null;
        int count = 0;
        try {
            rs = getUsers(users, password);
            while(rs.next()) {
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }
}
