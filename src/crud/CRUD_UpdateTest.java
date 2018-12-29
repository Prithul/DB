package crud;
/**
 * Papri Barua
 */

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CRUD_UpdateTest {

    public static void main(String[] args) {

        CRUD_UpdateTest objTest = new CRUD_UpdateTest();

        objTest.update_data("3","33","Papri B. Chowdhury","fun1@gmail.com");
        System.out.println("Data Updated");

    }

    public void update_data(String userId, String new_userId, String userName, String userEmail) {

        MySqlConnection obj_MySqlConnection = new MySqlConnection();
        Connection connection = obj_MySqlConnection.get_connection();

        PreparedStatement ps = null;
        try {

            String query = "update user set userId=?, userName=?, userEmail=? where userId=?";

            ps = connection.prepareStatement(query);

            ps.setString(1,new_userId);
            ps.setString(2,userName);
            ps.setString(3,userEmail);
            ps.setString(4,userId);

            System.out.println(ps);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
