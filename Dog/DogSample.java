/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dogsample;

/**
 *
 * @author Nur
 */
public class DogSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Dog sampleDog = new Dog("Labrador", 12);
        
        Dog anotherDog = new Dog("Husky", 5, "red");
        
        System.out.println(sampleDog.breed+ " "+ sampleDog.age+ " " + sampleDog.color);
        
        System.out.println(anotherDog.breed+ " "+ anotherDog.age+ " " + anotherDog.color);
    }
    
}
