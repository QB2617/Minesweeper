/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author newyork
 */
public class Play  {
   public Box b;
   
   public Play(Box b){
       this.b = b;
   }
   
   public void execute(Box b){
       b.perform();
   }
}
