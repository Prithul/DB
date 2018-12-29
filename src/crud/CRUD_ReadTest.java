package crud;
/**
 * Author: Papri Barua
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CRUD_ReadTest {

    public static void main(String[] args) {

        CRUD_ReadTest objTest = new CRUD_ReadTest();

        objTest.read_data("2");
        System.out.println("Data Read");
    }


    public void read_data (String userId){

        MySqlConnection obj_MySqlConnection = new MySqlConnection();
        Connection connection = obj_MySqlConnection.get_connection();

        PreparedStatement ps = null;
        ResultSet rs = null;
        try {

            // String query = "select * from user where userId=?";
            String query = "select * from user";

            ps = connection.prepareStatement(query);
            // ps.setString(1, userId);

            System.out.println(ps);
            rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println("User Id:" + rs.getString("userId"));
                System.out.println("User Name:" + rs.getString("userName"));
                System.out.println("User Email:" + rs.getString("userEmail"));
                System.out.println("----------------------------------");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
