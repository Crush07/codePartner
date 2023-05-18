package org.example.component.table;

import org.example.util.ShowMenuUtil;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TableListNav extends JScrollPane {

    private final JPanel panel;
    private final GridBagConstraints panelGbc;

    public TableListNav(){

        super(new JPanel());
        //获取JPanel
        panel = (JPanel) this.getViewport().getView();
        panel.setAlignmentY(0);
        //获取JPanel的布局管理器
        panelGbc = new GridBagConstraints();
        panelGbc.fill = GridBagConstraints.HORIZONTAL;
        panelGbc.gridx = 0;
        panelGbc.weightx = 1;

        // 创建一个JPanel作为JScrollPane的视口视图
        GridBagLayout panelGridBagLayout = new GridBagLayout();
        panel.setLayout(panelGridBagLayout); // 使用GridLayout布局，每行一个按钮

    }

    //通过List<String> list的add方法添加按钮
    public void addAll(List<String> list){

        // 向JPanel添加按钮
        for (int i = 0; i < list.size(); i++) {
            JButton button = new ButtonInTableList(list.get(i),panel);

            panelGbc.gridy = panelGbc.gridy + 1;

            panel.add(button,panelGbc);
            ShowMenuUtil.showMenu(button);
        }
    }

    public void add(String name){
        JButton button = new ButtonInTableList(name,panel);

        panelGbc.gridy = panelGbc.gridy + 1;

        panel.add(button,panelGbc);
        ShowMenuUtil.showMenu(button);
    }

}
