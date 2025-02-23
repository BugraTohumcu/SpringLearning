package com.bugraT.demo.JDBC.repository;

import com.bugraT.demo.JDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.List;
@Repository
public class StudentRepo {
    JdbcTemplate jdbc;

    public JdbcTemplate getJdbc() {
        return jdbc;
    }

    @Autowired
    public void setJdbc(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public void save(Student student) {
       String sql = "insert into Student(rollNo,name,marks) values(?,?,?)";
       int row = jdbc.update(sql, student.getRollNo(),student.getName(), student.getMarks());

        System.out.println("Effected row: " + row);
    }

    public void delete(String student) {
        String sql = "delete from Student where name =?";
        try{
            jdbc.update(sql,student);
        }catch (Exception e){
            System.out.println("Something went wrong");
        }
    }

    public List<Student> getStudent() {
        String sql = "select * from Student";
        RowMapper<Student>  rowMapper;

        return jdbc.query(sql,rowMapper= ( rs, rownum ) ->{
            Student student = new Student();
            student.setRollNo(rs.getInt("rollNo"));
            student.setName(rs.getString("name"));
            student.setMarks(rs.getInt("marks"));

            return student;
        });
    }
}
