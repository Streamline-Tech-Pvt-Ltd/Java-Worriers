package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo1 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/student";
        String username = "root";
        String password = "root123";

        try (Connection con = DriverManager.getConnection(url, username, password)) {

            System.out.println("Database connected successfully!");

            String insertSQL = "INSERT INTO customer (id, name, city) VALUES (?, ?, ?)";

            try (PreparedStatement ps = con.prepareStatement(insertSQL)) {

                ps.setInt(1, 105);
                ps.setString(2, "Rushikesh");
                ps.setString(3, "Pune");

                int row = ps.executeUpdate();

                System.out.println(" record inserted successfully."+row);
            }


            String selectSQL = "SELECT * FROM customer";

            try (PreparedStatement ps = con.prepareStatement(selectSQL);
                 ResultSet rs = ps.executeQuery()) {

                System.out.println("Customer Records:");

                while (rs.next()) {

                    int id = rs.getInt("id");
                    String name = rs.getString("name");
                    String city = rs.getString("city");

                    System.out.println(id + " | " + name + " | " + city);
                }
            }


            String updateSQL = "UPDATE customer SET city = ? WHERE id = ?";

            try (PreparedStatement ps = con.prepareStatement(updateSQL)) {

                ps.setString(1, "Mumbai");
                ps.setInt(2, 105);

                int row = ps.executeUpdate();

                System.out.println("\n" + row + " record updated successfully.");
            }


            

            String deleteSQL = "DELETE FROM customer WHERE id = ?";

            try (PreparedStatement ps = con.prepareStatement(deleteSQL)) {

                ps.setInt(1, 105);

                int row = ps.executeUpdate();

                System.out.println(row + " record deleted successfully.");
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}