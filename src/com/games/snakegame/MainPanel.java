package com.games.snakegame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainPanel extends JPanel implements KeyListener, ActionListener {
    boolean isStart=false;
    boolean isFail=false;
    Timer timer=new Timer(300,this);
    Snake snake;
    SnakeDirection snakeDirection;
    Food food;

    public  MainPanel()
    {
        super(new BorderLayout());

        Init();
        this.setFocusable(true);
        this.addKeyListener(this);
        timer.start();
    }

    private void Init(){
        timer=new Timer(300,this);
        snake=new Snake();
        snakeDirection =SnakeDirection.Right;

        food=new Food();

    }


    @Override
    protected  void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        this.setBackground(Color.GREEN);
        //Data.header.paintIcon(this,g,25,11);
        g.fillRect(0,0,850,625);
        g.setColor(Color.WHITE);
        g.fillRect(850,0,250,675);


        if(SnakeDirection.Right== snakeDirection)
        {
            Data.right.paintIcon(this,g,snake.cells[0].getIndexX(),snake.cells[0].getIndexY());
        }else if(SnakeDirection.Left== snakeDirection)
        {
            Data.left.paintIcon(this,g,snake.cells[0].getIndexX(),snake.cells[0].getIndexY());
        }else if(SnakeDirection.Up== snakeDirection)
        {
            Data.up.paintIcon(this,g,snake.cells[0].getIndexX(),snake.cells[0].getIndexY());
        }else if(SnakeDirection.Down== snakeDirection)
        {
            Data.down.paintIcon(this,g,snake.cells[0].getIndexX(),snake.cells[0].getIndexY());
        }

        for (int i = 1; i < snake.Len; i++) {
            Data.body.paintIcon(this,g,snake.cells[i].getIndexX(),snake.cells[i].getIndexY());
        }

        for (int i = 0; i <food.len ; i++) {
            Data.food.paintIcon(this,g,food.foodCell[i].getIndexX(),food.foodCell[i].getIndexY());
        }



        if(false==isStart)
        {
            g.setColor(Color.WHITE);
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            g.drawString("按下空格开始游戏",300,300);
        }

        if(isFail)
        {
            g.setColor(Color.RED);
            g.setFont(new Font("微软雅黑",Font.BOLD,40));
            g.drawString("游戏失败，按下空格重新开始游戏",100,300);
            isStart=false;
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int keyCode=e.getKeyCode();
        if(KeyEvent.VK_SPACE==keyCode)
        {
            if(isFail){
                isFail=false;
                Init();
            }else{
                isStart=!isStart;
            }
        }
        if(KeyEvent.VK_LEFT==keyCode) {
            if(SnakeDirection.Right==snakeDirection) {
                isFail = true;
            }else {
                snakeDirection = SnakeDirection.Left;
            }
        }else if(KeyEvent.VK_RIGHT==keyCode) {
            if(SnakeDirection.Left==snakeDirection){
                isFail=true;
            }else {
                snakeDirection = SnakeDirection.Right;
            }
        }else if(KeyEvent.VK_UP==keyCode) {
            if(SnakeDirection.Down==snakeDirection){
                isFail=true;
            }else {
                snakeDirection = SnakeDirection.Up;
            }
        }else if(KeyEvent.VK_DOWN==keyCode) {
            if(SnakeDirection.Up==snakeDirection) {
                isFail = true;
            }else {
                snakeDirection = SnakeDirection.Down;
            }
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(isStart)
        {
            for (int i = 0; i <food.len ; i++) {
                if(snake.cells[0].equals(food.foodCell[i]))
                {
                    snake.Len+=1;
                    food.foodCell[i].setIndexX(Food.setRandomIndexX());
                    food.foodCell[i].setIndexY(Food.setRandomIndexY());
                    snake.cells[snake.Len-1]=new Cell();
                }
            }


            for (int i = snake.Len-1; i >0 ; i--) {
                snake.cells[i].setIndexX(snake.cells[i-1].getIndexX());
                snake.cells[i].setIndexY(snake.cells[i-1].getIndexY());
            }
            if(SnakeDirection.Right== snakeDirection) {
                snake.cells[0].setIndexX(snake.cells[0].indexX + 25);
            }else if(SnakeDirection.Left== snakeDirection) {
                snake.cells[0].setIndexX(snake.cells[0].indexX - 25);
            }else if(SnakeDirection.Down== snakeDirection) {
                snake.cells[0].setIndexY(snake.cells[0].indexY + 25);
            }else if(SnakeDirection.Up== snakeDirection) {
                snake.cells[0].setIndexY(snake.cells[0].indexY - 25);
            }


            for (int i = 1; i <snake.Len ; i++) {
                if(snake.cells[0].equals(snake.cells[i])){
                    isFail=true;
                }
            }


            repaint();
        }
        //timer.start();
    }
}
