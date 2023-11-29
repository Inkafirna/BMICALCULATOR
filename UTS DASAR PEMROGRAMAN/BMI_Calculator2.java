/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi_calculator;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class BMI_Calculator2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("BMI CALCULATOR");
        System.out.println("............................................");
        System.out.print("Masukan Berat Badan: ");
        double berat = sc.nextDouble();
        System.out.print("Masukan Tinggi Badan: ");
        double tinggi = sc.nextDouble();
        double BMI = berat / (tinggi * tinggi);
        System.out.println("............................................");
        System.out.print("Body Mass Index (BMI) = " + BMI + " kg/m2");
   }
}

    
