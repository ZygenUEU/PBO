/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPert_10;

/**
 *
 * @author GESIT
 */
public class Segitiga extends BangunDatar {
    private double hasil;
    
    Segitiga(double num1x, double num2x){
        super(num1x, num2x);
        hasil = 0.5 * num1 * num2;
    }
    
    public void HasilSegitiga(){
        System.out.println("Luas Segitiga : " + hasil);
    }
}
