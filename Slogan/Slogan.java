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
public class Slogan {
    private String phrase;
    
    private static int count = 0;
    
    public Slogan (String str)
    {
        phrase = str;
        count++;
    }
 
    public String toString() // Returns this slogan as a string.
    {
        return phrase;
    }

    public static int getCount () // Returns the number of instances of this class that have been
                                  // created.
    {
        return count;
    }
}
