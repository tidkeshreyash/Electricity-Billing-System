
package electricitybillingsystem;

import java.sql.*;


 public class Conn {
     
     Connection c;
     Statement s;
    Conn(){
         try {
        c = DriverManager.getConnection("jdbc:mysql:///ebs","root","shrey@123");
        s = c.createStatement();
        } catch(Exception e){
            e.printStackTrace();
        }
                
    }
     
    
}
