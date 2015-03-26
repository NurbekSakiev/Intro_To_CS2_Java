/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slogancounter;

/**
 *
 * @author Nur
 */
public class SloganCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Slogan obj;
        
        obj = new Slogan ("Remember the Alamo.");
        System.out.println (obj);
        
        obj = new Slogan ("Don't Worry. Be Happy.");
        System.out.println (obj);
        
        obj = new Slogan ("Live Free or Die.");
        System.out.println (obj);
        
        obj = new Slogan ("Talk is Cheap.");
        System.out.println (obj);
        
        obj = new Slogan ("Write Once, Run Anywhere.");
        System.out.println (obj);
        
        System.out.println ("Slogans created: " + Slogan.getCount());
        
        //---------
        
        System.out.println ("Square root of 27: " + Math.sqrt(25)); 
    }
    
}
