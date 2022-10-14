// created by 21343022_Ella Dwipujana Asyani
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package uts;

import java.util.Scanner;
/**
 *
 * @author Ella Dwipujana Asyani
 */
public class uts2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int n =5;
        for (int i = 1; i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (int j=i; j<n; j++){
                System.out.print("#");
            }
            for(int j=i; j<=n; j++){
                System.out.print("#");
            }
            System.out.println();
        }
        for (int i = 1; i<=n; i++){
            for (int j=i; j<=n; j++){
                System.out.print(" ");
            }
            for (int j=1; j<i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
}
}
