/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securesafeguardsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class SoftwareDB {
    
 
    Connection con;
    PreparedStatement pt;
    Statement st;
    ResultSet rs;
    String url = "jdbc:mysql://localhost:3306/safeguardsystem?serverTimezone=UTC";
    String user = "root";
    String pass = "";
    String query = "insert into userinfo values(?,?,?,?,?)";
   
    SoftwareDB() 
    {
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection(url, user, pass);
           st = con.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    
    public int insertIntoDB(String name, String email, String password,String key) throws Exception {
        pt = con.prepareStatement(query);
        int id = 1;
        pt.setString(1,null);
        pt.setString(2,name);
        pt.setString(3,email);
        pt.setString(4,password);
        pt.setString(5,key);

        // DDL, DML, DQL
        return pt.executeUpdate();
    }
    public Map<String,String> showDB() throws Exception
    {
        rs = st.executeQuery("select * from userinfo");
        
        //System.out.println("ID \t\t  Name \t\t Email \t\t Password");
        Map<String ,String> hm = new HashMap< >(); 
        
        while (rs.next())
        {
            //System.out.println(rs.getInt(1)+", \t"+rs.getString(2)+", \t"+rs.getString(3)+", \t"+rs.getString(4));
            hm.put(rs.getString(3),rs.getString(4));
            // String result[] = {""+rs.getInt(1), ""+rs.getString(2), ""+rs.getString(3), ""+rs.getString(4)};
        }
        return hm;
    }
    
     public void checkUP(String f, String s)
     {
        try
        {
            System.out.println("Email:"+f+" Pass:"+s+"");
            String queryString = "SELECT * FROM `userinfo` WHERE email=? and password=?";
            pt.setString(1,f);
            pt.setString(2,s);
            pt = con.prepareStatement(queryString);
            //set this values using PreparedStatement
            ResultSet results = pt.executeQuery(); //where ps is Object of PreparedStatement

            if(!results.next()) 
            {
                  JOptionPane.showMessageDialog(null,"Incorrect Username and Password","Wrong !!!",JOptionPane.ERROR_MESSAGE);
            }
            
        } 
        catch (SQLException sql)
        {
                JOptionPane.showMessageDialog(null,""+sql,"Wrong !!!",JOptionPane.ERROR_MESSAGE);
        
        }finally{
      
    }
     }
    public int deleteRow() throws SQLException {
        return st.executeUpdate("delete from userinfo WHERE id = 1");
    }
    
     public int insertIntoSoftPathDB(String softName, String path) throws Exception {
        pt = con.prepareStatement("insert into soft_paths values(?, ?, ?)");
        pt.setString(1, null);
        pt.setString(2, softName);
        pt.setString(3, path);

        // DDL, DML, DQL
        return pt.executeUpdate();
    }
    public void showSoftPathDB() throws Exception{
        rs = st.executeQuery("select * from soft_paths");

        System.out.println("ID \t\t  Software Name \t\t Path ");
        while (rs.next()){
            System.out.println(rs.getInt(1)+", \t"+rs.getString(2)+", \t"+rs.getString(3));
        }
    }
    
    public String getSoftPath(String exeName) throws Exception{
        System.out.println("Before fetch path ");
        st = con.createStatement();
        rs = st.executeQuery("select path from soft_paths where sname ="+exeName+"");
        System.out.println("String of DB  = "+rs.getString(3));
        
        return (rs.getString("path"));
    }
    public int deleteSoftPathRow(String str) throws SQLException {
        return st.executeUpdate("delete from soft_paths WHERE path ="+str);
    }

   
}
