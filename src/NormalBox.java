/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author newyork
 */
public class NormalBox implements Box {

    public boolean[][] hasBomb;
    public Box[][] gameBoard;
    private int rPos;
    private int cPos;
    private int bombCount;

    public NormalBox(boolean[][] matrix, int rPos, int cPos) {
        hasBomb = matrix;
        this.rPos = rPos;
        this.cPos = cPos;
        bombCount = 0;
    }

    private int countBombs() {
        if ((rPos != 0 | rPos != hasBomb.length) && (cPos != 0 | cPos != hasBomb[0].length)) { //row is not in top or bottom row
            for (int r = rPos - 1; r < rPos + 1; r++) {//go around immediate radius
                for (int c = cPos - 1; c < cPos + 1; c++) {
                    if (hasBomb[r][c]) {
                        bombCount++;
                    }
                }
            }
        }
        if (rPos == 0) {
            if (cPos == 0) {//top right corner
                if (hasBomb[0][1]) {
                    bombCount++;
                }
                if (hasBomb[1][1]) {
                    bombCount++;
                }
                if (hasBomb[1][0]) {
                    bombCount++;
                }
            }
            if (cPos == hasBomb[0].length) {//top left corner
                if (hasBomb[rPos][cPos - 1]) {
                    bombCount++;
                }
                if (hasBomb[rPos + 1][cPos - 1]) {
                    bombCount++;
                }
                if (hasBomb[rPos + 1][cPos]) {
                    bombCount++;
                }
            } else {
                for (int r = rPos; r < 2; r++) {//anywhere on the top row
                    for (int c = cPos - 1; c < 3; c++) {
                        if (hasBomb[r][c]) {
                            bombCount++;
                        }
                    }
                }
            }
        }
        if (rPos == hasBomb.length) {
            if (cPos == 0) {//bottom left corner
                if (hasBomb[rPos][cPos + 1]) {
                    bombCount++;
                }
                if (hasBomb[rPos - 1][cPos]) {
                    bombCount++;
                }
                if (hasBomb[rPos - 1][cPos + 1]) {
                    bombCount++;
                }
            }
            if (cPos == hasBomb[0].length) {//bottom right corner
                if (hasBomb[rPos][cPos - 1]) {
                    bombCount++;
                }
                if (hasBomb[rPos - 1][cPos - 1]) {
                    bombCount++;
                }
                if (hasBomb[rPos - 1][cPos]) {
                    bombCount++;
                }
            } else {
                for (int r = rPos - 1; r < 2; r++) {//anywhere on the bottom row
                    for (int c = cPos - 1; c < 3; c++) {
                        if (hasBomb[r][c]) {
                            bombCount++;
                        }
                    }
                }
            }
        }
        if (cPos == 0) {//on the sides
            for (int r = rPos; r < 2; r++) {//anywhere on the top row
                for (int c = cPos - 1; c < 3; c++) {
                    if (hasBomb[r][c]) {
                        bombCount++;
                    }
                }
            }
        }

        return bombCount;
    }

    @Override
    public int getBombCount() {
        return bombCount;
    }

    public void reveal(boolean[][] hasbomb, Box[][] gameBoard) {
         if(bombCount > 0){
             //reveal this bomb with its bomb count
         }
         else{
             for(int )
         

    }

    @Override
    public void perform() {
        countBombs();
    }
}

}
