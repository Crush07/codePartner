package org.example;

import org.example.component.table.TableListNav;
import org.example.service.Select;
import org.example.util.ShowMenuUtil;

import javax.swing.*;
import java.awt.*;

import java.sql.SQLException;
import java.util.List;

public class MainWindow extends JFrame {

    public MainWindow() throws SQLException {
        setSize(600, 400);

        //groupLayout布局
        GridBagLayout gridBagLayout = new GridBagLayout();
        getContentPane().setLayout(gridBagLayout);

        //创建表导航栏
        TableListNav nav = new TableListNav();
        Select select = new Select("jdbc:mysql://localhost:3306/education?useSSL=false&useUnicode=true&characterEncoding=utf8&allowMultiQueries=true&serverTimezone=Asia/Shanghai", "root", "root", "education");
        nav.addAll(select.selectAllTableName());

        //功能区
        JPanel function = new JPanel();

        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.2;
        gbc.weighty = 1;
        gbc.insets = new Insets(10, 0, 0, 0);
        //gbc第一行第一列的组件
        getContentPane().add(nav, gbc);

        gbc.gridx = 1;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.weightx = 0.8;
        gbc.weighty = 1;
        getContentPane().add(function, gbc);

        //可调整大小
        setResizable(true);
        //窗口可见
        setVisible(true);
        //关闭窗口时退出程序
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    //main方法
    public static void main(String[] args) throws SQLException {
        //创建窗口
        new MainWindow();
    }

}
