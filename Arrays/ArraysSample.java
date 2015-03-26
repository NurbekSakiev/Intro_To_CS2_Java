/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayssample;


public class ArraysSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] myIntArray1 = new int[3];
        
        int[] myIntArray2 = {1,2,3};
        
        int[] myIntArray3 = new int[]{1,2,3};

        String[] myStringArray1 = new String[3];
        
        String[] myStringArray2 = {"a","b","c"};
        
        String[] myStringArray3 = new String[]{"a","b","c"};
        
        int length2 = myIntArray2.length;
        
        System.out.println("The length of myIntArray2 is " + length2);
        
    }
    
}
