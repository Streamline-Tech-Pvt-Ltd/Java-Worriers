package com.stream.main;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConnectionReuseDemo {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        AppConfig.class)) {

            DataSource dataSource =
                    context.getBean(DataSource.class);

            for (int i = 1; i <= 5; i++) {

                try (Connection connection =
                        dataSource.getConnection()) {

                    System.out.println(
                            "Request " + i
                            + ": Connection acquired");

                    System.out.println(
                            "Valid: " + connection.isValid(2));
                }
              
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}