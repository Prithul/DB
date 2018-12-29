package crud;

/**
 * Author: Papri Barua
 */

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CRUD_CreateTest {

    public static void main(String[] args) {

        CRUD_CreateTest objTest = new CRUD_CreateTest();

        objTest.create_data("3", "Papri B. Chowdhury","pbarua2018@gmail.com");
        System.out.println("Data Created");
    }

    public void create_data(String userId, String userName, String userEmail) {

        MySqlConnection obj_MySqlConnection = new MySqlConnection();
        Connection connection = obj_MySqlConnection.get_connection();

        PreparedStatement ps = null;
        try {

            String query = "insert into user(userId,userName,userEmail) values(?,?,?)";
            ps = connection.prepareStatement(query);

            ps.setString(1, userId);
            ps.setString(2, userName);
            ps.setString(3, userEmail);
            System.out.println(ps);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
