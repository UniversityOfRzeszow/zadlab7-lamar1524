/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;
import java.util.Random;

/**
 *
 * @author LamaR
 */
public class Punkt2D {
    int x;
    int y;
    
    public Punkt2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

     public void losowanie() {
       Random generator = new Random();
       this.x = generator.nextInt(20) -10;
       this.y = generator.nextInt(20) -10;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Punkt2D() {
        this.x = 0;
        this.y = 0;
    }
    
    @Override
     public String toString() {
        return "Współrzędne punktu: " +getX() +", " +getY();
    }
}