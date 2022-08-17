/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.aulasas;

/**
 *
 * @author david.aosantos1
 */
public class BatalhaTanques {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tanque tanque = new Tanque();
        tanque.setCorTanque(CoresRGB.BLUE);
        tanque.setCorCanhao(CoresRGB.RED);
        tanque.setX(1.3F); // PRECISA COLOCAR UM F , POIS POR PADRAO A JVM ENTENDE 1.3 OU 1.4 COMO TIPO DOUBLE
        tanque.setY(3.3F); 
        
        System.out.println("Tanque: " + tanque.getCorTanque());
        System.out.println("Canhão: " + tanque.getCorCanhao());
    }
    
}
