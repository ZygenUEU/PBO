/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPert_10;

/**
 *
 * @author GESIT
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean ulang = true;
        int pil;
        while(ulang == true){
            System.out.println("Pilih bangun datar");
            System.out.println("1.  Segitiga");
            System.out.println("2.  Persegi Panjang");
            System.out.println("0.  Keluar");
            System.out.print("Pilihan : ");
            Scanner myObj = new Scanner(System.in);
            pil = myObj.nextInt();
            
            if(pil == 1){
                double num1, num2;
                System.out.print("Masukan angka alas : ");
                num1 = myObj.nextDouble();
                System.out.print("Masukan angka tinggi : ");
                num2 = myObj.nextDouble();
                Segitiga segitiga = new Segitiga(num1, num2);
                segitiga.HasilSegitiga();
            }
            else if(pil == 2){
                double num1, num2;
                System.out.print("Masukan angka alas : ");
                num1 = myObj.nextDouble();
                System.out.print("Masukan angka tinggi : ");
                num2 = myObj.nextDouble();
                PersegiPanjang persegi_panjang = new PersegiPanjang(num1, num2);
                persegi_panjang.HasilPersegiPanjajng();
            }
            else{
                break;
            }
        }
    }
}
