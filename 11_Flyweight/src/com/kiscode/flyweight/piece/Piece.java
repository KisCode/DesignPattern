package com.kiscode.flyweight.piece;

/**
 * Description: 围棋类
 * Author: keno
 * Date : 2020/12/9 16:08
 **/
public abstract class Piece {
    protected int xPoint, yPoint;


    public int getxPoint() {
        return xPoint;
    }

    public void setxPoint(int xPoint) {
        this.xPoint = xPoint;
    }

    public int getyPoint() {
        return yPoint;
    }

    public void setyPoint(int yPoint) {
        this.yPoint = yPoint;
    }

    public void setPoint(int x, int y) {
        this.xPoint = x;
        this.yPoint = y;
    }

    abstract String color();

    @Override
    public String toString() {
        return "Piece{" +
                "xPoint=" + xPoint +
                ", yPoint=" + yPoint +
                ", color=" + color() +
                '}';
    }
}
