package org.example.service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Select {

    //配置url
    private final String url;
    //配置账号
    private final String username;
    //配置密码
    private final String password;
    private final Connection connection;
    private final String database;

    public Select(String url, String username, String password, String database){
        Connection connection;
        this.url = url;
        this.username = username;
        this.password = password;
        this.database = database;
        //加载驱动
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //获取连接
        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException throwables) {
            connection = null;
            throwables.printStackTrace();
        }

        this.connection = connection;
    }

    public List<String> selectAllTableName() throws SQLException {
        List<String> res = new ArrayList<>();
        //获取statement
        Statement statement = connection.createStatement();
        //查询数据库中的所有表名
        String sql = "select table_name from information_schema.tables where table_schema='" + database + "'";
        //执行sql语句，获取结果集
        ResultSet result = statement.executeQuery(sql);
        //遍历结果集
        while (result.next()){
            //获取表名
            String tableName = result.getString("table_name");
            res.add(tableName);
        }
        return res;
    }

}
