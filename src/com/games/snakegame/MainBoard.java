package com.games.snakegame;

import java.awt.*;

public class MainBoard {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            SnakeGameBoard snakeGameBoard=new SnakeGameBoard();
            snakeGameBoard.add(new MainPanel());
            snakeGameBoard.setVisible(true);
        });
    }
}
