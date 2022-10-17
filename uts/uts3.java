// created by 21343022_Ella Dwipujana Asyani
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package uts;

import javax.swing.JOptionPane;
/**
 *
 * @author Ella Dwipujana Asyani
 */
public class uts3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String bil;
      int Angka ;  
      
        bil = JOptionPane.showInputDialog("Masukan Bilangan : ");
        
        Angka = Integer.parseInt(bil);
        
        if(Angka >= 0){
            JOptionPane.showMessageDialog(null,"Angka " +Angka+  " \nMerupakan Bilangan Positif");
        }
        else{
            JOptionPane.showMessageDialog(null,"Angka " +Angka+ " \nMerupakan Bilangan Negatif ");
        }               
}
}
