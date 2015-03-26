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
public class Dog {
    String breed;
    int age;
    String color;
    
    public Dog(String another_breed, int another_age) {
        breed = another_breed;
        age = another_age;
    }
    
    public Dog(String another_breed, int another_age, String another_color) {
        breed = another_breed;
        age = another_age;
        color = another_color;
    }
}
