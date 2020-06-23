package Jdbc;

import java.sql.*;

public class JDBCHSQLDBExample {

    public static void main(String[] args) {
        getCustomers();
    }

    private static void getCustomers(){

        String url = "jdbc:hsqldb:file:c:\\HSQLDB\\sampledb;shutdown=true";

        try (Connection con = DriverManager.getConnection(url,"SA","");
             Statement stmt = con.createStatement() ) {

          //  stmt.executeUpdate("INSERT INTO CUSTOMER VALUES("+
          //          "51, 'Max', 'Mustermann', 'Maierhofplatz 1', 'Pinkafeld')");

            ResultSet rs = stmt.executeQuery("SELECT * FROM Customer");

            while (rs.next())
                System.out.printf("%s, %s %s%n", rs.getString("ID"),
                        rs.getString("FIRSTNAME"),
                        rs.getString("LASTNAME") );

            rs.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
