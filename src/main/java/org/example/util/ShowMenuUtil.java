package org.example.util;

import org.example.component.table.ButtonInTableList;
import org.example.component.table.TableListNav;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ShowMenuUtil {

    public static void showMenu(JComponent yourComponent) {

        if(yourComponent instanceof ButtonInTableList){
            JPopupMenu popupMenu = new JPopupMenu();
            JMenuItem item1 = new JMenuItem("打开表");
            JMenuItem item2 = new JMenuItem("设计表");
            JMenuItem item3 = new JMenuItem("新建表");
            JMenuItem item4 = new JMenuItem("删除表");
            popupMenu.add(item1);
            popupMenu.add(item2);
            popupMenu.add(item3);
            popupMenu.add(item4);
            yourComponent.setComponentPopupMenu(popupMenu);
        }else{
            JPopupMenu popupMenu = new JPopupMenu();
            JMenuItem item1 = new JMenuItem("提交");
            JMenuItem item2 = new JMenuItem("取消");
            popupMenu.add(item1);
            popupMenu.add(item2);
            yourComponent.setComponentPopupMenu(popupMenu);
        }


    }

}
