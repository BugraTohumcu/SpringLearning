package com.bugratohumcu;
import java.sql.*;
public class Main {
    public static void main(String[] args) throws Exception {


        Class.forName("org.postgresql.Driver");

        String url = "jdbc:postgresql:///practise";
        String username = "postgres";
        String password = "12345";
        Connection con = DriverManager.getConnection(url,username,password);


        String sql = "select * from student where sid = 100";
        Statement st = con.createStatement();
        ResultSet resultSet = st.executeQuery(sql);
        System.out.println(resultSet.getString("sname"));
        con.close();



    }
}