package com.kiscode.flyweight.piece;

import java.util.HashMap;

/**
 * Description:
 * Author: keno
 * Date : 2020/12/9 16:14
 **/
public class PieceFactory {
    private HashMap<String, Piece> pieceHashMap = new HashMap<>();

    public Piece get(String color) {
        Piece piece = pieceHashMap.get(color);
        if (piece == null) {
            if ("WHITE".equals(color)) {
                piece = new WhitePiece();
            } else if ("BLACK".equals(color)) {
                piece = new BlackPiece();
            }
            pieceHashMap.put(color, piece);
        }
        return piece;
    }
}
