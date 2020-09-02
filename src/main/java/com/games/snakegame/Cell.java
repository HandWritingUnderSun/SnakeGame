package com.games.snakegame;

public class Cell {
    int indexX;
    int indexY;

    public int getIndexX() {
        return indexX;
    }

    public void setIndexX(int indexX) {
        this.indexX=indexX;
    }

    public int getIndexY() {
        return indexY;
    }

    public void setIndexY(int indexY) {
        this.indexY=indexY;
    }

    Cell(){
        indexX=0;
        indexY=0;
    }

    public boolean equals(Cell cell) {
        if(this.indexX==cell.indexX&&this.indexY==cell.indexY) {
            return true;
        }else {
            return false;
        }
    }
}
