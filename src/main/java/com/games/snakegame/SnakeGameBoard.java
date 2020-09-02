package com.games.snakegame;

import javax.swing.*;

public class SnakeGameBoard extends JFrame {
    private static final int DEFAULT_WIDTH=1100;
    private static final int DEFAULT_HEIGHT=675;

    public SnakeGameBoard()
    {
        this.setTitle("Snake Game");
        this.setIconImage(Data.up.getImage());
        this.setBounds(0,0,DEFAULT_WIDTH,DEFAULT_HEIGHT);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
