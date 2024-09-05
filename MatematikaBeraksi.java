/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.matematika;

/**
 *
 * @author meryl
 */
public class MatematikaBeraksi {
    public static void main(String[]args){
         Matematika jumlah = new Matematika (20, 30);
        jumlah.pertambahan();
        
        Matematika substract = new Matematika (10, 5);
        substract.pengurangan();
        
        Matematika multiply = new Matematika (10, 3);
        multiply.perkalian();
        
        Matematika divide = new Matematika (21, 2);
        divide.pembagian();
    }
}
