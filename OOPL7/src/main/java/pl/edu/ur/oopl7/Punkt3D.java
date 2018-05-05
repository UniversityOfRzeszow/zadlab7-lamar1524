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
public class Punkt3D extends Punkt2D {
    double z;

    public Punkt3D(){
        this.z = 0;
    }
    
    public Punkt3D(double z, int x, int y) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }
    @Override
    public void losowanie() {
       Random generator = new Random();
       this.x = generator.nextInt(20) -10;
       this.y = generator.nextInt(20) -10;
       this.z = generator.nextInt(20) -10;
    }
    @Override
    public String toString() {
        return "Współrzędne punktu: " +getX() +", " +getY() +", " + getZ();
    }
    
}