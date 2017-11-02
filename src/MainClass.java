/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import processing.core.PApplet;
/**
 *
 * @author newyork
 */
public class MainClass extends PApplet{

    boolean[][] hasBomb;

    Box[][] gameBoard;

    public MainClass() {
        hasBomb = new boolean[10][10];
        gameBoard = new Box[10][10];
    }

    public void createBombs() {
        int v;
        for (int r = 0; r < gameBoard.length; r++) {
            for (int c = 0; c < gameBoard[0].length; c++) {
                v = (int) Math.random() * 10;
                if (v <= 8) {
                    gameBoard[r][c] = new NormalBox(hasBomb, r, c);
                    hasBomb[r][c] = false;
                }else{
                    gameBoard[r][c] = new Bomb();
                    hasBomb[r][c] = true;
                
            }

        }
    }

}

}
