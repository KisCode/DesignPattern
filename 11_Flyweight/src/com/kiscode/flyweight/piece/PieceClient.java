package com.kiscode.flyweight.piece;

import java.util.Calendar;
import java.util.Random;

/**
 * Description:
 * Author: keno
 * Date : 2020/12/9 16:17
 **/
public class PieceClient {
    private static final String TYPE_WHITE = "WHITE";
    private static final String TYPE_BLACK = "BLACK";

    public static void main(String[] args) {
        PieceFactory factory = new PieceFactory();
        for (int i = 1; i < 100; i++) {
            for (int j = 1; j < 100; j++) {
                Piece piece = factory.get(getRandomType());
//                piece.setPoint(i, j);
                System.out.println(piece.hashCode() + "\t" + piece.toString());
            }
        }
    }

    public static String getRandomType() {
        int random = new Random().nextInt(10);
        if (random % 2 == 0) {
            return TYPE_BLACK;
        } else return TYPE_WHITE;
    }
}
