import java.sql.*;

/**
 * @author Akira Shinohara
 * @since 2018.10.24
 */
public class DBTest {
    public static void main(String[] args) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/free_kukan", "free_kukan", "free");
            Statement stat = conn.createStatement();
            stat.executeQuery("INSERT into users VALUES ('0000000000000001', 'dummy woman', '2000-01-01', '0000000', 'hogehogehogehoge', '2000-01-01 00:00:00.0', '2000-01-01 00:00:00.0')");
            ResultSet result = stat.executeQuery("SELECT * FROM users");
            while(result.next()) {
                String user_id = result.getString("user_id");
                String first_name = result.getString("name");
                String last_name = result.getString("birth_of_day");
                String post_code = result.getString("post_code");
                String address = result.getString("address");
                String created_at = result.getString("created_at");
                String updated_at = result.getString("updated_at");
                System.out.println(user_id + "\t" + first_name + "\t" + last_name + "\t" + post_code + "\t" + address + "\t" + created_at + "\t" + updated_at);
            }

            conn.close();
        } catch (Exception err){
            System.err.println(err.toString());
        }
    }
}
