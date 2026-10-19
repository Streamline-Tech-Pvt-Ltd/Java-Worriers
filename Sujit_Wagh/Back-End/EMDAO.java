
package com.stream.main;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

    private final JdbcTemplate jdbcTemplate;

    // Constructor injection
    public EmployeeDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int[] batchInsert(List<Employee> employees) {

        String sql = "INSERT INTO employee "
                   + "(name, department, salary) "
                   + "VALUES (?, ?, ?)";

        return jdbcTemplate.batchUpdate(
            sql,
            new BatchPreparedStatementSetter() {

                @Override
                public void setValues(
                        PreparedStatement ps, int i)
                        throws SQLException {

                    Employee employee = employees.get(i);

                    ps.setString(1, employee.getName());
                    ps.setString(2, employee.getDepartment());
                    ps.setDouble(3, employee.getSalary());
                }

                @Override
                public int getBatchSize() {
                    return employees.size();
                }
            }
        );
    }
}
