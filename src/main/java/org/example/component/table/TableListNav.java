package org.example.component.table;

import org.example.util.ShowMenuUtil;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class TableListNav extends JScrollPane {

    private final JPanel panel;
    public TableListNav() {

        super(new JPanel());

        //获取JPanel
        panel = (JPanel) this.getViewport().getView();

        // 创建一个JPanel作为JScrollPane的视口视图
        GridBagLayout panelGridBagLayout = new GridBagLayout();
        GridBagConstraints panelGbc = new GridBagConstraints();
        panel.setLayout(panelGridBagLayout); // 使用GridLayout布局，每行一个按钮

    }

    //通过listNav的add方法添加按钮
    public void add(JButton button){
        GridBagConstraints panelGbc = new GridBagConstraints();
        panelGbc.fill = GridBagConstraints.BOTH;
        panelGbc.gridx = 0;
        panelGbc.gridy = panel.getComponentCount();
        panelGbc.weightx = 1;
        panel.add(button,panelGbc);
        ShowMenuUtil.showMenu(button);
    }

    //通过List<String> list的add方法添加按钮
    public void add(List<String> list){

        // 向JPanel添加按钮
        for (int i = 0; i < list.size(); i++) {
            JButton button = new JButton(list.get(i));
            //去除按钮的内容区域
            button.setContentAreaFilled(false);
            //减少按钮的高度
            button.setMargin(new Insets(0, 0, 0, 0));
            //去除按钮的边框
            button.setBorder(null);

            GridBagConstraints panelGbc = new GridBagConstraints();
            panelGbc.fill = GridBagConstraints.BOTH;
            panelGbc.gridx = 0;
            panelGbc.gridy = i-1;
            panelGbc.weightx = 1;

            panel.add(button,panelGbc);
            ShowMenuUtil.showMenu(button);
        }
    }

}
