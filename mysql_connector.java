import java.sql.*;

public class mysql_connector
{
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mkk", "root","root");
            Statement smt=con.createStatement();
            ResultSet rs=smt.executeQuery("Select * from emp");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
            }
            con.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception : "+e);
        }
    }   
}
