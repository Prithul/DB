package crud;
/**
 * Author: Papri Barua
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLOutput;

public class MySqlConnection {

    public Connection get_connection(){

        Connection connection = null;

        try{

        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crud","root","peekaboo2018");

        System.out.println("Connection Established");

        } catch(Exception e){

            System.out.println(e);
        }

        return connection;
    }

}
