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
public class Bomb extends PApplet implements Box {

    public void reveal(Boolean[][] bombMatrix) {//reveal all other bombs
        for (int r = 0; r < bombMatrix.length; r++) {//go around immediate radius
            for (int c = 0; c < bombMatrix[0].length; c++) {
                      if(bombMatrix[r][c]){
                          //reveal
                      }
            }
        }
    }

    @Override
    public void perform() {

    }

    @Override
    public int getBombCount() {
        return -1;
    }

    @Override
    public void reveal() {
    }

}
