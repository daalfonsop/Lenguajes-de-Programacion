/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author walter
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positives = 0;
        double avg=0;
        for (int i = 0; i < 6; i++) {
            double a=sc.nextDouble();
            if(a>0){
                positives++;
                avg+=a;
            }
        }
        System.out.println(positives+" valores positivos \n"+String.format("%.1f",avg/positives));
    }
    
}
