/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPert_10;

/**
 *
 * @author GESIT
 */
public class PersegiPanjang extends BangunDatar {
    
    private double hasil;
    
    PersegiPanjang(double num1x, double num2x){
        super(num1x, num2x);
        hasil = num1x * num2x;
    }
    
    public void HasilPersegiPanjajng(){
        System.out.println("Luas Segitiga : " + hasil);
    }
    
}
