package crudTestAll;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * This program implements CRUD operations of MYSQL using Prepared Statements in Java ... :)
 *
 * author @ Papri Barua
 */


public class CRUDTestAll {

    public static void main(String[] args) {

        CRUDTestAll objTest = new CRUDTestAll();

     //  Create Data ==> CRUD Operation 1

     /*  objTest.create_data("3", "Papri B. Chowdhury","pbarua2018@gmail.com");
         System.out.println("Data Created");*/

      // Read Data ==> CRUD Operation 2

      /* objTest.read_data("2");tW
         System.out.println("Data Read");  */

      // Update Data ==>  CRUD Operation 3

         objTest.update_data("4","4","Palash Khanna B.","pkb@yahoo.com");
         System.out.println("Data Updated");

      //  Delete Data ==> CRUD Operation 4

      /*  objTest.delete_data("1");
          objTest.delete_data("fun1@gmail.com");
          System.out.println("Data Deleted"); */

    }

    /*public void create_data(String userId, String userName, String userEmail) {

        ConnectionToMySql obj_ConnectionToMySql = new ConnectionToMySql();
        Connection connection = obj_ConnectionToMySql.get_connection();

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

    }*/

        /*public void read_data (String userId){

            ConnectionToMySql obj_ConnectionToMySql = new ConnectionToMySql();
            Connection connection = obj_ConnectionToMySql.get_connection();

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
*/
        public void update_data(String userId, String new_userId, String userName, String userEmail) {

        ConnectionToMySql obj_ConnectionToMySql = new ConnectionToMySql();
        Connection connection = obj_ConnectionToMySql.get_connection();

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
       /* public void delete_data(String userEmail) {

        ConnectionToMySql obj_ConnectionToMySql = new ConnectionToMySql();
        Connection connection = obj_ConnectionToMySql.get_connection();

        PreparedStatement ps = null;
        try {

         // String query = "delete from user where userId=?";
            String query = "delete from user where userEmail=?";

            ps = connection.prepareStatement(query);
         // ps.setString(1,userId);
            ps.setString(1,userEmail);

            System.out.println(ps);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }

    }*/

}  // class ends


