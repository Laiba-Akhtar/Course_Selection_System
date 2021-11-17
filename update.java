import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class update {
    int record=0;
update()
{
    try {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("OK");
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "");
        if (connect != null)
            System.out.println("Connected");
        PreparedStatement stmt=connect.prepareStatement("UPDATE record currently_enrolled Where email=laibaakhtar@gmail.com");
         stmt.setString(4,"");
         record=stmt.executeUpdate();
}
catch(Exception e)
{
    System.out.println(e);
}

}}
