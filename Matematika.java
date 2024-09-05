/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package test.matematika;

/**
 *
 * @author meryl
 */
public class Matematika implements InterfaceMatematika {
    int a,b;

//konstruktor
public Matematika (int a, int b){
     this.a = a;
     this.b = b;
 }
public int tambah(){
    int hasil = a+b;
    return hasil;
    }
public int kurang(){
    int hasil = a-b;
    return hasil;
}
public int kali(){
    int hasil = a*b;
    return hasil;
}
public double bagi(){
    int hasil = a/b;
    return hasil;
}
 
 
 public void pertambahan(){
     System.out.println("Pertambahan: " + a + " + " + b + " = " + tambah());
}
 
  public void pengurangan(){
     System.out.println("Penguranga: " + a + " - " + b + " = " + kurang());
}
   public void perkalian(){
     System.out.println("Perkalian: " + a + " * " + b + " = " + kali());
}
    public void pembagian(){
     System.out.println("Pembagian: " + a + " / " + b + " = " + bagi());
}
}

