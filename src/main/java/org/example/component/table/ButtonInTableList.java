package org.example.component.table;

import javax.swing.*;
import java.awt.*;

public class ButtonInTableList extends JButton {
    public ButtonInTableList(String title, JComponent panel)  {

        //设置文字
        setText(title);
        //设置文字左对齐
        setHorizontalAlignment(SwingConstants.LEFT);
        //去除按钮文字周围的焦点框
        setFocusPainted(false);
        //去除按钮的内容区域
        setContentAreaFilled(false);
        //减少按钮的高度
        setMargin(new Insets(0, 0, 0, 0));
        //按钮边框为当前panel的背景色
        setBorder(BorderFactory.createLineBorder(panel.getBackground()));
        //当鼠标移动到按钮上时，按钮边框变为红色
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setBorder(BorderFactory.createLineBorder(Color.red));
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                //按钮边框为当前panel的背景色
                setBorder(BorderFactory.createLineBorder(panel.getBackground()));
            }
        });

    }
}
