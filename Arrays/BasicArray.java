/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicarray;


public class BasicArray
{
   //-----------------------------------------------------------------
   //  Creates an array, fills it with various integer values,
   //  modifies one value, then prints them out.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      final int LIMIT = 15, MULTIPLE = 10;
      
      int[] list = new int[LIMIT];
      
      // Initialize the array values
      for (int index = 0; index < LIMIT; index++)
          
         list[index] = index * MULTIPLE;
      
      
      list[3] = 9999;
      
      for (int value : list)
          
         System.out.print (value + " ");
    } 
}