/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaiMax;

/**
 *
 * @author Axce29
 */
public class nilaiMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numb1 = 10, numb2 = 23, numb3 = 5;
        int max;
        max = (numb1 >= numb2)? numb1 : numb2;
        max = (numb3 >= max)? numb3 : max;
        
        System.out.println("number 1 = " + numb1);
        System.out.println("number 2 = " + numb2);
        System.out.println("number 3 = " + numb3);
        
        System.out.println("Nilai tertingginya adalah angka " + max);
    }
    
}
