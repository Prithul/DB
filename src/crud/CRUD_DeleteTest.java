package crud;
/**
 * Author: Papri Barua
 */

import java.sql.Connection;
import java.sql.PreparedStatement;

public class CRUD_DeleteTest {

    public static void main(String[] args) {

        CRUD_DeleteTest objTest = new CRUD_DeleteTest();

      //objTest.delete_data("1");
        objTest.delete_data("pbarua2018@gmail.com");
        System.out.println("Data Deleted");
    }


    //public void delete_data(String userId) {

    public void delete_data(String userEmail) {

        MySqlConnection obj_MySqlConnection = new MySqlConnection();
        Connection connection = obj_MySqlConnection.get_connection();

        PreparedStatement ps = null;
        try {
            //String query = "delete from user where userId=?";
            String query = "delete from user where userEmail=?";

            ps = connection.prepareStatement(query);
            //  ps.setString(1,userId);
            ps.setString(1,userEmail);

            System.out.println(ps);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
