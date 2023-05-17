package org.example.util;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ShowMenuUtil {

    public static void showMenu(JComponent yourComponent) {

        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem item1 = new JMenuItem("提交");
        JMenuItem item2 = new JMenuItem("取消");
        popupMenu.add(item1);
        popupMenu.add(item2);
        yourComponent.setComponentPopupMenu(popupMenu);


    }

}
