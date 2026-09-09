package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TanzactionExample {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/Students";
        String username = "root";
        String password = "root123";

        Connection con = null;

        try {

            con = DriverManager.getConnection(url, username, password);

            System.out.println("Database connected successfully.");

            // Disable auto commit
            con.setAutoCommit(false);

            // Deduct 2000 from primary account
            String sql = "UPDATE account SET balance = balance - ? WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setDouble(1, 2000);
            ps.setInt(2, 1);

            int row = ps.executeUpdate();

            System.out.println("Primary account updated successfully: " + row);

            // Add 2000 to secondary account
            String sql1 = "UPDATE account SET balance = balance + ? WHERE id = ?";

            PreparedStatement ps1 = con.prepareStatement(sql1);

            ps1.setDouble(1, 2000);
            ps1.setInt(2, 2);

            int row1 = ps1.executeUpdate();

            System.out.println("Secondary account updated successfully: " + row1);

            // Commit transaction
            con.commit();

            System.out.println("Transaction completed successfully.");

        } catch (SQLException e) {

            System.out.println("Transaction failed!");

            e.printStackTrace();

            try {

                if (con != null) {
                    con.rollback();
                    System.out.println("Transaction rolled back.");
                }

            } catch (SQLException r) {
                r.printStackTrace();
            }
        }
    }
}