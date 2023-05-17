package org.example;

import org.example.util.ShowMenuUtil;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class FunctionNameWindow extends JPanel {

    public FunctionNameWindow() {
        // 创建组件
        JLabel returnLabel = new JLabel("返回值");
        JTextField returnField = new JTextField(20);
        JLabel paramLabel = new JLabel("参数");
        JTextField paramField = new JTextField(20);
        JLabel functionLabel = new JLabel("函数名");
        JTextField functionField = new JTextField(20);
        JLabel descriptionLabel = new JLabel("功能描述");
        JTextField descriptionField = new JTextField(20);
        JTextArea displayArea = new JTextArea();
        JButton button = new JButton("提交");
        JScrollPane scrollPane = new JScrollPane(displayArea);

        //设置文本域不可编辑
        displayArea.setEditable(false);

        //去除按钮的内容区域
        button.setContentAreaFilled(false);
        //减少按钮的高度
        button.setMargin(new Insets(0, 0, 0, 0));

        // 提交按钮的点击事件监听器
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 当按钮被点击时执行的代码
                String sb = "实现一个函数：函数名为" +
                        functionField.getText() +
                        "，参数为" +
                        paramField.getText() +
                        "，返回值为" +
                        returnField.getText() +
                        "，功能为" +
                        descriptionField.getText();
                displayArea.setText(sb);
            }
        });

        //groupLayout布局
        GridBagLayout gridBagLayout = new GridBagLayout();
        setLayout(gridBagLayout);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.5;
        gbc.gridwidth = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 0, 0, 0);
        gridBagLayout.setConstraints(returnLabel, gbc);
        add(returnLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 0, 0, 0);
        gridBagLayout.setConstraints(returnField, gbc);
        add(returnField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.insets = new Insets(10, 0, 0, 0);
        gridBagLayout.setConstraints(paramLabel, gbc);
        add(paramLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.insets = new Insets(10, 0, 0, 0);
        gridBagLayout.setConstraints(paramField, gbc);
        add(paramField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.insets = new Insets(10, 0, 0, 0);
        gridBagLayout.setConstraints(functionLabel, gbc);
        add(functionLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.insets = new Insets(10, 0, 0, 0);
        gridBagLayout.setConstraints(functionField, gbc);
        add(functionField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.insets = new Insets(10, 0, 0, 0);
        gridBagLayout.setConstraints(descriptionLabel, gbc);
        add(descriptionLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.insets = new Insets(10, 0, 0, 0);
        gridBagLayout.setConstraints(descriptionField, gbc);
        add(descriptionField, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.insets = new Insets(10, 0, 0, 0);
        gridBagLayout.setConstraints(button, gbc);
        add(button, gbc);

        //给button添加右键菜单
        ShowMenuUtil.showMenu(button);


        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.gridwidth = 2;
        gbc.gridheight = 5;
        gbc.insets = new Insets(10, 10, 10, 10);
        gridBagLayout.setConstraints(scrollPane, gbc);
        add(scrollPane, gbc);

        setVisible(true);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("FunctionNameWindow");
        frame.setContentPane(new FunctionNameWindow());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
