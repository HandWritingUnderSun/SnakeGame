package com.games.snakegame;

import javax.swing.*;
import java.awt.*;

public class MainMenu {
    MainMenu()
    {
        //添加菜单
        JMenuBar menuBar = new JMenuBar();

        JMenu menuGames=new JMenu("Games");
        menuBar.add(menuGames);
        JMenu menuOptions = new JMenu("Options");
        menuBar.add(menuOptions);
        JMenuItem menuItemStart = new JMenuItem("New Game");
        menuGames.add(menuItemStart);

        JMenu menuHelp = new JMenu("Help");
        menuBar.add(menuHelp);
    }
}
