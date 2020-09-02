package com.games.snakegame;


import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Data {
    public  static URL headerURL=Data.class.getResource("/resources/header.png");
    public static  ImageIcon header=new ImageIcon(headerURL);


    public  static URL bodyURL=Data.class.getResource("/resources/body.png");
    public static  ImageIcon body=new ImageIcon(bodyURL);
    public  static URL foodURL=Data.class.getResource("/resources/food.png");
    public static  ImageIcon food=new ImageIcon(foodURL);
    public  static URL downURL=Data.class.getResource("/resources/down.png");
    public static  ImageIcon down=new ImageIcon(downURL);
    public  static URL upURL=Data.class.getResource("/resources/up.png");
    public static  ImageIcon up=new ImageIcon(upURL);
    public  static URL leftURL=Data.class.getResource("/resources/left.png");
    public static  ImageIcon left=new ImageIcon(leftURL);
    public  static URL rightURL=Data.class.getResource("/resources/right.png");
    public static  ImageIcon right=new ImageIcon(rightURL);
    public  static URL setUpURL=Data.class.getResource("/resources/SetUp.ico");
    public static  ImageIcon setUp=new ImageIcon(setUpURL);

}
