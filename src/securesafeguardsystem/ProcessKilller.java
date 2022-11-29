package securesafeguardsystem;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProcessKilller implements Runnable,Lc
{
    
    private static final String TASKLIST = "tasklist";
    private static final String KILL = "TASKKILL /F /IM ";
    
    int flag=0;
    int count =0;
    SoftwareDB softwareDB;
    String paths[] = new String[1000];
    String snames[] =  new String[1000];
    
    public boolean isProcessRunning(String serviceName) 
    {	
        try
        {
            Process pro = Runtime.getRuntime().exec(TASKLIST);
            BufferedReader reader = new BufferedReader(new InputStreamReader(pro.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) 
            {
		if (line.startsWith(serviceName)) 
		{
                    return true;
		}
            }
        } 
	catch (Exception e) 
	{
            e.printStackTrace();
	}
        return false;
    }
    
    public void read()
    {
        Connection con;
        PreparedStatement pt;
        Statement st;
        ResultSet rs, rs2;
        String url = "jdbc:mysql://localhost:3306/safeguardsystem?serverTimezone=UTC";
        String user = "root";
        String pass = "";
        try 
        {    
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection(url, user, pass);
           st = con.createStatement();
           rs = st.executeQuery("select sname from soft_paths");

           while(rs.next())
           {
               L.put(rs.getString("Sname"), 0);
           }
                      
        }
        catch (ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
        
        
        
    }
     public void read1()
    {
        Connection con;
        PreparedStatement pt;
        Statement st;
        ResultSet rs, rs2;
        String url = "jdbc:mysql://localhost:3306/safeguardsystem?serverTimezone=UTC";
        String user = "root";
        String pass = "";
        try 
        {    
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection(url, user, pass);
           st = con.createStatement();
          
           rs2 = st.executeQuery("select path, sname from soft_paths");
           
          
          
           int i=0;
           while(rs2.next()){
               paths[i] = rs2.getString("path");
               snames[i] = rs2.getString("sname");
               
               System.out.println("paths of string  = "+paths[i]);
               System.out.println("snames of string  = "+snames[i]);
               i++;
           }
           
           
        }
        catch (ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
        
        
        
    }
    
    public static boolean killProcess(String serviceName)
    {        
        try
        {		
           
            Runtime.getRuntime().exec(KILL + serviceName);
            System.out.println(serviceName+" killed successfully!"); 
            
        }
	catch (Exception e)
	{
            e.printStackTrace();
	}
	return true;
    }
    
    public void run()
    {
        
        if(count <=1)
        {
            read();
            read1();
        }
        count++;
        while(true)
	{	
            try {
                Thread.sleep(4000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProcessKilller.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("flaggggggggggggggggggg = "+flag);
            synchronized(this)
            {
                for(Map.Entry<String, Integer> o1: L.entrySet()){
                    
                    if (isProcessRunning(o1.getKey()))
                        {
                            try{


                                System.out.println("O1000000000000000000 = "+o1);
                                flag=0;

                                if(isProcessRunning(o1.getKey()) && o1.getValue()==1)
                                {
                                        flag=1;
                                }
                                else
                                {
                                    System.out.println("flaggggggggggggggggggg = "+flag);
                                    if(flag==0){
                                         Runtime.getRuntime().exec("TASKKILL /F /IM "+o1.getKey());
                                        System.out.println("Process Killed ");
                                       
                                        StartEXE lock = new StartEXE();
                                       
                                        int i=0;
                                        while(true){
                                            System.out.println("sname = "+snames[i]);
                                            System.out.println("soft key = "+o1.getKey());
                                            if(snames[i].equals(o1.getKey())){
                                                lock.path = paths[i];
                                                lock.str = o1.getKey();
                                                break;
                                            }
                                            i++;
                                        }                                                                             
                                        lock.setVisible(true);
                                    }
                                   
                                }


                            }catch(Exception e){
                                System.out.println("is Process Exception = "+e);

                            }
                        }

                    else if(o1.getValue()==1 ){
                            try{

                                L.replace(o1.getKey(),0);
                                System.out.println("notRunningggggggggggggg = "+o1);

                            }catch(Exception e2){
                            System.out.println("not Running Exception = "+e2);

                        }
                    }

                }
            }
        }
    }
    
    
    public static void main(String args[])
    {
        ProcessKilller P = new ProcessKilller();
        
        Thread T = new Thread(P);
        T.start();
    }
    
}

