
package com.stream.main;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

    	try (AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        AppConfig.class)) {

            DataSource dataSource =
                    context.getBean(DataSource.class);

            // Borrow a connection from the pool
            try (Connection con = dataSource.getConnection()) {

                System.out.println(
                        "Connection acquired successfully!");

                System.out.println(
                        "Database: "
                        + con.getMetaData().getDatabaseProductName());

                System.out.println(
                        "Connection is closed: "
                        + con.isClosed());

            } catch (SQLException e) {
                System.err.println(
                        "Database operation failed: "
                        + e.getMessage());
            }

            System.out.println(
                    "Connection returned to the pool.");

        } catch (Exception e) {
            System.err.println(
                    "Application failed: " + e.getMessage());

            e.printStackTrace();
        }
    }
}