
package com.stream.main;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppTest {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(
                        AppConfig.class);

        try {
            EmployeeDao employeeDao =
                    context.getBean(EmployeeDao.class);

            List<Employee> employees = Arrays.asList(
                new Employee("Rahul", "IT", 45000.00),
                new Employee("Priya", "HR", 40000.00),
                new Employee("Amit", "Finance", 50000.00)
            );

            int[] results = employeeDao.batchInsert(employees);

            System.out.println("\nBatch Insert Results:");

            for (int i = 0; i < results.length; i++) {
                System.out.println(
                    "Employee " + (i + 1)
                    + " -> Update Count: " + results[i]
                );
            }

            System.out.println("\nBatch insert completed.");

        } finally {
            context.close();
        }
    }
}
