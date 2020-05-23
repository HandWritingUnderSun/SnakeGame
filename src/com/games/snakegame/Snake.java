package com.games.snakegame;

public class Snake {
    int Len;
    Cell[] cells;

    Snake()
    {
        Len=3;
        cells=new Cell[600];

        for (int i = 0; i <Len ; i++) {
            cells[i]=new Cell();
        }
        this.cells[0].setIndexX(75);
        this.cells[0].setIndexY(75);
        this.cells[1].setIndexX(50);
        this.cells[1].setIndexY(75);
        this.cells[2].setIndexX(25);
        this.cells[2].setIndexY(75);
    }

    Snake(int len,int indexx,int indexy,SnakeDirection fx)
    {
        this.Len=len;
        for (int i = 0; i <Len ; i++) {
            cells[i]=new Cell();
        }

        this.cells[0].indexX=indexx;
        this.cells[0].indexY=indexy;

        if(SnakeDirection.Down==fx) {
            for (int i = 1; i < len; i++) {
                this.cells[i].setIndexX(cells[0].indexX);
                this.cells[i].setIndexY(cells[0].indexY-25);
            }
        } else if (SnakeDirection.Up==fx) {
            for (int i = 1; i < len; i++) {
                this.cells[i].setIndexX(cells[0].indexX);
                this.cells[i].setIndexY(cells[0].indexY+25);
            }
        }else if (SnakeDirection.Left==fx) {
            for (int i = 1; i < len; i++) {
                this.cells[i].setIndexX(cells[0].indexX-25);
                this.cells[i].setIndexY(cells[0].indexY);
            }
        }else if (SnakeDirection.Right==fx) {
            for (int i = 1; i < len; i++) {
                this.cells[i].setIndexX(cells[0].indexX+25);
                this.cells[i].setIndexY(cells[0].indexY);
            }
        }
    }

    public void Move()
    {}

}
