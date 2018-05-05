/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author LamaR
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Punkt2D pierwszy = new Punkt2D();
        pierwszy.losowanie();
        System.out.println("" + pierwszy.toString());
     
        Punkt3D drugi = new Punkt3D();
        drugi.losowanie();
        System.out.println("" + drugi.toString());
     
        Punkt2D[] array2D = new Punkt2D[100];
        Punkt3D[] array3D = new Punkt3D[100];
        for(int i = 0; i<array2D.length; i++){
            array2D[i] = new Punkt2D();
            array2D[i].losowanie();
            array3D[i] = new Punkt3D();
            array3D[i].losowanie();
        }
       for(int i = 0; i < array2D.length; i++){
           for(int j = 0; j < array3D.length; j++){
            if(array2D[i].getX() == array3D[j].getX() && array2D[i].getY() == array3D[j].getY()) 
                   System.out.println("Punkt 2D:" +array2D[i].toString() +", Punkt 3D: " +array3D[j].toString());
           }
                   
       }
      
        

    }
    
    
    
}
