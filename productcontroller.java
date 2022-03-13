/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tuan4;
/**
 *
 * @author xtir0
 */
import Theory_JavaAdv.*;
import java.sql.*;

public class productcontroller {
    
    public ConnectSQL conn = new ConnectSQL();
    
    public productcontroller() {
        conn.Connect("LAPTOP-PEE7982J\\SQLEXPRESS", 1466, "sa", "1", "thuchanhjava");
    }
    
    public ResultSet getAll() {
        String query = "select * from javatuan4 order by id asc";
        return conn.getData(query);
    }
    
    public ResultSet getById(String id) {
        String query = "select * from javatuan4 where id = '"+id+"'";
        return conn.getData(query);
    }
    
    public ResultSet getByName(String masp) {
        String query = "select * from javatuan4 where masp = '"+masp+"'";
        return conn.getData(query);
    }
    
    public void insert(String masp, String tensp, int gianhap, int giaban) {
        String query = "insert into javatuan4 values('"+masp+"', N'"+tensp+"', '"+gianhap+"' , '"+giaban+"')";
        conn.excute(query);
    }
    
    public void delete(String masp) {
        String query = "delete from javatuan4 where masp ='"+masp+"'";
        conn.excute(query);
    }
    
    public void update(int id, String masp, String tensp, int gianhap, int giaban) {
        String query = "update javatuan4 set masp=N'"+masp+"', tensp= '"+tensp+"', gianhap= '"+gianhap+"', giaban='"+giaban+"' where id='"+id+"'";
        conn.excute(query);
    }

}
