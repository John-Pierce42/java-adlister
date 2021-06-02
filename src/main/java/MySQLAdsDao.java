import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads{

     Connection connection;


 public MySQLAdsDao(){
     try {
     DriverManager.registerDriver(new Driver());
        connection = DriverManager.getConnection(
            Config.getUrl(),
            Config.getUser(),
            Config.getPassword()

        );} catch (SQLException e){
         throw new RuntimeException("Error connecting to SQL database!", e);
     }
 }


    @Override
    public List<Ad> all() {
     try {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM ads");

     } catch (SQLException e){
         throw new RuntimeException("Error retrieving all the ads!", e);
     }

    }

    private Ad extractAd(ResultSet rs) throws SQLException {
     return new Ad(
             rs.getString("title"),
             rs.getDescription("description")
     );
    }

    private List<Ad> createAdsFromResults(ResultSet rs) throws SQLException {
     List<Ad> ads = new ArrayList<>();
     while (rs.next()) {
         ads. add(extractAd(rs));
     }
     return ads;
    }




    @Override
    public Long insert(Ad ad) {
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO ads (title, description) VALUES (ad.getTitle(), ad.getDescription())", Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getResultSet();
            rs.next();
        } catch(SQLException e){
            throw new RuntimeException("Error inserting data to database!", e);
        }
    }
}
