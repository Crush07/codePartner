package org.example;

import org.example.component.table.TableListNav;
import org.example.util.ShowMenuUtil;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow(){
        setSize(400, 200);

        //groupLayout布局
        GridBagLayout gridBagLayout = new GridBagLayout();
        getContentPane().setLayout(gridBagLayout);

        TableListNav nav = new TableListNav();

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
    public static void main(String[] args) {
        //创建窗口
        new MainWindow();
    }

}
